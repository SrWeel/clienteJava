<%-- 
    Document   : listar
    Created on : 22/05/2023, 11:29:44
    Author     : DELL
--%>


<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
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
        <h1>Hola Aquí está la lista de Alumnos en la base de datos</h1>
        
        <a href="Controlador?accion=add">Agregar</a>
        <br><br>
        <table>
            <thead>
            <th>Código</th>
            <th>Cédula</th>
            <th>Nombres</th>
            <th>Apellido</th>
            <th>Email</th>
            <th>Contraseña</th>
            
            </thead>
            
            
            <%
                
                
                
                AlumnoDAO aludao = new AlumnoDAO();
                List<Alumno>list = aludao.listar();
                Iterator<Alumno>iter =list.iterator();// {},{},{}
                Alumno alu = null;
                
                while(iter.hasNext()){
                    alu=iter.next();//{2,172245,Jaimito Perez},

            %>
            
            <tbody>
                <tr>
                    <td><%= alu.getId()%></td><!-- 2 -->
                    <td><%= alu.getCed()%></td><!-- 172245 -->
                    <td><%= alu.getNombres()%></td><!-- 'Jaimito Perez' -->
                    <td><%= alu.getApellidos()%></td>
                    <td><%= alu.getEmail()%></td>
                    <td><%= alu.getPassword()%></td>
                            
                    <td>
                        <a href="Controlador?accion=editar&id=<%= alu.getId()%>">Editar</a>
                        <a href="Controlador?accion=eliminar&id=<%= alu.getId()%>">Eliminar</a>
                    </td>
                </tr>
            </tbody>
            
            
            
            <%
            }
            %>
        </table>
        
    </body>
</html>
