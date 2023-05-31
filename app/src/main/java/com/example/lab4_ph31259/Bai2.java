package com.example.lab4_ph31259;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Bai2 extends AppCompatActivity {

    ActivityResultLauncher<Intent> getQuote = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {

                    if (result.getResultCode() == 1 ){

                        Intent intent  = result.getData();

                        if (intent != null){

                            Bundle bundle =  intent.getExtras();
                            String priceQueto = bundle.getString("priceQuote");
                            tvGia.setText(priceQueto+" VND");
                        }

                    }
                }
            } );
    EditText txtSanPham ;
    Button btnGui ;
    TextView tvGia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);

        txtSanPham = findViewById(R.id.txtSanPham);
        btnGui = findViewById(R.id.btnGui);
        tvGia = findViewById(R.id.tvTien);

        btnGui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sanPham = txtSanPham.getText().toString() ;

                Intent i = new Intent(Bai2.this , Bai2_2.class);
                i.putExtra("name" , sanPham);

                getQuote.launch(i);
            }
        });
    }
}