package com.example.starwarsfashionapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ShapeableImageView ShapeableImageView;
    TextView nameView,priceView,outletView,qtyView;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        ShapeableImageView = itemView.findViewById(R.id.history_status);
        nameView = itemView.findViewById(R.id.history_titlerel);
        priceView = itemView.findViewById(R.id.history_price);
        outletView = itemView.findViewById(R.id.history_outlet);

    }
}