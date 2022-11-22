package com.example.app_jarkom;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class tentang_activity extends AppCompatActivity {

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tentang);
        getSupportActionBar().setTitle("Tentang Aplikasi");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
}