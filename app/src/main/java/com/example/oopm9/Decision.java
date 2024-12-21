package com.example.oopm9;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class Decision extends AppCompatActivity {

    EditText inputHarga, inputDiskon;

    TextView hasil;

    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.decision);

        inputHarga = findViewById(R.id.inputHarga);
        inputDiskon = findViewById(R.id.inputDiskon);
        hasil = findViewById(R.id.hasil);
        btnHitung = findViewById(R.id.btnHitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int harga = Integer.parseInt(inputHarga.getText().toString());
                int diskon = Integer.parseInt(inputDiskon.getText().toString());

                int hargaAkhir;
                if (diskon > 0) {
                    hargaAkhir = harga - (harga * diskon / 100);
                } else {
                    hargaAkhir = harga;
                }

                hasil.setText("Harga Akhir : "+hargaAkhir);
            }
        });
    }
}
