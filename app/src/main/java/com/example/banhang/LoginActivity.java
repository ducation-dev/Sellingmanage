package com.example.banhang;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.banhang.Datamanagement.Logins;
import com.google.android.material.textfield.TextInputEditText;

import java.sql.SQLException;

public class LoginActivity extends AppCompatActivity {
    TextInputEditText login_user,login_password;
    Button login_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login3);
        // anh xa id
        login_user = findViewById(R.id.login_user);
        login_password = findViewById(R.id.login_password);
        login_button = findViewById(R.id.login_button);

        //xu ly click dang nhap
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = login_user.getText().toString(); // gắn biến user để lấy dữ liệu từ text user
                String passwords = login_password.getText().toString(); // gắn biến passwords để lấy dữ liệu từ text password
                Logins login = new Logins(); // tạo 1 login mới
                try {
                    login = login.getuserlist(user,passwords);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                if(user.equals(login.getUser()) && passwords.equals(login.getPass())){ // kiểm tra nếu dăng nhập đúng thì ok
                    Toast.makeText(LoginActivity.this, "OK", Toast.LENGTH_SHORT).show();
                }
                if(user.length()==0 || passwords.length()==0){ // kiểm tra form đã nhập hay chưa
                    Toast.makeText(LoginActivity.this, "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();// kiểm tra xem user và pass của người dùng nhập có đúng với csdl k

                }else if(login.getUser().equals(user) && login.getPass().equals(passwords)){
                    Intent intentlog = new Intent(LoginActivity.this, TrangChuActivity.class); // tạo intent để chuyển qua giao diện bạn đọc
                    startActivity(intentlog); // bắt đầu chuyển giao diện
                }else{
                    Toast.makeText(LoginActivity.this, "Tài khoản mật khẩu không chính xác", Toast.LENGTH_SHORT).show(); // nếu người dùng nhập k đúng báo tk mk k chính xác
                }
            }
        });
    }
}