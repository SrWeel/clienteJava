<%-- 
    Document   : viewTravel
    Created on : 02/09/2023, 13:59:57
    Author     : oppsr
--%>

<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Travel"%>
<%@page import="ModeloDAO.TravelDAO"%>
<%@page import="Modelo.Ciudad"%>
<%@page import="Modelo.Alu"%>
<%@page import="ModeloDAO.ClaseDAO"%>
<%@page import="Modelo.Pais"%>
<%@page import="ModeloDAO.VueloDAO"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Formulario de Reserva de Vuelo</title>
        <!-- Incluir Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <!-- Incluir Animate.css para las animaciones -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css">
    </head>
    <body>
        <!-- Navbar -->
        <nav class="navbar navbar-expand-lg navbar-light bg-info">

        </nav>
        <div class="jumbotron">
            <h1 class="display-4">Palmera Airline</h1>
            <label for="welcome" id="welcome"></label>



            <ul class="nav nav-tabs">
                <li class="nav-item">
                    <a class="nav-link active" href="index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="Controlador?accion=travel">Ver Viajes</a>
                </li>
        </div>
        <div class="container">
            <h2>Actividades</h2>
                <br></br>
                <table class="table">
                    <thead>
                        <tr>
                            <th>ID Venta</th>
                            <th>Destino</th>
                            <th>Fecha de salida</th>
                            <th>Codigo del producto</th>
                            <th>Nombre del cliente</th>
                        </tr>
                    </thead>
                    <%
                        TravelDAO trdao = new TravelDAO();
                        List<Travel> list = trdao.listar();
                        Iterator<Travel> iter = list.iterator();
                        Travel trvl = null;
                        while (iter.hasNext()) {trvl = iter.next();
                    %>  
                    <tbody>
                        <tr>
                            <td><%= trvl.getId() %></td>
                            <td><%= trvl.getId_paisd() %></td>
                            <td><%= trvl.getFecha() %></td>
                            <td><%= trvl.getNombre() %></td>
                            <td><%= trvl.getPasajeros() %></td>
                            <td><%= trvl.getNombre_cliente() %></td>
                            <td><%= trvl.getPrecio() %></td>
                        </tr>
                    </tbody>
                    <%}%>  
                </table>
        </div>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

    </body>
</html>
