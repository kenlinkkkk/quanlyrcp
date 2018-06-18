/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQLmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kenlink
 */
public class sqlconnection {
    private final String className = "com.mysql.jdbc.Driver";
    private final String url = "jdbc:mysql://127.0.0.2:3307/qlrcp";
    
    private final String user = "root";
    private final String pass = "1234";
    private Connection connection;
    
    public void connect(){
        try {
            Class.forName(className);
            connection = DriverManager.getConnection(url, user, pass);
            System.out.println("Success");
        } catch (ClassNotFoundException ex) {
            System.out.println("Class Error");
        } catch (SQLException ex) {
            System.out.println("Fail connect");
        }
    }
    public PreparedStatement PreparedStatement(String SQLcmd) throws SQLException {
        return connection.prepareStatement(SQLcmd); //To change body of generated methods, choose Tools | Templates.
    }

    public Statement createStatement() throws SQLException {
       return connection.createStatement();
    }
//    public static void main(String[] args) {
//        sqlconnection cnt = new sqlconnection();
//        cnt.connect();
//    }
}
