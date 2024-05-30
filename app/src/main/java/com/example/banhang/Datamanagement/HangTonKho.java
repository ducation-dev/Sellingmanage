package com.example.banhang.Datamanagement;

import android.util.Log;

import com.example.banhang.SQLServerManagement.SQLServerHelper;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;

public class HangTonKho {
    private String IDHangTK;
    private String TenHangTK;
    private Integer SoLuontHangTK;
    private Date NgayNhapHTK;
    private Date HSDHTK;
    private Integer GiaSPHTK;

    // tạo kết nối với csdl vào bảng HANGTONKHO , tạo hàm thêm HTK
    public static void inserHTK(String IDHangTK, String TenHangTK, String SoLuontHangTK, String NgayNhapHTK, String HSDHTK, String GiaSPHTK) throws SQLException {
        Connection connection = SQLServerHelper.connectionSQLSever(); // tạo kết nối với sqlsever
        Statement statement = connection.createStatement(); // tạo đối tượng statement
        String sql = "INSERT INTO HANGTONKHO(IDHANGTON,TENHANGTON,SOLUONGHANGTON,NGAYNHAPHANGTON,HSDHANGTON,GIASPHANGTON) VALUES ('"+IDHangTK+"','"+TenHangTK+"','"+SoLuontHangTK+"','"+NgayNhapHTK+"','"+HSDHTK+"','"+GiaSPHTK+"')";
        Log.e("DATA",sql);
        statement.execute(sql); // thực thi câu lệnh
        statement.close(); // đóng đối tượng statement
        connection.close(); // đóng kết nối
    }
    // tạo kết nối với csdl vào bảng HANGTONKHO , tạo hàm sửa HTK
    public static void updateHTK(String IDHangTK, String TenHangTK, String SoLuontHangTK, String NgayNhapHTK, String HSDHTK, String GiaSPHTK) throws SQLException {
        Connection connection = SQLServerHelper.connectionSQLSever();// tạo kết nối với sqlsever
        Statement statement = connection.createStatement();// tạo đối tượng statement
        String sql = "UPDATE HANGTONKHO SET TENHANGTON = '"+TenHangTK+"', SOLUONGHANGTON = '"+SoLuontHangTK+"', NGAYNHAPHANGTON = '"+NgayNhapHTK+"', HSDHANGTON = '"+HSDHTK+"', GIASPHANGTON = '"+GiaSPHTK+"'" +
                "WHERE IDHANGTON = '"+IDHangTK+"'";
        Log.e("DATA",sql);
        statement.execute(sql);// thực thi câu lệnh
        statement.close();// đóng đối tượng statement
        connection.close();// đóng kết nối
    }
    // tạo kết nối với csdl vào bảng HANGTONKHO , tạo hàm xóa HHTK
    public static void deleteHTK(String IDHangTK) throws SQLException {
        Connection connection = SQLServerHelper.connectionSQLSever();// tạo kết nối với sqlsever
        Statement statement = connection.createStatement();// tạo đối tượng statement
        String sql = "DELETE FROM HANGTONKHO WHERE IDHANGTON = '"+IDHangTK+"'";
        Log.e("DATA",sql);
        statement.execute(sql);// thực thi câu lệnh
        statement.close();// đóng đối tượng statement
        connection.close();// đóng kết nối
    }
    //tạo constructor
    public HangTonKho(String IDHangTK, String tenHangTK, Integer soLuontHangTK, Date ngayNhapHTK, Date HSDHTK, Integer giaSPHTK) {
        this.IDHangTK = IDHangTK;
        TenHangTK = tenHangTK;
        SoLuontHangTK = soLuontHangTK;
        NgayNhapHTK = ngayNhapHTK;
        this.HSDHTK = HSDHTK;
        GiaSPHTK = giaSPHTK;
    }

    public String getIDHangTK() {
        return IDHangTK;
    }

    public void setIDHangTK(String IDHangTK) {
        this.IDHangTK = IDHangTK;
    }

    public String getTenHangTK() {
        return TenHangTK;
    }

    public void setTenHangTK(String tenHangTK) {
        TenHangTK = tenHangTK;
    }

    public Integer getSoLuontHangTK() {
        return SoLuontHangTK;
    }

    public void setSoLuontHangTK(Integer soLuontHangTK) {
        SoLuontHangTK = soLuontHangTK;
    }

    public Date getNgayNhapHTK() {
        return NgayNhapHTK;
    }

    public void setNgayNhapHTK(Date ngayNhapHTK) {
        NgayNhapHTK = ngayNhapHTK;
    }

    public Date getHSDHTK() {
        return HSDHTK;
    }

    public void setHSDHTK(Date HSDHTK) {
        this.HSDHTK = HSDHTK;
    }

    public Integer getGiaSPHTK() {
        return GiaSPHTK;
    }

    public void setGiaSPHTK(Integer giaSPHTK) {
        GiaSPHTK = giaSPHTK;
    }
}
