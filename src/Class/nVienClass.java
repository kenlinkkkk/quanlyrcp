/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.sql.Date;

/**
 *
 * @author Kenlink
 */
public class nVienClass {
    private int maNV;
    private String username;
    private String password;
    private String tenNV;
    private String chucVu;
    private Date ngaysinh;

    public nVienClass() {
    }

    public nVienClass(int maNV, String username, String password, String tenNV, String chucVu, Date ngaysinh) {
        this.maNV = maNV;
        this.username = username;
        this.password = password;
        this.tenNV = tenNV;
        this.chucVu = chucVu;
        this.ngaysinh = ngaysinh;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
    
    
}
