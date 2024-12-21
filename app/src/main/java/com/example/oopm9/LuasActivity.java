package com.example.oopm9;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LuasActivity extends AppCompatActivity {

    private double setengah=0.5, luaslingkaran, luassegitiga;

    private int luas;

    private TextView displayTextView;

    private EditText panjang, lebar;

    private Button submitButton, persegiButton, segitigaButton, lingkaranButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luasbidang);

        displayTextView = findViewById(R.id.displayTextView);
        panjang = findViewById(R.id.inputPanjang);
        lebar = findViewById(R.id.inputLebar);
        persegiButton = findViewById(R.id.persegiButton);
        segitigaButton = findViewById(R.id.segitigaButton);
        lingkaranButton = findViewById(R.id.lingkaranButton);

        persegiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int p = Integer.parseInt(panjang.getText().toString());
                int l = Integer.parseInt(lebar.getText().toString());
                luas = p*l;
                displayTextView.setText("Luas persegi ini adalah "+luas);
            }
        });

        segitigaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int p = Integer.parseInt(panjang.getText().toString());
                int l = Integer.parseInt(lebar.getText().toString());
                luassegitiga = setengah*p*l;
                displayTextView.setText("Luas Segitiga ini adalah "+ luassegitiga);
            }
        });

        lingkaranButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int p = Integer.parseInt(panjang.getText().toString());
                luaslingkaran = Math.PI*p*p;
                displayTextView.setText("Luas lingkaran ini adalah "+luaslingkaran);
            }
        });
    }
}
