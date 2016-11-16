
package modelo;
import java.sql.*;

public class Conexion {
    
    public Conexion(){  
    }
    public Connection getConexion(){
        Connection con = null;
        try {
            //Se instancio Driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            //Se realiza conexion
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_prueba", "root", "balam2012");
            
        } catch (Exception e) {
        }
        return con;
    }
}
