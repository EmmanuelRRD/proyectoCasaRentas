/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bakend.objetos;

import java.sql.Date;

/**
 *
 * @author Emmanuel
 */
public class Visita {
    private String idPropiedad;
    private String idCliente;
    private String idEmpleado;
    private java.sql.Date fechaVisita;
    private String comentario;
    
    public Visita(){}

    public Visita(String idPropiedad, String idCliente, String idEmpleado, Date fechaVisita, String comentario) {
        this.idPropiedad = idPropiedad;
        this.idCliente = idCliente;
        this.idEmpleado = idEmpleado;
        this.fechaVisita = fechaVisita;
        this.comentario = comentario;
    }

    public String getIdPropiedad() {
        return idPropiedad;
    }

    public void setIdPropiedad(String idPropiedad) {
        this.idPropiedad = idPropiedad;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Date getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(Date fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
}
