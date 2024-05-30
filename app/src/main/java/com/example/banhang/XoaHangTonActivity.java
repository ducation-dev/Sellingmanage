package com.example.banhang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.banhang.Datamanagement.HangTonKho;
import com.example.banhang.Datamanagement.SanPham;
import com.google.android.material.textfield.TextInputEditText;

import java.sql.SQLException;

public class XoaHangTonActivity extends AppCompatActivity {
    //khai báo id
    TextInputEditText edtMaHTx;
    Button btnXoaHT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_xoa_hang_ton2);
        // ánh xạ id
        edtMaHTx = findViewById(R.id.edtMaHTx);
        btnXoaHT = findViewById(R.id.btnXoaHT);
        onClickChangePage(); // gọi tới hàm onClickChangePage
    }
    private void onClickChangePage() {
        // xử lý click btn xóa hang ton
        btnXoaHT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String maHT = edtMaHTx.getText().toString();
                try {
                    HangTonKho.deleteHTK(maHT);
                }
                catch (SQLException e){
                    throw new RuntimeException(e);
                }
                finish();
            }
        });
    }
}