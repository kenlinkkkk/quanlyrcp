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
public class choNgoiClass {
    private int maCho;
    private String hang;
    private int cot;
    private String loai;

    public phongChieuClass pchieu;
    
    public choNgoiClass() {
    }

    public choNgoiClass(int maCho, String hang, int cot, String loai) {
        this.maCho = maCho;
        this.hang = hang;
        this.cot = cot;
        this.loai = loai;
    }

    public int getMaCho() {
        return maCho;
    }

    public void setMaCho(int maCho) {
        this.maCho = maCho;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public int getCot() {
        return cot;
    }

    public void setCot(int cot) {
        this.cot = cot;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }   

    public phongChieuClass getPchieu() {
        return pchieu;
    }

    public void setPchieu(phongChieuClass pchieu) {
        this.pchieu = pchieu;
    }
    
    
    
}
