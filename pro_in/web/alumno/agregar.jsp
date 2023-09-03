<%-- 
    Document   : agregar
    Created on : 18/05/2023, 8:34:45
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alumnos</title>
    </head>
    <body>
    <center><h1>Registro de nuevos Alumnos</h1></center>
        
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
            <input type="submit" name="accion" value="Agregar">
            <a href="Controlador?accion=listar">Regresar</a>

        </form>
    
    
    
    </body>
</html>
