package com.example.app_jarkom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_tujuan = findViewById(R.id.tujuan);
        Button btn_pemantik = findViewById(R.id.pemantik);
        Button btn_konsep = findViewById(R.id.konsep);
        Button btn_apersepsi = findViewById(R.id.apersepsi);
        Button btn_kunci = findViewById(R.id.kunci);
        Button btn_materi = findViewById(R.id.materi);
        Button btn_tentang = findViewById(R.id.tentang);

        btn_tujuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent_tujuan = new Intent(MainActivity.this, tujuan_activity.class);
                startActivity(intent_tujuan);
            }
        });
        btn_pemantik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_pemantik = new Intent(MainActivity.this, pemantik_activity.class);
                startActivity(intent_pemantik);
            }
        });
        btn_konsep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_konsep = new Intent(MainActivity.this, petakonsep_activity.class);
                startActivity(intent_konsep);
            }
        });
        btn_apersepsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_apersepsi = new Intent(MainActivity.this, apersepsi_activity.class);
                startActivity(intent_apersepsi);
            }
        });
        btn_kunci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_kunci = new Intent(MainActivity.this, kkunci_activity.class);
                startActivity(intent_kunci);
            }
        });
        btn_materi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent_materi = new Intent(MainActivity.this, materi_activity.class);
                startActivity(intent_materi);
            }
        });
        btn_tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_tentang = new Intent(MainActivity.this, tentang_activity.class);
                startActivity(intent_tentang);
            }
        });
    }
}