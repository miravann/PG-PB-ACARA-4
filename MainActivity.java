package com.example.registeractivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText username, email, phone, password;
    private Button registerButton;
    private CheckBox termsCheckbox;
    private TextView loginLink;  // Deklarasi TextView untuk tautan login

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Menghubungkan EditText, Button, CheckBox, dan TextView dengan ID yang sesuai
        username = findViewById(R.id.username);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        password = findViewById(R.id.password);
        registerButton = findViewById(R.id.registerButton);
        termsCheckbox = findViewById(R.id.termsCheckbox);
        loginLink = findViewById(R.id.loginLink);  // Menghubungkan TextView untuk tautan login

        registerButton.setOnClickListener(v -> {
            if (!termsCheckbox.isChecked()) {
                Toast.makeText(MainActivity.this, "Please agree to the terms.", Toast.LENGTH_SHORT).show();
                return;
            }
            // Logic untuk registrasi
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("username", username.getText().toString());
            intent.putExtra("email", email.getText().toString());
            intent.putExtra("phone", phone.getText().toString());
            startActivity(intent);
            finish();
        });

        // Menangani klik pada tautan login
        loginLink.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MainActivity3.class);
            startActivity(intent);
        });
    }
}