/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiondb;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Dagoberto
 */
public class ConexionDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Connection con = null;
        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba","root","balam2012");
            if(con != null){
                System.out.println("Conexion OK");
            }
                        
        }catch(Exception e){
            System.out.println("Not Connected");
        } 
    }
}
