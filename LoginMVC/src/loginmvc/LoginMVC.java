/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginmvc;

import controlador.ControladorLogin;
import modelo.EmpleadoDAO;
import vista.JFLogin;

/**
 *
 * @author Dagoberto
 */
public class LoginMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFLogin vistaL = new JFLogin();
        EmpleadoDAO modeloL = new EmpleadoDAO();
        ControladorLogin controladorL = new ControladorLogin(vistaL,modeloL);
        vistaL.setVisible(true);
        vistaL.setLocationRelativeTo(null);
        
    }
    
}
