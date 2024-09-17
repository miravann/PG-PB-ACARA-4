package com.example.registeractivity;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    private TextView welcomeMessage;
    private TextView emailMessage;
    private TextView phoneMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        welcomeMessage = findViewById(R.id.welcomeMessage);
        emailMessage = findViewById(R.id.emailMessage);
        phoneMessage = findViewById(R.id.phoneMessage);

        // Get username, email, and phone from intent
        String username = getIntent().getStringExtra("username");
        String email = getIntent().getStringExtra("email");
        String phone = getIntent().getStringExtra("phone");

        welcomeMessage.setText("Welcome " + username);
        emailMessage.setText("Your " + email + " has been activated");
        phoneMessage.setText("Your " + phone + " has been registered");
    }
}