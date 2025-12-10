/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bakend.daos;

import bakend.conexion.Conexion;
import bakend.objetos.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Emmanuel
 */
public class DaoEmpleado {

    public List<Empleado> buscarEmpleados(String busqueda)
            throws SQLException {
        List<Empleado> empleados = new ArrayList<>();
        Connection conn = Conexion.getInstance().getConn();

        String sql = "SELECT * FROM CasaRenta_pf.Empleado WHERE "
                + "idEmpleado ILIKE ? OR "
                + "superEmpleado ILIKE ? OR "
                + "nombre ILIKE ? OR "
                + "primerAp ILIKE ? OR "
                + "segundoAp ILIKE ? OR "
                + "sexo ILIKE ? OR "
                + "CAST(fechaNac AS TEXT) ILIKE ? OR "
                + "puesto ILIKE ? OR "
                + "numTel ILIKE ? OR "
                + "correo ILIKE ?";

        PreparedStatement ps = conn.prepareStatement(sql);
        String param = "%" + busqueda + "%";
        for (int i = 1; i <= 10; i++) {
            ps.setString(i, param);
        }

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Empleado e = new Empleado(
                    rs.getString("idEmpleado"),
                    rs.getString("superEmpleado"),
                    rs.getString("nombre"),
                    rs.getString("primerAp"),
                    rs.getString("segundoAp"),
                    rs.getString("sexo"),
                    rs.getDate("fechaNac"),
                    rs.getString("puesto"),
                    rs.getString("numTel"),
                    rs.getString("correo")
            );
            empleados.add(e);
        }

        return empleados;
    }

    public void insertarEmpleado(Empleado emp) throws SQLException {
        String sql = "INSERT INTO CasaRenta_pf.Empleado "
                + "(idEmpleado,superempleado, nombre, primerap, segundoap, sexo, fechanac, puesto, numtel, correo, password) "
                + "VALUES (?,?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        // Obtener la conexión
        Connection conn = Conexion.getInstance().getConn();
        PreparedStatement ps = conn.prepareStatement(sql);

        // Asignar los valores desde el objeto Empleado
        ps.setString(1, emp.getIdEmpleado());
        ps.setString(2, emp.getIdEmpleado());
        ps.setString(3, emp.getNombre());
        ps.setString(4, emp.getPrimerAp());
        ps.setString(5, emp.getSegundoAp());
        ps.setString(6, emp.getSexo());
        ps.setDate(7, emp.getFechaNac());
        ps.setString(8, emp.getPuesto());
        ps.setString(9, emp.getNumTel());
        ps.setString(10, emp.getCorreo());
        ps.setString(11, emp.getContrasena());

        // Ejecutar inserción
        ps.executeUpdate();
        ps.close(); // liberar recursos
    }

}
