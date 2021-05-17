<%-- 
    Document   : index
    Created on : 29/09/2020, 09:05:22 AM
    Author     : joseluissuarez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mi Empresa S.A.</title>
    </head>
    <body>
    <center>
        <h1>Ingresar</h1>
        <br><br>
        <form action="ValidaUsuario" method="POST">
            <br>Usuario <input type="text" name="alias" value="" required="true"/>
            <br>Contraseña <input type="password" name="contrasena" value=""  required="true"/>
            <br><br><input type="submit" value="Aceptar" />
        </form>
        <br><br><br><br>
        ${mensaje}
    </center>
</body>
</html>
