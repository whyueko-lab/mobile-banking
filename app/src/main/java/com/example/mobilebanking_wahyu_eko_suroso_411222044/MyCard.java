package com.example.mobilebanking_wahyu_eko_suroso_411222044;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.oopm9.R;

public class MyCard extends AppCompatActivity {

    Button home, statistik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mycard);

        // Hubungkan tombol Home dari layout
        home = findViewById(R.id.homeBtn);
        statistik = findViewById(R.id.statistikBtn);

        // Logika tombol Home
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyCard.this, MainActivity.class);
                startActivity(intent);
                finish(); // Tutup MyCard agar tidak menumpuk di back stack
            }
        });
        statistik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyCard.this, Statistik.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
