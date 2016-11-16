
package controlador;

import java.awt.event.*;
import javax.swing.JOptionPane;
import modelo.Empleado;
import modelo.EmpleadoDAO;
import vista.JFGerente;

public class ControladorGerente implements ActionListener{
    
    JFGerente vistaGerente = new JFGerente();
    EmpleadoDAO modeloGerente = new EmpleadoDAO();
    Empleado empleado = new Empleado();
    String dni,pass,privilegio;
    
    public ControladorGerente(JFGerente vistaGerente, EmpleadoDAO modeloGerente){
        this.vistaGerente = vistaGerente;
        this.modeloGerente = modeloGerente;
        this.vistaGerente.btbDatosGerente.addActionListener(this);
        
    }
    
    public void InicializaGerente(String dni, String pass, String privilegio){
        this.dni = dni;
        this.pass = pass;
        this.privilegio = privilegio;
    }
    
    public void actionPerformed (ActionEvent e){
        empleado = modeloGerente.verificaPreparedStatement(dni, pass, privilegio);
        JOptionPane.showMessageDialog(vistaGerente, "Datos de usuario gerente\n"
                + "Apellidos y Nombre: " +empleado.getApellidos()+" " +empleado.getNombres()+
                "\nPrivilegio: " +empleado.getPrivilegios()+"");
        
    }
    
}
