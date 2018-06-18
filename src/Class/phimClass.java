/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author Kenlink
 */
public class phimClass {
    private int maPhim;
    private String tenPhim;
    private String mota;
    private String dienvien;
    private String theloai;
    private Date ngayramat;
    private Time thoiluong;

    public phimClass() {
    }

    public phimClass(int maPhim, String tenPhim, String mota, String dienvien, String theloai, Date ngayramat, Time thoiluong) {
        this.maPhim = maPhim;
        this.tenPhim = tenPhim;
        this.mota = mota;
        this.dienvien = dienvien;
        this.theloai = theloai;
        this.ngayramat = ngayramat;
        this.thoiluong = thoiluong;
    }

    public int getMaPhim() {
        return maPhim;
    }

    public void setMaPhim(int maPhim) {
        this.maPhim = maPhim;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getDienvien() {
        return dienvien;
    }

    public void setDienvien(String dienvien) {
        this.dienvien = dienvien;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public Date getNgayramat() {
        return ngayramat;
    }

    public void setNgayramat(Date ngayramat) {
        this.ngayramat = ngayramat;
    }

    public Time getThoiluong() {
        return thoiluong;
    }

    public void setThoiluong(Time thoiluong) {
        this.thoiluong = thoiluong;
    }
    
    
    
}
