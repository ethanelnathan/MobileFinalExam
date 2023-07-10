package com.example.starwarsfashionapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class recyclerview_layout extends RecyclerView.ViewHolder {
    TextView nameView,pricetitle,outletstitle,hisqty;

    public recyclerview_layout(@NonNull View itemView) {
        super(itemView);
        nameView = itemView.findViewById(R.id.history_titlerel);
        pricetitle = itemView.findViewById(R.id.history_price);
        outletstitle = itemView.findViewById(R.id.history_outlet);
        hisqty = itemView.findViewById(R.id.history_outlet);
    }
}