<%@page import="Modelo.Materia"%>
<%@page import="java.util.Iterator"%>
<%@page import="ModeloDAO.ClaseDAO"%>
<%@page import="Modelo.Alu"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <body>
    <center><h1>Registro de venta</h1></center>

    <form action="Controlador">
        <div class="form-group"
             <label for="id_alumno" class="seleccionAlumno">Selecciona el nombre del producto:</label>
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
             <label for="id_materia" class="seleccionMateria">Selecciona el codigo del producto</label>
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

        Nombre del Cliente:
        <input type="text" name="txtDoc">
        <br>
        <br>

        Total:
        <input type="text" name="txtPar">
        <br>
        <br>
        Total Descuento:
        <input type="text" name="txtSem">
        <br>
        <br>
        <input type="submit" name="accion" value="Agregar clase">
        <a href="Controlador?accion=listar_clase">Regresar</a>
        <a href="Controlador?accion=act1">RegistroV1</a>

    </form>



</body>
</html>