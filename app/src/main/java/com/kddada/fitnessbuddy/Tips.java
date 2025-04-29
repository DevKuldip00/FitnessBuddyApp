package com.kddada.fitnessbuddy;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Tips extends AppCompatActivity {
    RecyclerView recyclerView;
    String category="";
    ArrayList<ContactModel> Overweight=new ArrayList<>();
    ArrayList<ContactModel> Underweight=new ArrayList<>();
    ArrayList<ContactModel> Healthy=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tips);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Overweight.add(new ContactModel("Set small, realistic weight loss goals.",R.drawable.dumble));
        Overweight.add(new ContactModel("Eat more vegetables and fruits.",R.drawable.veg1));
        Overweight.add(new ContactModel("Cut down on sugary drinks.",R.drawable.drink1));
        Overweight.add(new ContactModel("Control your portion sizes.",R.drawable.dumble));
        Overweight.add(new ContactModel("Exercise at least 30 minutes daily.",R.drawable.dumble));
        Overweight.add(new ContactModel("Focus on protein and fiber-rich foods.",R.drawable.food));
        Overweight.add(new ContactModel("Limit fast food and processed snacks.",R.drawable.food));
        Overweight.add(new ContactModel("Get at least 7-8 hours of sleep.",R.drawable.sleep));
        Overweight.add(new ContactModel("Stay consistent, not perfect.",R.drawable.dumble));
        Overweight.add(new ContactModel("Track your food and exercise daily.",R.drawable.dumble));


        Underweight.add(new ContactModel("Eat 5-6 Smaller Meals A Day",R.drawable.food));
        Underweight.add(new ContactModel("Choose nutrient-rich whole foods.",R.drawable.food));
        Underweight.add(new ContactModel("Include calorie-dense foods like nuts, avocados, cheese.", R.drawable.food));
        Underweight.add(new ContactModel("Drink healthy smoothies and shakes.",R.drawable.drink1));
        Underweight.add(new ContactModel("Focus on strength training exercises.",R.drawable.dumble));
        Underweight.add(new ContactModel("Avoid junk food with empty calories.",R.drawable.food));
        Underweight.add(new ContactModel("Track your weight and muscle gain.",R.drawable.dumble));
        Underweight.add(new ContactModel("Consult a dietitian if needed.",R.drawable.food));


        Healthy.add(new ContactModel("Maintain a balanced diet with fruits and vegetables.",R.drawable.veg1));
        Healthy.add(new ContactModel("Exercise at least 150 minutes per week.",R.drawable.dumble));
        Healthy.add(new ContactModel("Stay hydrated with at least 8 glasses of water daily.",R.drawable.water));
        Healthy.add(new ContactModel("Avoid excessive sugar and unhealthy fats.",R.drawable.food));
        Healthy.add(new ContactModel("Sleep 7-9 hours every night for full recovery.",R.drawable.sleep));
        Healthy.add(new ContactModel("Manage stress through hobbies, yoga, or meditation.",R.drawable.meditation));
        Healthy.add(new ContactModel("Get regular health checkups even if you feel fine.",R.drawable.health));
        Healthy.add(new ContactModel("Eat slowly and mindfully.",R.drawable.food));
        Healthy.add(new ContactModel("Limit alcohol and avoid smoking.",R.drawable.alc));
        Healthy.add(new ContactModel("Set and achieve new fitness goals to stay motivated.",R.drawable.dumble));


        category=getIntent().getStringExtra("category");
        if(category.equals("Overweight"))
        {
            OverWeightAdapter adapter1=new OverWeightAdapter(Overweight,this);
            recyclerView.setAdapter(adapter1);
        } else if (category.equals("Underweight"))
        {
         TipsAdapter adapter2=new TipsAdapter(Underweight,this);
         recyclerView.setAdapter(adapter2);

        }
        else
        {
            HealthyAdapter adapter3=new HealthyAdapter(Healthy,this);
            recyclerView.setAdapter(adapter3);
        }

    }
}