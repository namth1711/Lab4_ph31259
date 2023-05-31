package com.example.lab4_ph31259;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Bai4 extends AppCompatActivity {

    EditText txtnbphone ;
    Button btnGoi ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4);

        txtnbphone = findViewById(R.id.txtMBPhone);
        btnGoi = findViewById(R.id.btnGoi);

        btnGoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String so =    txtnbphone.getText().toString().trim();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+so));
                startActivity(intent);
            }
        });
    }
}