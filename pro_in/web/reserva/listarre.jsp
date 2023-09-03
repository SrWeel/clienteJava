<%-- 
    Document   : listarre
    Created on : 18/07/2023, 15:23:10
    Author     : USUARIO
--%>

<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Reserva"%>
<%@page import="java.util.List"%>
<%@page import="ModeloDAO.ReservaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Lista de Reservas</title>
</head>
<body>
    <h1>Hola, aquí está la lista de reservas en la base de datos:</h1>

    <a href="Controlador?accion=addr">Agregar</a>
    <br><br>
    <table>
        <thead>
            <tr>
                <th>Código</th>
                <th>Origen</th>
                <th>Destino</th>
                <th>Fecha</th>
                <th>Número de Pasajeros</th>
            </tr>
        </thead>
        <tbody>
            <%
                ReservaDAO resdao = new ReservaDAO();
                List<Reserva> list = resdao.listar();
                for (Reserva res : list) {
            %>
            <tr>
                <td><%=res.getIdr()%></td>
                <td><%=res.getOrigen()%></td>
                <td><%=res.getDestino()%></td>
                <td><%=res.getFecha()%></td>
                <td><%=res.getNpasajeros()%></td>
            </tr>
            <% } %>
        </tbody>
    </table>
</body>
</html>
