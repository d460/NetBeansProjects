package modelo;

import java.sql.*;

public class EmpleadoDAO {
    Conexion conexion;
    
public EmpleadoDAO(){

    conexion = new Conexion();
}

public Empleado verificaPreparedStatement(String dni, String pass, String privilegio){
    
    Empleado empleado = null;
    Connection accesoDB = conexion.getConexion();
    
    try {
        
    PreparedStatement ps = accesoDB.prepareStatement("Select * from empleado where dni = ? and pass = ? and privilegio = ?");
    ps.setString(1, dni);
    ps.setString(2, pass);
    ps.setString(3, privilegio);
    
    ResultSet rs = ps.executeQuery();
    
    if(rs.next()){
        empleado = new Empleado();
        empleado.setDni(rs.getString(1));
        empleado.setPass(rs.getString(2));
        empleado.setApellidos(rs.getString(3));
        empleado.setNombres(rs.getString(4));
        empleado.setPrivilegios(rs.getString(5));
        
        System.out.println(" "+empleado.getDni()+" "+empleado.getPass()+" "+empleado.getApellidos()+" "+
                                empleado.getNombres()+" "+empleado.getPrivilegios());
    }
        
    }catch (Exception e) {
    System.out.println("No encontro datos "+dni +pass +privilegio);
    }
    return empleado;
}
}   
    

