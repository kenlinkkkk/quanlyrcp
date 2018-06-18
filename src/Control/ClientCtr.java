/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Class.khachHangClass;
import SQLmanager.sqlconnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Kenlink
 */
public class ClientCtr {
    private static final sqlconnection cnt = new sqlconnection();
    
    public ClientCtr() {
        cnt.connect();
    }
    public void addClient(khachHangClass kHang) throws SQLException{
        String SQLcmd = "INSERT INTO qlrcp.tblkhachhang (tenKH, sdt, email, diachi) VALUES (?, ?, ?, ?);";
        
        PreparedStatement pst = cnt.PreparedStatement(SQLcmd);
        
        pst.setString(1, kHang.getTenKH());
        pst.setString(2, kHang.getSdt());
        pst.setString(3, kHang.getEmail());
        pst.setString(4, kHang.getDiachi());
        
        if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Thêm thành công");
        } else{
                JOptionPane.showMessageDialog(null, "Thêm thất bại");
            }
    }
    
    public ArrayList<khachHangClass> getList() throws SQLException {
        ArrayList<khachHangClass> kHangs = new ArrayList();
        String SQLcmd = "SELECT * FROM qlrcp.tblkhachhang;";
        PreparedStatement pst = cnt.PreparedStatement(SQLcmd);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            khachHangClass kHang = new khachHangClass();
            kHang.setMaKH(rs.getInt("maKH"));
            kHang.setTenKH(rs.getString("tenKH"));
            kHang.setSdt(rs.getString("sdt"));
            kHang.setEmail(rs.getString("email"));
            kHang.setDiachi(rs.getString("diachi"));
            kHangs.add(kHang);
        }
        return kHangs;
    }
    
    public ArrayList<khachHangClass> SearchClient(String key) throws SQLException{
        ArrayList<khachHangClass> kHangs = new ArrayList();
        String SQLcmd = "SELECT * FROM qlrcp.tblkhachhang where tenKH like ?;";
        PreparedStatement pst = cnt.PreparedStatement(SQLcmd);
        pst.setString(1,"%" + key + "%");
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {            
            khachHangClass kHang = new khachHangClass();
            kHang.setMaKH(rs.getInt("maKH"));
            kHang.setTenKH(rs.getString("tenKH"));
            kHang.setSdt(rs.getString("sdt"));
            kHang.setEmail(rs.getString("email"));
            kHang.setDiachi(rs.getString("diachi"));
            kHangs.add(kHang);
        }
        return kHangs;
    }
    
}
