package com.example.lab4_ph31259;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Bai3 extends AppCompatActivity {
    Button btnDangki, btnDangNhap ;
    EditText txtUser , txtPass ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);

        txtUser = findViewById(R.id.txtUser);
        txtPass = findViewById(R.id.txtPass);

        btnDangki = findViewById(R.id.btnDangKi);
        btnDangNhap =findViewById(R.id.btnDangNhap);

        btnDangki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Bai3.this , Bai3_2.class);
                startActivity(intent);

            }
        });



        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = getIntent();
                Bundle bundle = i.getExtras();

                if(bundle!=null){
                    String username = bundle.getString("user");

                    String pass = bundle.getString("pass");

                    boolean u = username.equals(txtUser.getText().toString().trim());
                    boolean p = pass.equals(txtPass.getText().toString().trim());

                    if (u&&p){
                        Toast.makeText(Bai3.this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
                    }else {
                        Toast.makeText(Bai3.this, "Đăng nhập thất bại", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(Bai3.this, "Đăng nhập thất bại", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}