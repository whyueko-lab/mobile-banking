package com.example.mobilebanking_wahyu_eko_suroso_411222044;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.oopm9.R;

public class Setting extends AppCompatActivity {

    Button home, myCardBtn, statistik, logoutBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting); // Pastikan layout benar

        // Hubungkan tombol Home dari layout
        home = findViewById(R.id.homeBtn);
        myCardBtn = findViewById(R.id.mycardBtn);
        statistik = findViewById(R.id.statistikBtn);
        logoutBtn = findViewById(R.id.logoutBtn);


        // Logika tombol Home
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Setting.this, MainActivity.class);
                startActivity(intent);
                finish(); // Tutup Statistik agar tidak menumpuk di back stack
            }
        });
        // Logika tombol MyCard
        myCardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Setting.this, MyCard.class);
                startActivity(intent); // Menjalankan aktivitas MyCard
                finish(); // Tutup Statistik agar tidak menumpuk di back stack
            }
        });
        statistik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Setting.this, Statistik.class);
                startActivity(intent); // Menjalankan aktivitas MyCard
                finish(); // Tutup Statistik agar tidak menumpuk di back stack
            }
        });
        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk kembali ke halaman login
                Intent intent = new Intent(Setting.this, Login.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK); // Clear back stack dan set activity baru
                startActivity(intent);
                finish(); // Tutup activity Setting agar tidak ada di back stack
            }
        });
    }
}
