<%-- 
    Document   : editar_cla
    Created on : 22/07/2023, 23:47:41
    Author     : USUARIO
--%>

<%@page import="Modelo.Clase"%>
<%@page import="Modelo.Alu"%>
<%@page import="ModeloDAO.ClaseDAO"%>
<%@page import="Modelo.Materia"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            ClaseDAO dao = new ClaseDAO();
        int id_cla = Integer.parseInt((String)request.getAttribute("alumno_id"));
        Clase a =(Clase)dao.list(id_cla);
            %>
    <center><h1>Registro de nuevos Alumnos</h1></center>

    <form action="Controlador">
        <div class="form-group"
             <label for="id_alumno" class="seleccionAlumno">Selecciona el Alumno</label>
            <select name="id_alumno" id="id_alumno"class="form-control">
                <%
                    List<Alu> alumnos = new ClaseDAO().obteneralumnos();
                    for (Alu al : alumnos) {

                %>   

                <option value="<%= al.getAlumno_id()%>"><%=al.getNombre()%> </option>
                <%
                    }
                %>
            </select>
        </div>
        <div class="form-group"
             <label for="id_materia" class="seleccionMateria">Selecciona  la materia</label>
            <select name="id_materia" id="id_materia"class="form-control">
                <%
                    List<Materia> materia = new ClaseDAO().obtenermaterias();
                    for (Materia mat : materia) {

                %>   

                <option value="<%= mat.getId_mate()%>"><%=mat.getNombre_materia()%> </option>
                <%
                    }
                %>
            </select>
        </div>

        Nombre del docente:
        <input type="text" name="txtDoc">
        <br>
        <br>

        Paralelo:
        <input type="text" name="txtPar">
        <br>
        <br>
        Semestre:
        <input type="text" name="txtSem">
        <br>
        <br>
        <input type="hidden" name="txtIdA" value="<%= a.getId_cla()%>">

        <input type="submit" name="accion" value="Editar clase">
        <a href="Controlador?accion=li">Regresar</a>

    </form>



</body>
</html>
