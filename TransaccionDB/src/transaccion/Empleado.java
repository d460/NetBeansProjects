/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaccion;

/**
 *
 * @author Dagoberto
 */
public class Empleado {
    
    String dni;
    String contraseña;
    String apellidos;
    String nombres;
    String privilegio;

    public Empleado() {
        dni = "";
        contraseña = "";
        apellidos = "";
        nombres = "";
        privilegio = "";
    }

    public Empleado(String dni, String contraseña, String apellidos, String nombres, String privilegio) {
        this.dni = dni;
        this.contraseña = contraseña;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.privilegio = privilegio;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPrivilegio() {
        return privilegio;
    }

    public void setPrivilegio(String privilegio) {
        this.privilegio = privilegio;
    }
        
}
