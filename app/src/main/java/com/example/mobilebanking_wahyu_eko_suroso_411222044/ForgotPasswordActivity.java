package com.example.mobilebanking_wahyu_eko_suroso_411222044;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.oopm9.R;


public class ForgotPasswordActivity extends AppCompatActivity {

    Button forgotPasswordButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        // Mengambil referensi tombol submit
        forgotPasswordButton = findViewById(R.id.submitBtn);

        // Menambahkan listener klik pada tombol submit
        forgotPasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk kembali ke MainActivity
                Intent intent = new Intent(ForgotPasswordActivity.this, Login.class);
                startActivity(intent);
                finish();  // Menutup ForgotPasswordActivity agar tidak bisa kembali ke activity ini dengan tombol back
            }
        });
    }
}
