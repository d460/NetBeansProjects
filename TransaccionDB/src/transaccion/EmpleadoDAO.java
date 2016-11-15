package transaccion;

import java.sql.*;

public class EmpleadoDAO implements IEmpleadoDAO{
    
    Conexion conexion;
    public EmpleadoDAO(){
        conexion = new Conexion();
        
    }
    
    public Empleado verificaStatement(String dni, String contraseña, String privilegio) {
        Empleado empleado = null;
        Connection accesoDB = conexion.getConexion();
        
        try {
            //Uso del comando Statement
            Statement st = accesoDB.createStatement();
            ResultSet rs = st.executeQuery("select * from empleado where dni ='"+dni+"' and pass= '"+
                    contraseña+"' and privilegio = '"+privilegio+"'");
                    
                    if(rs.next()){
                        
                    empleado = new Empleado();
                    empleado.setDni(rs.getString(1));
                    empleado.setContraseña(rs.getString(2));
                    empleado.setApellidos(rs.getString(3));
                    empleado.setNombres(rs.getString(4));
                    empleado.setPrivilegio(rs.getString(5));
                    System.out.println(" "+empleado.getDni()+" "+empleado.getContraseña()+" "+empleado.getApellidos()+" "+
                                empleado.getNombres()+" "+empleado.getPrivilegio());
                    } 
        } catch (Exception e) {
            System.out.println("No encontro datos "+dni +contraseña +privilegio);
        }
        
        return empleado;
    }

    
    public Empleado verificaPreparedStatement(String dni, String contraseña, String privilegio) {
            Empleado empleado = null;
        Connection accesoDB = conexion.getConexion();
        
        try {
            //Uso del comando PreparedStatement
            PreparedStatement ps = accesoDB.prepareStatement("select * from empleado where dni =? and pass=?"+
                    " and privilegio = ?");
            ps.setString(1, dni);
            ps.setString(2, contraseña);
            ps.setString(3, privilegio);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                
                    empleado = new Empleado();
                    empleado.setDni(rs.getString(1));
                    empleado.setContraseña(rs.getString(2));
                    empleado.setApellidos(rs.getString(3));
                    empleado.setNombres(rs.getString(4));
                    empleado.setPrivilegio(rs.getString(5));
                    System.out.println(" "+empleado.getDni()+" "+empleado.getContraseña()+" "+empleado.getApellidos()+" "+
                                empleado.getNombres()+" "+empleado.getPrivilegio());
                    } 
            
        } catch (Exception e) {
            System.out.println("No encontro datos "+dni +contraseña +privilegio);
        }
        
        return empleado;
    }

    
    public Empleado verificaCallableStatement(String dni, String contraseña, String privilegio) {
            Empleado empleado = null;
        Connection accesoDB = conexion.getConexion();
        
        try {
            //Uso del comando CallableStatement
            CallableStatement cs = accesoDB.prepareCall("{call sp_verificaEmpleado(?,?,?)}");
            cs.setString(1, dni);
            cs.setString(2, contraseña);
            cs.setString(3, privilegio);
            
            ResultSet rs = cs.executeQuery();
            if(rs.next()){
                
                    empleado = new Empleado();
                    empleado.setDni(rs.getString(1));
                    empleado.setContraseña(rs.getString(2));
                    empleado.setApellidos(rs.getString(3));
                    empleado.setNombres(rs.getString(4));
                    empleado.setPrivilegio(rs.getString(5));
                    System.out.println(" "+empleado.getDni()+" "+empleado.getContraseña()+" "+empleado.getApellidos()+" "+
                                empleado.getNombres()+" "+empleado.getPrivilegio());
                    }       
            
        } catch (Exception e) {
            System.out.println("No encontro datos "+dni +contraseña +privilegio);
        }
        
        return empleado;
    }
    
    
    
}
