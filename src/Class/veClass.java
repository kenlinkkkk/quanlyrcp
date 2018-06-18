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
public class veClass {
    private int mave;
    private float gia;
    
    public choNgoiClass cngoi;
    public lichChieuClass lchieu;
    public hoaDonClass hdon;  

    public veClass() {
    }

    public veClass(int mave, float gia) {
        this.mave = mave;
        this.gia = gia;
    }

    public int getMave() {
        return mave;
    }

    public void setMave(int mave) {
        this.mave = mave;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public choNgoiClass getCngoi() {
        return cngoi;
    }

    public void setCngoi(choNgoiClass cngoi) {
        this.cngoi = cngoi;
    }

    public lichChieuClass getLchieu() {
        return lchieu;
    }

    public void setLchieu(lichChieuClass lchieu) {
        this.lchieu = lchieu;
    }

    public hoaDonClass getHdon() {
        return hdon;
    }

    public void setHdon(hoaDonClass hdon) {
        this.hdon = hdon;
    }
    
    
}
