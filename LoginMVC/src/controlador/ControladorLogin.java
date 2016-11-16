package controlador;

import java.awt.event.*;
import modelo.Empleado;
import modelo.EmpleadoDAO;
import vista.JFLogin;
import javax.swing.JOptionPane;

public class ControladorLogin implements ActionListener {

    JFLogin vistaLogin = new JFLogin();
    EmpleadoDAO modeloLogin = new EmpleadoDAO();
    Empleado empleado = new Empleado();
    
    public ControladorLogin(JFLogin vistaLogin, EmpleadoDAO modeloLogin){
        this.vistaLogin = vistaLogin;
        this.modeloLogin = modeloLogin;
        this.vistaLogin.btnIngresar.addActionListener(this);
    }
    
    public void InicializarLogin(){
        
    }
    
    public void actionPerformed(ActionEvent e){
        String dni = vistaLogin.txtDni.getText();
        String pass = String.valueOf(vistaLogin.txtPass.getPassword());
        String privilegio = String.valueOf(vistaLogin.cboPrivilegio.getSelectedItem());
        
        empleado = modeloLogin.verificaPreparedStatement(dni, pass, privilegio);
        
        if(empleado==null){
            JOptionPane.showMessageDialog(vistaLogin,"Empleado con datos ingresados no encontrado");
        }else {
            JOptionPane.showMessageDialog(vistaLogin,"Datos Correctos");
        }  
    }
}
