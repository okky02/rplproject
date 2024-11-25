/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalmobil_okky;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Asus
 */
public class rentalclass {
    public Connection getConnection() {
    Connection connection = null;
    try {
        String url = "jdbc:mysql://localhost:3306/rental_mobil";
        String user = "root"; // sesuaikan dengan user MySQL Anda
        String password = ""; // sesuaikan dengan password MySQL Anda
        connection = DriverManager.getConnection(url, user, password);
    } catch (SQLException e) {
        System.out.println("Koneksi Gagal: " + e.getMessage());
    }
    return connection;
    }    
}

