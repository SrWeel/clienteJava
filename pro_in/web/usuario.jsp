<%-- 
    Document   : usuario
    Created on : 19/06/2023, 10:45:51 AM
    Author     : User
--%>
<%@page import="ModeloDAO.MensajeDAO"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Usuario"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    Usuario u = new Usuario();
    UsuarioDAO udao = new UsuarioDAO();
    MensajeDAO edeo = new MensajeDAO();
    String usu = request.getParameter("txtUsuario");
    String pass = request.getParameter("txtPass");
    int idper = Integer.parseInt((String)request.getAttribute("idalu"));
    Usuario eo =(Usuario)edeo.msg(idper);

%>




<!DOCTYPE html>
<html>
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
jsp
<h1>HOLA <%= eo.getNombres()%> USUARIO COMUN</h1>

</body>