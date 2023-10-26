package com.claudio.aulaii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvLogin = findViewById(R.id.tvLogin);

        Intent intent = getIntent();
        String loginReceived = intent.getStringExtra("KEY_EMAIL");
        int numberReceived = intent.getIntExtra("KEY_NUMBER", 0);
        tvLogin.setText("Email: " + loginReceived);

        System.out.println("KEY_NUMBER: " + numberReceived);
    }
}