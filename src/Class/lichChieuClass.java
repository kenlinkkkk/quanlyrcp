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
public class lichChieuClass {
    private int malich;
    private Time thoigian;
    private Date ngay;
    
    public phimClass phim;
    public phongChieuClass pchieu;

    public lichChieuClass() {
    }

    public lichChieuClass(int malich, Time thoigian, Date ngay) {
        this.malich = malich;
        this.thoigian = thoigian;
        this.ngay = ngay;
    }

    public int getMalich() {
        return malich;
    }

    public void setMalich(int malich) {
        this.malich = malich;
    }

    public Time getThoigian() {
        return thoigian;
    }

    public void setThoigian(Time thoigian) {
        this.thoigian = thoigian;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }
    
    
}
