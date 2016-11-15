/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaccion;
import java.sql.*;
/**
 *
 * @author Dagoberto
 */
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
