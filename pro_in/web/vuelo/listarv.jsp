<%-- 
    Document   : listarv
    Created on : 17/07/2023, 19:16:55
    Author     : USUARIO
--%>

<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Vuelo"%>
<%@page import="java.util.List"%>
<%@page import="ModeloDAO.VueloDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hola Aquí está la lista de vuelos en la base de datos</h1>
        
        <a href="Controlador?accion=addv">Agrega</a>
        <br><br>
        <table>
            <thead>
            <th>Código</th>
            <th>Precio</th>
            <th>Fecha salida</th>
            <th>Duracion de viaje</th>
             <th>Pais salida</th>
            <th>Ciudad salida</th>
            <th>Pais llegada</th>
            <th>Ciudad llegada</th>
            
            </thead>
            
            
            <%
                
                
                VueloDAO vuedao=new VueloDAO();
                List<Vuelo>list = vuedao.listar();
                Iterator<Vuelo>iter =list.iterator();// {},{},{}
                Vuelo vue = null;
                
                while(iter.hasNext()){
                    vue=iter.next();//{2,172245,Jaimito Perez},

            %>
            
            <tbody>
                <tr>
                    <td><%=vue.getIdv()%></td>
                    <td><%=vue.getPrecio()%></td>
                    <td><%=vue.getFsalida()%></td>
                    <td><%=vue.getDuracion()%></td>
                  <td><%=vue.getPsalida()%></td>
                     <td><%=vue.getCsalida()%></td>
                    <td><%=vue.getPllegada()%></td>
                    <td><%=vue.getCllegada()%></td>
   
                     <td>
                        <a href="Controlador?accion=editarv&idv=<%= vue.getIdv()%>">Editar</a>
                        <a href="Controlador?accion=eliminav&idv=<%= vue.getIdv()%>">Eliminar</a>

                    </td>       
                    
                </tr>
            </tbody>
            
            
            
            <%
            }
            %>
        </table>
        
    </body>
</html>

