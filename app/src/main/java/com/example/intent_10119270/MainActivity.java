package com.example.intent_10119270;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Profile(View view) {
        Intent prof = new Intent(MainActivity.this, ProfileActivity.class);
        startActivity(prof);
    }
    public void Logout(View view) {
        Intent out = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(out);
    }
}
