package com.example.oopm9;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ConstructorActivity extends AppCompatActivity {

    private double a = 100;

    private TextView displayTextView;

    private EditText inputEditText;

    private Button submitButton;

    public ConstructorActivity(){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constructor);

        displayTextView = findViewById(R.id.displayTextView);
        inputEditText = findViewById(R.id.inputEditText);
        submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = inputEditText.getText().toString();
                displayTextView.setText(inputText+" "+a);
            }
        });
    }

    @Override
    protected void onDestroy() {  }


}
