package com.example.registeractivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    private EditText username, password;
    private Button loginButton;
    private CheckBox rememberMe;  // Deklarasi CheckBox

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);
        rememberMe = findViewById(R.id.rememberMe);  // Menghubungkan CheckBox

        loginButton.setOnClickListener(v -> {
            // Logic for login
            Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
            intent.putExtra("username", username.getText().toString());
            startActivity(intent);
            finish();
        });
    }
}