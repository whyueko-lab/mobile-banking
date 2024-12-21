package com.example.oopm9;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button intent, math, decision, login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        intent = findViewById(R.id.btnIntent);
        math = findViewById(R.id.btnMath);
        decision = findViewById(R.id.btnDec);
        login = findViewById(R.id.btnLog);

        intent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LuasActivity.class);
                intent.putExtra("KEY_NAME", "Hello from MainActivity!");
                startActivity(intent);
            }
        });

        math.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Matematika.class);
                startActivity(intent);
            }
        });

        decision.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Decision.class);
                startActivity(intent);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Login.class);
                startActivity(intent);
            }
        });
    }
}