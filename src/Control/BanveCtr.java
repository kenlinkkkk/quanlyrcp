/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Class.choNgoiClass;
import Class.hoaDonClass;
import Class.lichChieuClass;
import Class.phimClass;
import Class.veClass;
import java.util.ArrayList;
import SQLmanager.sqlconnection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import javax.swing.JOptionPane;

/**
 *
 * @author Kenlink
 */

public class BanveCtr {
    private static final sqlconnection cnt = new sqlconnection();
    
    private String tenphim;
    private int malich;
    private Time thoiluong;
    private Time thoigian;
    private Date ngay;
    private int maphong;
    private String tenphong;
    
    public BanveCtr(){
        cnt.connect();
    }

    public BanveCtr(String tenphim,int malich, Time thoiluong, Time thoigian, Date ngay,int maphong, String tenphong) {
        this.tenphim = tenphim;
        this.malich = malich;
        this.thoiluong = thoiluong;
        this.thoigian = thoigian;
        this.ngay = ngay;
        this.maphong = maphong;
        this.tenphong = tenphong;
    }

    public String getTenphim() {
        return tenphim;
    }

    public Time getThoiluong() {
        return thoiluong;
    }

    public Time getThoigian() {
        return thoigian;
    }

    public Date getNgay() {
        return ngay;
    }

    public int getMaphong(){
        return maphong;
    }
    
    public String getTenphong() {
        return tenphong;
    }

    public int getMalich() {
        return malich;
    }
    
    public ArrayList<phimClass> getListFilm() throws SQLException{
       ArrayList<phimClass> Films = new ArrayList();
       String SQLcmd = "SELECT * FROM qlrcp.tblphim;";
        PreparedStatement pst = cnt.PreparedStatement(SQLcmd);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            phimClass Film = new phimClass();
            Film.setMaPhim(rs.getInt("maPhim"));
            Film.setTenPhim(rs.getString("tenPhim"));
            Film.setMota(rs.getString("mota"));
            Film.setDienvien(rs.getString("dienvien"));
            Film.setTheloai(rs.getString("theloai"));
            Film.setNgayramat(rs.getDate("ngayramat"));
            Film.setThoiluong(rs.getTime("thoiluong"));
            Films.add(Film);
        }
       return Films;
    }
    
    public ArrayList<lichChieuClass> getListLich() throws SQLException{
        ArrayList<lichChieuClass> listLich = new ArrayList();
        String SQLcmd = "SELECT * FROM qlrcp.tbllichchieu;";
        PreparedStatement pst = cnt.PreparedStatement(SQLcmd); 
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {            
            lichChieuClass lich = new lichChieuClass();
            lich.setMalich(rs.getInt("maLich"));
            lich.setNgay(rs.getDate("ngay"));
            lich.setThoigian(rs.getTime("thoigian"));
            listLich.add(lich);
        }
        return listLich;
    }
    
    public ArrayList<BanveCtr> Search(String key) throws SQLException{
        ArrayList<BanveCtr> bveCtrs = new ArrayList();
        String SQLcmd ="SELECT tblphim.tenPhim, tbllichchieu.maLich, tblphim.thoiluong, tbllichchieu.thoigian, tbllichchieu.ngay,tblphongchieu.maPhong, tblphongchieu.tenPhong FROM"
                + " qlrcp.tbllichchieu left join qlrcp.tblphim on tbllichchieu.fk_maPhim = tblphim.maPhim "
                + "left join qlrcp.tblphongchieu on tbllichchieu.fk_maPhongChieu = tblphongchieu.maPhong where tblphim.tenPhim like ?;";
        PreparedStatement pst = cnt.PreparedStatement(SQLcmd);
        pst.setString(1, "%" + key + "%");
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {            
            BanveCtr bc = new BanveCtr(rs.getString("tenPhim"),rs.getInt("maLich"), rs.getTime("thoiluong"), rs.getTime("thoigian"), rs.getDate("ngay"), rs.getInt("maPhong"), rs.getString("tenPhong"));
            bveCtrs.add(bc);
        }
        return bveCtrs;        
    }
    
    public void addHoadon(hoaDonClass hdon) throws SQLException{
        String SQLcmd = "INSERT INTO qlrcp.tblhoadon (ngay, fk_HD_NV, fk_HD_KH) VALUES (?, ?, ?);";
        PreparedStatement pst = cnt.PreparedStatement(SQLcmd);
        
        pst.setDate(1, hdon.getNgay());
        pst.setInt(2, hdon.nVien.getMaNV());
        pst.setInt(3, hdon.KHang.getMaKH());
        
        pst.executeUpdate();
    }
    
    public void addVe(veClass ve) throws SQLException{
        String SQLcmd = "INSERT INTO qlrcp.tblve (gia, fk_ve_cho, fk_ve_lich, fk_ve_hoadon) VALUES(?, ?, ?, ?);";
        PreparedStatement pst = cnt.PreparedStatement(SQLcmd);
        
        pst.setFloat(1, ve.getGia());
        pst.setInt(2, ve.cngoi.getMaCho());
        pst.setInt(3, ve.lchieu.getMalich());
        pst.setInt(4, ve.hdon.getMaHD());
        
        if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Thêm thành công");
        } else{
                JOptionPane.showMessageDialog(null, "Thêm thất bại");
            }
    }
    
    public ArrayList<choNgoiClass> loadGheTrong(int fk_ve_lich, int fk_ve_cho) throws SQLException {
        ArrayList<choNgoiClass> cNgois = new ArrayList();
        String SQLcmd = "SELECT * FROM qlrcp.tblchongoi WHERE maCho NOT IN (SELECT fk_ve_cho FROM qlrcp.tblve where fk_ve_lich = ?) AND fk_maPhongChieu = ?;";
        PreparedStatement pst = cnt.PreparedStatement(SQLcmd);
        pst.setInt(1, fk_ve_lich);
        pst.setInt(2, fk_ve_cho);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {            
            choNgoiClass cNgoi = new choNgoiClass();
            cNgoi.setMaCho(rs.getInt("maCho"));
            cNgoi.setHang(rs.getString("hang"));
            cNgoi.setCot(rs.getInt("cot"));
            cNgoi.setLoai(rs.getString("loai"));
            cNgois.add(cNgoi);
        }
        return cNgois;
    }
    
    public ArrayList<choNgoiClass> getList(String hang, int cot,int maphong) throws SQLException{
        ArrayList<choNgoiClass> cNgois = new ArrayList();
        String SQLcmd = "SELECT * FROM qlrcp.tblchongoi WHERE hang = ? and cot = ? and fk_maPhongChieu = ?";
        PreparedStatement pst = cnt.PreparedStatement(SQLcmd);
        pst.setString(1, hang);
        pst.setInt(2, cot);
        pst.setInt(3, maphong);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {            
            choNgoiClass cngoi = new choNgoiClass();
            cngoi.setMaCho(rs.getInt("maCho"));
            cngoi.setHang(rs.getString("hang"));
            cngoi.setCot(rs.getInt("cot"));
            cngoi.setLoai(rs.getString("loai"));
            cNgois.add(cngoi);
        }
        return cNgois;
    }
    public int getLastIDHD() throws SQLException{
        String SQLcmd ="SELECT maHD from qlrcp.tblhoadon;";
        int x = 0;
        PreparedStatement pst = cnt.PreparedStatement(SQLcmd);
        ResultSet rs = pst.executeQuery();
        while (rs.next() == rs.last()) {            
            x = rs.getInt("maHD");
        }
        return x;
    }
}
