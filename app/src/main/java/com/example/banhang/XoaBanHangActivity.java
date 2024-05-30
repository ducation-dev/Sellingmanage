package com.example.banhang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.banhang.Datamanagement.HangTonKho;
import com.example.banhang.Datamanagement.SanPham;
import com.google.android.material.textfield.TextInputEditText;

import java.sql.SQLException;

public class XoaBanHangActivity extends AppCompatActivity {
    //khai báo id
    TextInputEditText edtMaBHx;
    Button btnXoaBHx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_xoa_ban_hang2);
        //ánh xạ id
        edtMaBHx = findViewById(R.id.edtMaBHx);
        btnXoaBHx = findViewById(R.id.btnXoaBHx);
        onClickChangePage(); // gọi tới hàm onlcickchangepage
    }
// xử lý click btn xóa bán hàng
    private void onClickChangePage() {
        btnXoaBHx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String maBH = edtMaBHx.getText().toString();
                try {
                    //gọi tới hàm deleteSP trong class SP
                    SanPham.deleteSP(maBH);
                }
                catch (SQLException e){
                    throw new RuntimeException(e);
                }
                finish();
            }
        });
    }
}