package com.mycompany.proyectofinalrentas;

import bakend.login.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import uiux.Login;

/**
 *
 * @author Emmanuel
 */
public class ProyectoFinalRentas {

    public static void main(String[] args) throws SQLException {
        Connection conn = Conexion.getInstance().getConn();
    }
}
