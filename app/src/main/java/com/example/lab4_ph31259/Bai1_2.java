package com.example.lab4_ph31259;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bai1_2 extends AppCompatActivity {
    Button btnGo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai12);
        btnGo = findViewById(R.id.btnBackBai1);

        btnGo.setOnClickListener(v -> {
            Intent i = new Intent(Bai1_2.this, Bai1.class);
            startActivity(i);
        });
    }
}