<%-- 
    Document   : listar_cla
    Created on : 22/07/2023, 22:56:29
    Author     : USUARIO
--%>
<%@page import="Modelo.Materia"%>
<%@page import="java.util.Iterator"%>
<%@page import="ModeloDAO.ClaseDAO"%>
<%@page import="Modelo.Alu"%>
<%@page import="java.util.List"%>

<%@page import="Modelo.Alu"%>
<%@page import="Modelo.Clase"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="ModeloDAO.ClaseDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Institucion</title>
    </head>
    <body>
        <h1>Detalle de ventas</h1>
        <hr>

        <a href="index.jsp">Agregar</a>
        <br><br>


        <table class="table">
            <thead>
                <tr>
                    <th>ID Venta</th>
                    <th>Nombre del producto</th>
                    <th>codigo del producto</th>
                    <th>Nombre del cliente</th>
                    <th>Total :</th>
                    <th>Total Descuento:</th>
                </tr>
            </thead>
            <tbody>
                <% List<Clase> clases = new ClaseDAO().tablaNombres();
                    for (Clase cla : clases) {
                %>   
                <tr>
                    <td><%= cla.getId_cla() %></td>
                    <td><%= cla.getNombre_alu() %></td>
                    <td><%= cla.getNombre_materia() %></td>
                    <td><%= cla.getNombre_profesor() %></td>
                    <td><%= cla.getParalelo() %></td>
                    <td><%= cla.getSemestre() %></td>
                </tr>
                <% }%>
                
                
            </tbody>
            
            
        </table>
















   

</body>
</html>