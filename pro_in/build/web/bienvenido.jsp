<%-- 
    Document   : bienvenido
    Created on : 18/07/2023, 19:29:15
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center><h1>Datos personales</h1></center>
        
        <form action="Controlador">
            Cédula:
            <input type="text" name="txtCed">
            <br>
            <br>
            Nombres:
            <input type="text" name="txtNom">
            <br>
            <br>
            Apellidos:
            <input type="text" name="txtApe">
            <br>
            <br>
            Email:
            <input type="text" name="txtEma">
            <br>
            <br>
            Contraseña:
            <input type="text" name="txtPass">
            <br>
            <br>
            <input type="submit" name="accion" value="Registrar">
            <a href="Controlador?accion=inicio">Regresar</a>

        </form>
    </body>
</html>
