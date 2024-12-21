package com.example.oopm9;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {


    private EditText usernameEditText, passwordEditText;

    private Button loginButton;

    Intent intentInt;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.login);

        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleLogin();
            }
        });
    }

    private void handleLogin() {
        String username = usernameEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        try {
            validateCredentials(username, password);
            Toast.makeText(this, "Login Berhasil", Toast.LENGTH_SHORT).show();
        } catch (InvalidCredentialsException e) {
            Toast.makeText(Login.this, e.getMessage(), Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            Toast.makeText(this, "Terjadi Kesalahan:" + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    private void validateCredentials(String username, String password) throws InvalidCredentialsException {
        if (username.isEmpty() || password.isEmpty()) {
            throw new InvalidCredentialsException("Username atau Password tidak boleh kosong!");
        }
        if (!username.equals("admin") || !password.equals("12345")) {
            throw new InvalidCredentialsException("Username atau Password salah!");
        }
    }
}
