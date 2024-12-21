package com.example.oopm9;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Matematika extends AppCompatActivity {

    EditText inputSisi, inputJariJari, inputTinggi;

    TextView hasilLuasPersegi, hasilVolumeKerucut;

    Button hitungLuas, hitungVolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.matematika);

        inputSisi = findViewById(R.id.inputSisi);
        inputJariJari = findViewById(R.id.inputJariJari);
        inputTinggi = findViewById(R.id.inputTinggi);
        hasilLuasPersegi = findViewById(R.id.hasilLuasPersegi);
        hasilVolumeKerucut = findViewById(R.id.hasilVolumeKerucut);
        hitungLuas = findViewById(R.id.hitungLuas);
        hitungVolume = findViewById(R.id.hitungVolume);

        hitungLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double sisi = Double.parseDouble(inputSisi.getText().toString());
                double luasPersegi = Math.pow(sisi, 2);
                hasilLuasPersegi.setText("Luas Persegi: "+ luasPersegi);
            }
        });

        hitungVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double jariJari = Double.parseDouble(inputJariJari.getText().toString());
                double tinggi = Double.parseDouble(inputTinggi.getText().toString());
                double volumekerucut = (1.0 / 3) * Math.PI * Math.pow(jariJari, 2) * tinggi;
                hasilVolumeKerucut.setText("Volume Kerucut: "+ volumekerucut);
            }
        });
    }
}
