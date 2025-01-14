package com.example.mobilebanking_wahyu_eko_suroso_411222044;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.oopm9.R;

public class MainActivity extends AppCompatActivity {

    Button home, mycardBtn, statistik, setting, logoutBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  // Pastikan layout ini sesuai dengan XML Anda

        // Menghubungkan tombol-tombol dari layout XML
        home = findViewById(R.id.homeBtn);
        mycardBtn = findViewById(R.id.mycardBtn);
        statistik = findViewById(R.id.statistikBtn);
        setting = findViewById(R.id.settingBtn);
        logoutBtn = findViewById(R.id.logoutBtn);

        // Set listener untuk tombol Home
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);  // Ganti dengan class tujuan yang benar
                intent.putExtra("KEY_NAME", "Hello from MainActivity!");
                startActivity(intent);
            }
        });
        // Tombol MyCard
        mycardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MyCard.class);
                startActivity(intent);
            }
        });
        // Tombol Statistik
        statistik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Statistik.class);
                startActivity(intent);
            }
        });
        // Tombol Setting
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Setting.class);
                startActivity(intent);
            }
        });
        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Login.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish(); // Tutup MainActivity
            }
        });
    }
}
