package com.example.intent_10119270;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void Login(View view) {
        Intent log = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(log);
    }

    public void Register(View view) {
        Intent reg = new Intent(LoginActivity.this, RegisterActivity.class);
        startActivity(reg);
    }
}