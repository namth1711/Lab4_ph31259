package com.example.lab4_ph31259;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bai1 extends AppCompatActivity {

    Button btnGo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);
        btnGo = findViewById(R.id.btnGoToBai1B);

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Bai1.this, Bai1_2.class);
                startActivity(i);
            }
        });
    }
}