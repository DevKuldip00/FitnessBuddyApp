package com.kddada.fitnessbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BMI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bmi);
        TextView txtResult;
        EditText edtWeight;
        EditText edtFt;
        EditText edtIn;
        Button btnCalculate;
        LinearLayout LLMain;
        Button btnTips;

        txtResult = findViewById(R.id.txtResult);
        edtWeight = findViewById(R.id.edtWeight);
        edtFt = findViewById(R.id.edtFt);
        edtIn = findViewById(R.id.edtIn);
        btnCalculate = findViewById(R.id.btnCalculate);
        LLMain=findViewById(R.id.LLMain);
        btnTips=findViewById(R.id.btnTips);


        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double weight = Double.parseDouble(edtWeight.getText().toString());
                double feet = Double.parseDouble(edtFt.getText().toString());
                double inches = Double.parseDouble(edtIn.getText().toString());
                double totalInches = (feet * 12) + inches;
                double totalCm = totalInches * 2.54;
                double totalM = totalCm / 100;
                double bmi = weight / (totalM * totalM);

                String category="";
                if(bmi > 25)
                {

                    txtResult.setText("Overweight");
                    LLMain.setBackgroundColor(getResources().getColor(R.color.overweight));
                }
                else if(bmi < 18.5)
                {

                    txtResult.setText("Underweight");
                    LLMain.setBackgroundColor(getResources().getColor(R.color.underweight));
                }
                else
                {

                    txtResult.setText("Healthy");
                    LLMain.setBackgroundColor(getResources().getColor(R.color.healthy));
                }





            }

        });
        btnTips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double weight = Double.parseDouble(edtWeight.getText().toString());
                double feet = Double.parseDouble(edtFt.getText().toString());
                double inches = Double.parseDouble(edtIn.getText().toString());
                double totalInches = (feet * 12) + inches;
                double totalCm = totalInches * 2.54;
                double totalM = totalCm / 100;
                double bmi = weight / (totalM * totalM);
                String category="";

                if(bmi > 25)
                {
                  category="Overweight";

                }
                else if(bmi < 18.5)
                {

                    category="Underweight";
                }
                else
                {

                    category="Healthy";
                }
                Intent intTips=new Intent(BMI.this,Tips.class);
                intTips.putExtra("category",category);
                startActivity(intTips);

            }
        });







    }
}