package com.example.lab4_ph31259;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Bai3_2 extends AppCompatActivity {

    EditText txtUser , txtPass , txtConfirm ;
    Button btnDangKi ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai32);

        txtUser = findViewById(R.id.txtUserRg);
        txtPass = findViewById(R.id.txtPassRG);
        txtConfirm = findViewById(R.id.txtCheckPassRG);
        btnDangKi = findViewById(R.id.btnDK);

        btnDangKi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = txtUser.getText().toString();
                String pass = txtPass.getText().toString();
                String confirm = txtConfirm.getText().toString();

                if (pass.equals(confirm)){
                    Toast.makeText(Bai3_2.this, "Đăng ký thành công", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Bai3_2.this,Bai3.class);
                    Bundle bundle = new Bundle();

                    bundle.putString("user",user);
                    bundle.putString("pass",pass);

                    intent.putExtras(bundle);

                    startActivity(intent);

                }else {
                    Toast.makeText(Bai3_2.this, "Đăng ký thất bại", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}