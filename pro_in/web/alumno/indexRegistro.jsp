


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
        <li class="nav-item">
            <a class="nav-link active" href="alumno/indexRegistro.jsp">Cuenta</a>
        </li>
        
    </div>

        <div class="container mt-5">
            <form action="Controlador" >
                <div class="form-group row">
                    <label for="origin" class="col-sm-2 col-form-label">Desde:</label>
                    <div class="col-sm-4">
                        <select name="origin" id="origin" class="form-control" onchange="updateNavbar(); loadAirports();">
                            <option value="idk" disabled selected>Selecciona un Pais</option>
                            <%
                                List<Pais> pais = new VueloDAO().getCountry();
                                for (Pais pa : pais) {


                            %>

                            <option value="<%= pa.getId()%> "><%= pa.getPaisnombre()%></option>
                            <%
                                }
                            %>
                        </select>



                    </div>



                    <label for="destination" class="col-sm-2 col-form-label">Hacia:</label>
                    <div class="col-sm-4">
                        <select name="destination" id="destination" class="form-control">
                            <option value="" disabled selected>Selecciona un Pais</option>
                            <%
                                for (Pais pa : pais) {
                            %>

                            <option value="<%= pa.getId()%> "><%= pa.getPaisnombre()%></option>
                            <%
                                }
                            %>

                        </select>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="departureDate" class="col-sm-2 col-form-label">Aeropuerto: </label>
                    <div class="col-sm-4">
                        <select name="airport" id="airport" class="form-control">
                            <option value="" disabled selected >Aeropuerto</option>
                             <%
                                 List<Ciudad> ciudades = new VueloDAO().tablaAeropuertos();
                                                 for (Ciudad ciudad : ciudades) {

                                 

                                  %>
                            
                            <option value="<%= ciudad.getId_pais()%>"><%= ciudad.getNombre() %></option>
                          <%}%>
                        </select>
                    </div>

                    <label for="returnDate" class="col-sm-2 col-form-label">Aeropuerto:</label>
                    <div class="col-sm-4">
                        <select name="airport_d" id="airport_d" class="form-control">
                            <option value="" disabled selected >Aeropuerto</option>
                        </select>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="departureDate" class="col-sm-2 col-form-label">Fecha a Resevar:</label>
                    <div class="col-sm-4">
                        <input type="date" name="departureDate" id="departureDate" class="form-control">
                    </div>
                </div>

                <div class="form-group row">
                    <label for="passengers" class="col-sm-2 col-form-label">Número de Pasajeros:</label>
                    <div class="col-sm-4">
                        <input type="number" name="passengers" id="
                               " class="form-control" min="1" max="10">
                    </div>

                    <div class="col-sm-6">
                        <!-- Contenedor animado utilizando la clase animate__animated de Animate.css -->
                        <div class="animate__animated animate__fadeInRight">
                            <input type="submit" value="Registro" class="btn btn-primary">
                        </div>
                    </div>
                </div>
            </form>
        </div>

        <!-- Incluir Bootstrap JS y dependencias (jQuery) al final del documento -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

        <script>
                            function updateNavbar() {
                                const originSelect = document.getElementById('origin');
                                const destinationSelect = document.getElementById('destination');
                                const navbarBrand = document.getElementById('navbarBrand');
                                const airportContainer = document.getElementById('airportContainer');

                                if (originSelect.value !== "" && destinationSelect.value !== "") {
                                    navbarBrand.textContent = "Registro";
                                    navbarBrand.style.color = "blue";
                                } else {
                                    navbarBrand.textContent = "Palemar Airline";
                                    navbarBrand.style.color = "";
                                }

                                airportContainer.style.display = originSelect.value !== "" ? 'block' : 'none';
                            }

                            function loadAirports() {
                                const originSelect = document.getElementById('origin');
                                const airportSelect = document.getElementById('airport');

                                const selectedCountryId = originSelect.value;


                                // Aquí deberías obtener los aeropuertos disponibles para el país seleccionado.
                                // Puedes hacer una petición AJAX o cargarlos desde un objeto previamente definido.

                                // Ejemplo de cómo cargar los aeropuertos desde un objeto predefinido:


                                airportSelect.innerHTML = ''; // Limpiamos el contenido actual del select

                                if (selectedCountryId in id_alumno) {
                                    const airports = id_alumno;
                                    airports.forEach((airport) => {
                                        const option = document.createElement('option');
                                        option.value = airport;
                                        option.textContent = airport;
                                        airportSelect.appendChild(option);
                                    });
                                } else {
                                    const option = document.createElement('option');
                                    option.value = '';
                                    option.textContent = 'No se encontraron aeropuertos';
                                    airportSelect.appendChild(option);
                                }
                            }
        </script>

    </body>
</html>


