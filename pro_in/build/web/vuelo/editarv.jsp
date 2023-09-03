<%-- 
    Document   : editarv
    Created on : 17/07/2023, 19:28:46
    Author     : USUARIO
--%>

<%@page import="Modelo.Vuelo"%>
<%@page import="ModeloDAO.VueloDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            
            VueloDAO daov = new VueloDAO();
        int idv = Integer.parseInt((String)request.getAttribute("idvue"));
        Vuelo av =(Vuelo)daov.list(idv);


        %>

        <h1>Formulario de Modificación</h1>

        <form action="Controlador">
            Precio:
            <input type="text" name="Pre" value="<%=av.getPrecio()%>">
            <br>
            <br>
            Fecha salida:
            <input type="date" name="Fsa" value="<%=av.getFsalida()%>">
            <br>
            <br>
            Duracion de viaje:
            <input type="text" name="Dur" value="<%=av.getDuracion()%>">
            <br>
            <br>
           Pais salida:
            <input type="text" name="Psa" value="<%=av.getPsalida()%>">
            <br>
            <br>
           Ciudad salida:
            <input type="text" name="Csa" value="<%=av.getCsalida()%>">
            <br>
            <br>
           Pais llegada:
            <input type="text" name="Pll" value="<%=av.getPllegada()%>">
            <br>
            <br>
            Ciudad llegada: 
            <input type="text" name="Cll" value="<%=av.getCllegada()%>">
            <br>
            <br>

            <input type="hidden" name="txtIdv" value="<%= av.getIdv()%>">
            <input type="submit" name="accion" value="Actualiza">
            <br>
            <a href="Controlador?accion=listarv">Regresar</a>
        </form>
    </body>
</html>
