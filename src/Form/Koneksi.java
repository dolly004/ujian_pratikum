/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Client
 */
public class Koneksi {
    static Connection Conn;
    public static Connection Koneksi(){
        try {
            Class.forName("com.mysql.jdbc.Driver"); 
            Conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ujian_pratikum_dolly","root","");
            return Conn;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
    }
    public static void putusKoneksi(){
        try {
            Conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static Object koneksidb() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
