package com.claudio.aulaii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private Button btLogin;
    private EditText etLogin, etPassword;

    private String LOGIN = "claudio.matos@gmail.com";
    private String PASSWORD = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Conectando a minha classe Java ao XML do layout
        setContentView(R.layout.activity_login);

        // Conectando a minha classa Java aos componentes do XML do layout
        etLogin = findViewById(R.id.etLogin);
        etPassword = findViewById(R.id.etPassword);
        btLogin = findViewById(R.id.btLogin);

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputLogin = etLogin.getText().toString().trim();
                String inputPassword = etPassword.getText().toString().trim();

                if(inputLogin.equals(LOGIN) && inputPassword.equals(PASSWORD)) {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    intent.putExtra("KEY_EMAIL", inputLogin);
                    intent.putExtra("KEY_NUMBER", 123);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(LoginActivity.this, "Credenciais inválidas", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}