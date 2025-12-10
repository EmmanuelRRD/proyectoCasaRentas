/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bakend.login;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import uiux.Login;

/**
 *
 * @author Emmanuel
 */
public class Conexion {

    private static Conexion instance; // instancia única
    private Connection conn;
    private final String url = "jdbc:postgresql://localhost:5432/casarenta_pf";
    private final String user = "postgres";
    private final String password = "Menma93";

    // Constructor privado evita instanciación externa
    private Conexion() {
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método público para obtener la instancia única
    public static Conexion getInstance() {
        if (instance == null) {
            instance = new Conexion();
        }
        return instance;
    }

    public Connection getConn() {
        return conn;
    }
    
    public void closeConnection() {//según san lucas solo se utiliza asta al final de la ejecucion
    try {
        if (conn != null && !conn.isClosed()) {
            conn.close();
            System.out.println("Conexión cerrada.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}


}