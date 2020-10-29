package com.example.systemstrength;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    private static int TIME_SPLASH = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent irparateladelogin = new Intent(MainActivity.this,LoginActivity.class);
                finish();
                startActivity(irparateladelogin);
            }
        },TIME_SPLASH);
    }
}