<%-- 
    Document   : agregarv
    Created on : 17/07/2023, 20:41:59
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Alumnos</title>
    </head>
    <body>
    <center><h1>Registro de nuevos Alumnos</h1></center>
        
        <form action="Controlador">
            Precio:
            <input type="text" name="Pre">
            <br>
            <br>
            Fecha salida:
            <input type="date" name="Fsa">
            <br>
            <br>
            Duracion de viaje:
            <input type="text" name="Dur" >
            <br>
            <br>
           Pais salida:
            <input type="text" name="Psa" >
            <br>
            <br>
           Ciudad salida:
            <input type="text" name="Csa">
            <br>
            <br>
           Pais llegada:
            <input type="text" name="Pll">
            <br>
            <br>
            Ciudad llegada: 
            <input type="text" name="Cll" >
            <br>
            <br>

            
            <input type="submit" name="accion" value="Agrega">
            <a href="Controlador?accion=listarv">Regresar</a>

        </form>
    
    
    
    </body>
</html>
