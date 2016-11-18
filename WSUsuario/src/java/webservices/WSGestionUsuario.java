/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservices;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.*;

/**
 *
 * @author Dagoberto
 */
@WebService(serviceName = "WSGestionUsuario")
public class WSGestionUsuario {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "validar")
    public Empleado validar(@WebParam(name = "dni") String dni, @WebParam(name = "pass") String pass, @WebParam(name = "privilegio") String privilegio) {
        
        EmpleadoDAO emp = new EmpleadoDAO();
        Empleado empleado = emp.verificaPreparedStatement(dni, pass, privilegio);
        return empleado;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "registrar")
    public String registrar(@WebParam(name = "dni") String dni, @WebParam(name = "pass") String pass, @WebParam(name = "apellidos") String apellidos, @WebParam(name = "nombres") String nombres, @WebParam(name = "privilegio") String privilegio) {
        EmpleadoDAO emp = new EmpleadoDAO();
        String respuesta = emp.registrarUsuario(dni, pass, apellidos, nombres, privilegio);
        return respuesta;
    }
}
