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
public class hoaDonClass {
    private int maHD;
    private Date ngay;
    
    public nVienClass nVien;
    public khachHangClass KHang;

    public hoaDonClass() {
    }

    public hoaDonClass(int maHD, Date ngay) {
        this.maHD = maHD;
        this.ngay = ngay;
    }

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    } 

    public nVienClass getnVien() {
        return nVien;
    }

    public void setnVien(nVienClass nVien) {
        this.nVien = nVien;
    }

    public khachHangClass getKHang() {
        return KHang;
    }

    public void setKHang(khachHangClass KHang) {
        this.KHang = KHang;
    }
    
    
}
