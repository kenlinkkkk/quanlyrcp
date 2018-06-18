/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author Kenlink
 */
public class phongChieuClass {
    private int maPhong;
    private String tenPhong;
    private String loai;
    
    public rapClass rap;

    public phongChieuClass(int maPhong, String tenPhong, String loai) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.loai = loai;
    }

    public phongChieuClass() {
    }

    public int getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }
    
    
}
