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
public class Empleado {

    private String idEmpleado;
    private String superEmpleado;
    private String nombre;
    private String primerAp;
    private String segundoAp;
    private String sexo;
    private java.sql.Date fechaNac;
    private String puesto;
    private String numTel;
    private String correo;
    private String contrasena;

    public Empleado() {

    }

    // Constructor completo
    public Empleado(String idEmpleado, String superEmpleado, String nombre, String primerAp,
            String segundoAp, String sexo, java.sql.Date fechaNac, String puesto, String numTel, String correo,String contrasena) {
        this.idEmpleado = idEmpleado;
        this.superEmpleado = superEmpleado;
        this.nombre = nombre;
        this.primerAp = primerAp;
        this.segundoAp = segundoAp;
        this.sexo = sexo;
        this.fechaNac = fechaNac;
        this.puesto = puesto;
        this.numTel = numTel;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getSuperEmpleado() {
        return superEmpleado;
    }

    public void setSuperEmpleado(String superEmpleado) {
        this.superEmpleado = superEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerAp() {
        return primerAp;
    }

    public void setPrimerAp(String primerAp) {
        this.primerAp = primerAp;
    }

    public String getSegundoAp() {
        return segundoAp;
    }

    public void setSegundoAp(String segundoAp) {
        this.segundoAp = segundoAp;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public java.sql.Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(java.sql.Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    

}
