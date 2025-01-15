package com.example.mobilebanking_wahyu_eko_suroso_411222044;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.oopm9.R;

public class Statistik extends AppCompatActivity {

    Button home, myCardBtn, setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistik); // Pastikan layout benar

        // Hubungkan tombol Home dari layout
        home = findViewById(R.id.homeBtn);
        myCardBtn = findViewById(R.id.mycardBtn);
        setting = findViewById(R.id.settingBtn);

        // Logika tombol Home
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Statistik.this, MainActivity.class);
                startActivity(intent);
                finish(); // Tutup Statistik agar tidak menumpuk di back stack
            }
        });

        // Logika tombol MyCard
        myCardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pastikan Anda menggunakan intent yang benar untuk berpindah ke MyCard
                Intent intent = new Intent(Statistik.this, MyCard.class);
                startActivity(intent); // Menjalankan aktivitas MyCard
                finish(); // Tutup Statistik agar tidak menumpuk di back stack
            }
        });
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pastikan Anda menggunakan intent yang benar untuk berpindah ke MyCard
                Intent intent = new Intent(Statistik.this, Setting.class);
                startActivity(intent); // Menjalankan aktivitas MyCard
                finish(); // Tutup Statistik agar tidak menumpuk di back stack
            }
        });
    }
}
