<%-- 
    Document   : index
    Created on : 18/11/2016, 12:17:51 PM
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
        <h1 style="text-align: center">LOGIN USUARIO</h1>
        <form action="SAutentifica" method="POST">
            <table border="0" style="margin-left:28%">
                <tbody>
                    <tr>
                        <td>DNI:</td>
                        <td><input type="text" name="txtDni" value="" /></td>
                    </tr>
                    <tr>
                        <td>Password:</td>
                        <td><input type="password" name="txtPass" value="" /></td>
                    </tr>
                    <tr>
                        <td>Pivilegio:</td>
                        <td><select name="cboPrivilegio">
                                <option value="gerente">Gerente</option>
                                <option value="vendedor">Vendedor</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Ingresar" name="btnIngresar" /></td>
                        <td></td>
                    </tr>
                </tbody>
            </table>

        </form>
        
    </body>
</html>
