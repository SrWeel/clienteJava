<%-- 
    Document   : editar
    Created on : 22/05/2023, 11:30:29
    Author     : DELL
--%>

<%@page import="Modelo.Alumno"%>
<%@page import="ModeloDAO.AlumnoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        AlumnoDAO dao = new AlumnoDAO();
        int id = Integer.parseInt((String)request.getAttribute("idalu"));
        Alumno a =(Alumno)dao.list(id);

        %>
        
        <h1>Formulario de Modificación</h1>
        
        <form action="Controlador">
            Cédula:
            <input type="text" name="txtCed" value="<%= a.getCed()%>">
            <br>
            <br>
            Nombres:
            <input type="text" name="txtNom" value="<%= a.getNombres()%>">
            <br>
            <br>
            Apellidos:
            <input type="text" name="txtApe" value="<%= a.getApellidos()%>">
            <br>
            <br>
            Email:
            <input type="text" name="txtEma" value="<%= a.getEmail()%>">
            <br>
            <br>
            Contraseña:
            <input type="text" name="txtPass"value="<%= a.getPassword()%>">
            <br>
            <br>
            <input type="hidden" name="txtIdA" value="<%= a.getId()%>">
            <input type="submit" name="accion" value="Actualizar">
            <br>
            <a href="Controlador?accion=listar">Regresar</a>
        </form>
    </body>
</html>
