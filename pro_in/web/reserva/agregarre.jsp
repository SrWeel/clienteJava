<%-- 
    Document   : agregarre
    Created on : 18/07/2023, 15:41:35
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
        <center><h1>Registro de nuevos Alumnos</h1></center>
        
        <form action="Controlador">
            Origen:
            <input type="text" name="Org">
            <br>
            <br>
            Destino:
            <input type="text" name="Des">
            <br>
            <br>
            Fecha:
            <input type="date" name="Fec" >
            <br>
            <br>
           Numero de pasajeros:
            <input type="text" name="Npa" >
            <br>
            <br>
            <input type="submit" name="accion" value="Agregaa">
            <a href="Controlador?accion=listarre">Regresar</a>

        </form>
    
    
    
    </body>
</html>
