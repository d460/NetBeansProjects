
package transaccion;

public interface IEmpleadoDAO {
        public Empleado verificaStatement(String dni, String contraseña, String privilegio);
        public Empleado verificaPreparedStatement(String dni, String contraseña, String privilegio);
        public Empleado verificaCallableStatement(String dni, String contraseña, String privilegio);
    
}
