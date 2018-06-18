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
public class rapClass {
    private int maRap;
    private String tenRap;
    private String diachi;

    public rapClass() {
    }

    public rapClass(String tenRap, String diachi, int maRap) {
        this.tenRap = tenRap;
        this.diachi = diachi;
        this.maRap = maRap;
    }

    public int getMaRap() {
        return maRap;
    }
    public void setMaRap(int maRap) {
        this.maRap = maRap;
    }
    public String getTenRap() {
        return tenRap;
    }

    public void setTenRap(String tenRap) {
        this.tenRap = tenRap;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    
    
}
