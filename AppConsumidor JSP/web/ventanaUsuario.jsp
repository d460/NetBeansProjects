<%-- 
    Document   : ventanaUsuario
    Created on : 18/11/2016, 02:12:08 PM
    Author     : Dagoberto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bienvenid@
        <jsp:useBean id="validUsuario" scope="session" class="webservices.Empleado" />
        <jsp:getProperty name="validUsuario" property="nombres" /></h1>
        
        Registrar usuario
        <form action="SRegistra">
            <table border="0">
                    <tr>
                        <td>DNI:</td>
                        <td><input type="text" name="txtDni" value="" /></td>
                    </tr>
                    <tr>
                        <td>Pass:</td>
                        <td><input type="password" name="txtPass" value="" /></td>
                    </tr>
                    <tr>
                        <td>Apellidos:</td>
                        <td><input type="text" name="txtApellidos" value="" /></td>
                    </tr>
                    <tr>
                        <td>Nombre:</td>
                        <td><input type="text" name="txtNombres" value="" /></td>
                    </tr>
                    <tr>
                        <td>Privilegio:</td>
                        <td><select name="cboPrivilegio">
                                <option value="gerente">Gerente</option>
                                <option value="vendedor">Vendedor</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Registrar" name="btnregistrar" /></td>
                        <td></td>
                    </tr>
                </tbody>
            </table>

        </form>
        
        
    </body>
</html>
