<%-- 
    Document   : confirmar
    Created on : 18/07/2023, 19:22:45
    Author     : Swooshing
--%>

<%@page import="Modelo.Vuelo"%>
<%@page import="ModeloDAO.VueloDAO"%>
<%@page import="Modelo.Reserva"%>
<%@page import="ModeloDAO.ReservaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Detalles de la Reserva y Boleto</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            padding: 20px;
        }

        .container {
            max-width: 600px;
            margin: 0 auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }

        h1 {
            text-align: center;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        th, td {
            padding: 10px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Detalles de la Reserva y Boleto</h1>

        <%-- Obtener el ID de la reserva seleccionada --%>
        <% String idReserva = request.getParameter("id_reserva"); %>

        <%-- Obtener la reserva y el vuelo correspondientes al ID --%>
        <% ReservaDAO reservaDAO = new ReservaDAO();
           Reserva reserva = reservaDAO.obtenerReservaPorId(Integer.parseInt(idReserva));
           VueloDAO vueloDAO = new VueloDAO();
           Vuelo vuelo = vueloDAO.obtenerVueloPorId(reserva.getIdVuelo());
        %>

        <%-- Mostrar los detalles de la reserva y el boleto --%>
        <table>
            <tr>
                <th>Código de Reserva</th>
                <td><%=reserva.getIdReserva()%></td>
            </tr>
            <tr>
                <th>Origen</th>
                <td><%=reserva.getOrigen()%></td>
            </tr>
            <tr>
                <th>Destino</th>
                <td><%=reserva.getDestino()%></td>
            </tr>
            <tr>
                <th>Fecha</th>
                <td><%=reserva.getFecha()%></td>
            </tr>
            <tr>
                <th>Número de Pasajeros</th>
                <td><%=reserva.getNumeroPasajeros()%></td>
            </tr>
            <tr>
                <th>Código de Vuelo</th>
                <td><%=vuelo.getCodigo()%></td>
            </tr>
            <tr>
                <th>Precio del Boleto</th>
                <td><%=vuelo.getPrecio()%></td>
            </tr>
            <tr>
                <th>Fecha de Salida</th>
                <td><%=vuelo.getFechaSalida()%></td>
            </tr>
            <tr>
                <th>Duración del Vuelo</th>
                <td><%=vuelo.getDuracion()%></td>
            </tr>
            <%-- Agregar más detalles del vuelo según tus necesidades --%>
        </table>
    </div>
</body>
</html>
