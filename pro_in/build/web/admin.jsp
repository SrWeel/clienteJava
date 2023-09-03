<%-- 
    Document   : admin
    Created on : 19/06/2023, 10:45:42 AM
    Author     : User
--%>

<%@page import="Modelo.Usuario"%>
<%@page import="ModeloDAO.UsuarioDAO"%>

<% Usuario u = new Usuario(); 
UsuarioDAO udao = new UsuarioDAO();
String usu = request.getParameter("txtUsuario");
String pass = request.getParameter("txtPass");%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>HOLA <%= usu %> Eres un admin</h1>
        
    </body>
</html>
