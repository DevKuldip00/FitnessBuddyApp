package com.kddada.fitnessbuddy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.time.temporal.Temporal;
import java.util.ArrayList;

public class OverWeightAdapter extends RecyclerView.Adapter<OverWeightAdapter.ViewHolder> {
    ArrayList<ContactModel> Overweight;
    Context context;
    public OverWeightAdapter(ArrayList<ContactModel> Overweight, Context context)
    {
        this.Overweight=Overweight;
        this.context=context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_raw,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtTips.setText(Overweight.get(position).tips);
        holder.ImgView.setImageResource(Overweight.get(position).image);

    }

    @Override
    public int getItemCount() {
        return Overweight.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView ImgView;
        TextView txtTips;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTips=itemView.findViewById(R.id.txtTips);
            ImgView=itemView.findViewById(R.id.ImgView);
        }
    }
}
