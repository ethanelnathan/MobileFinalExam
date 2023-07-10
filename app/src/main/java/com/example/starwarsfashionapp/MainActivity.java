package com.example.starwarsfashionapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setSelectedItemId(R.id.nav_home);
        bottomNavigationView.setOnItemSelectedListener(item -> {
        int itemId = item.getItemId();
        if (itemId == R.id.nav_home) {
            return true;
        } else if (itemId == R.id.nav_history) {
            startActivity(new Intent(getApplicationContext(), history.class));
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