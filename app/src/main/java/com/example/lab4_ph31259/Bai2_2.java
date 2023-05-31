package com.example.lab4_ph31259;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Bai2_2 extends AppCompatActivity {
    TextView tvTensp  ;
    EditText txtGia ;
    Button btnBaoGia ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai22);

        tvTensp = findViewById(R.id.tvSanPham);
        txtGia = findViewById(R.id.txtNhapGia);
        btnBaoGia = findViewById(R.id.btnBaoGia);


        Intent intent = getIntent();
        String gia = intent.getStringExtra("name");
        tvTensp.setText(gia);


        btnBaoGia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String priceQuote = txtGia.getText().toString();
                Intent intent = new Intent();
                Bundle bundle = new Bundle();

                bundle.putString("priceQuote",priceQuote);

                intent.putExtras(bundle);
                setResult(1,intent);

                finish();


            }
        });

    }
}