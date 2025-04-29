package com.kddada.fitnessbuddy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HealthyAdapter extends RecyclerView.Adapter<HealthyAdapter.ViewHolder> {
    ArrayList<ContactModel> Healthy;
    Context context;
    public HealthyAdapter(ArrayList<ContactModel> Healthy,Context context)
    {
        this.Healthy=Healthy;
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
        holder.txtTips.setText(Healthy.get(position).tips);
        holder.ImgView.setImageResource(Healthy.get(position).image);

    }

    @Override
    public int getItemCount() {
        return Healthy.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
       TextView txtTips;
       ImageView ImgView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTips=itemView.findViewById(R.id.txtTips);
            ImgView=itemView.findViewById(R.id.ImgView);
        }
    }
}
