package bakend.daos;

import bakend.conexion.Conexion;
import bakend.objetos.Visita;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emmanuel
 */
public class DaoVisitas {

    public List<Visita> buscarVisitas(String busqueda)
            throws SQLException {
        List<Visita> vistas = new ArrayList<>();
        Connection conn = Conexion.getInstance().getConn();

        String sql = "SELECT * FROM CasaRenta_pf.Visitas WHERE "
            + "CAST(idpropiedad AS TEXT) ILIKE ? OR "
            + "idcliente ILIKE ? OR "
            + "idempleado ILIKE ? OR "
            + "CAST(fecha AS TEXT) ILIKE ? OR "
            + "comentario ILIKE ?";

        PreparedStatement ps = conn.prepareStatement(sql);
        String param = "%" + busqueda + "%";
        for (int i = 1; i <= 5; i++) {
            ps.setString(i, param);
        }

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Visita e = new Visita(
                    rs.getString("idpropiedad"),
                    rs.getString("idCliente"),
                    rs.getString("idEmpleado"),
                    rs.getDate("fecha"), 
                    rs.getString("comentario")
            );
            vistas.add(e);
        }

        return vistas;
    }

    public void actualizarEmpleado(Visita vis) throws SQLException {
        String sql = "UPDATE CasaRenta_pf.Empleado SET "
                + "idCliente = ?, "
                + "idEmpleado = ?, "
                + "fechaVisita = ?, "
                + "comentario = ?, "
                + "WHERE idPropiedad = ?";

        Connection conn = Conexion.getInstance().getConn();
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, vis.getIdCliente());
        ps.setString(2, vis.getIdEmpleado());
        ps.setDate(3, vis.getFechaVisita());
        ps.setString(4, vis.getComentario());
        ps.setString(5, vis.getIdPropiedad());

        ps.executeUpdate();
        ps.close();
    }

    public void insertarEmpleado(Visita vis) throws SQLException {
        String sql = "INSERT INTO CasaRenta_pf.Visitas "
                + "(idPropiedad, idCliente, idEmpleado, fechaVisita, comentario)"
                + "VALUES (?, ?, ?, ?, ?)";

        Connection conn = Conexion.getInstance().getConn();
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, vis.getIdPropiedad());
        ps.setString(2, vis.getIdCliente());
        ps.setString(3, vis.getIdEmpleado());
        ps.setDate(4, vis.getFechaVisita());
        ps.setString(5, vis.getComentario());

        ps.executeUpdate();
        ps.close();
    }

    public void eliminarEmpleado(String idEmpleado) throws SQLException {

        Connection conn = Conexion.getInstance().getConn();

        String sql = "DELETE FROM CasaRenta_pf.Vistas WHERE idPropiedad = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, idEmpleado); // Se asigna el ID del empleado
            int filasAfectadas = ps.executeUpdate(); // Ejecuta la eliminación

            if (filasAfectadas == 0) {
                throw new SQLException("No se encontró el empleado con ID: " + idEmpleado);
            }
        }
    }
}
