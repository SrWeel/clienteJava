<%-- 
    Document   : vuelos
    Created on : 18/07/2023, 19:01:09
    Author     : Swooshing
--%>

<%@page import="Modelo.Reserva"%>
<%@page import="ModeloDAO.ReservaDAO"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Lista de Reservas</title>
</head>
<body>
    <h1>Vuelos Disponibles</h1>
    <br><br>
    <table>
        <thead>
            <tr>
                <th>Código</th>
                <th>Origen</th>
                <th>Destino</th>
                <th>Fecha</th>
                <th>Acciones</th>
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
                <td>
                    <form action="confirmar.jsp" method="post">
                        <input type="hidden" name="id_reserva" value="<%=res.getIdr()%>">
                        <button type="submit">Reservar</button>
                    </form>
                </td>
            </tr>
            <% } %>
        </tbody>
    </table>
</body>
</html>
