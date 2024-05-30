package com.example.banhang;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TrangChuActivity extends AppCompatActivity {
    //khai bao id
    Button btnthemsuaHTtt,btnxoaHTtt,btnthemsuaBHtt,btnxoaBHtt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_trang_chu);
        //anh xa id
        btnthemsuaHTtt = findViewById(R.id.btnthemsuaHTtt);
        btnxoaHTtt = findViewById(R.id.btnxoaHTtt);
        btnthemsuaBHtt = findViewById(R.id.btnthemsuaBHtt);
        btnxoaBHtt = findViewById(R.id.btnxoaBHtt);

        //xu ly click btn them sua hang ton
    btnthemsuaHTtt.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intentTrangchu = new Intent(TrangChuActivity.this, ThemHangTonActivity.class);
            startActivity(intentTrangchu);
            }
        });

        //xu ly click btn xoa hang ton
        btnxoaHTtt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTrangchu1 = new Intent(TrangChuActivity.this, XoaHangTonActivity.class);
                startActivity(intentTrangchu1);
            }
        });

        // xu ly click btn them sua ban hang
        btnthemsuaBHtt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTrangchu2 = new Intent(TrangChuActivity.this, ThemSuaBanHangActivity.class);
                startActivity(intentTrangchu2);
            }
        });

        //xu ly click xoa ban hang
        btnxoaBHtt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTrangchu3 = new Intent(TrangChuActivity.this, XoaBanHangActivity.class);
                startActivity(intentTrangchu3);
            }
        });
    }
}