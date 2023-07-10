package com.example.starwarsfashionapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class history extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) RecyclerView recyclerView = findViewById(R.id.recycler_purchase);

        List<item> items = new ArrayList<>();
        items.add(new item("Remnant Yavin Consular Armor Set","Rajawali Outlet","Rp900.000,00","QTY:1",R.drawable.paid));
        items.add(new item("Remnant Underworld Knight Armor Set","Rajawali Outlet","Rp1.900.000,00","QTY:1",R.drawable.paid));
        items.add(new item("Karness Muur's Armor Set","Rajawali Outlet","Rp1.200.000,00","QTY:1",R.drawable.paid));
        items.add(new item("Satele Shan’s Armor Set","Kebon Jati Outlet","Rp2.000.000,00","QTY:1",R.drawable.paid));
        items.add(new item("Force Apprentice’s Armor Set","Simpang Outlet","Rp7.000.000,00","QTY:2",R.drawable.paid));




        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new historyAdapter(getApplicationContext(),items));

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setSelectedItemId(R.id.nav_history);
        bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if (itemId == R.id.nav_history) {
                return true;
            } else if (itemId == R.id.nav_home) {
                startActivity(new Intent(getApplicationContext(), Home.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                return true;
            } else if (itemId == R.id.nav_outlets) {
                startActivity(new Intent(getApplicationContext(), outlets.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                return true;
            } else if (itemId == R.id.nav_product) {
                startActivity(new Intent(getApplicationContext(), products.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                return true;
            }
            return false;
        });
    }
}