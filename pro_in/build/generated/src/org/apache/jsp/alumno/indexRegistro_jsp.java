package org.apache.jsp.alumno;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.Ciudad;
import Modelo.Alu;
import ModeloDAO.ClaseDAO;
import Modelo.Pais;
import ModeloDAO.VueloDAO;
import java.util.List;

public final class indexRegistro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Formulario de Reserva de Vuelo</title>\n");
      out.write("        <!-- Incluir Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("        <!-- Incluir Animate.css para las animaciones -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Navbar -->\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-info\">\n");
      out.write("            \n");
      out.write("        </nav>\n");
      out.write("        <div class=\"jumbotron\">\n");
      out.write("        <h1 class=\"display-4\">Palmera Airline</h1>\n");
      out.write("        <label for=\"welcome\" id=\"welcome\"></label>\n");
      out.write("       \n");
      out.write("      \n");
      out.write("        \n");
      out.write("        <ul class=\"nav nav-tabs\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link active\" href=\"index.jsp\">Home</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link active\" href=\"index.jsp\">Ver Viajes</a>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("        <div class=\"container mt-5\">\n");
      out.write("            <form action=\"Controlador\" >\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label for=\"origin\" class=\"col-sm-2 col-form-label\">Desde:</label>\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <select name=\"origin\" id=\"origin\" class=\"form-control\" onchange=\"updateNavbar(); loadAirports();\">\n");
      out.write("                            <option value=\"idk\" disabled selected>Selecciona un Pais</option>\n");
      out.write("                            ");

                                List<Pais> pais = new VueloDAO().getCountry();
                                for (Pais pa : pais) {


                            
      out.write("\n");
      out.write("\n");
      out.write("                            <option value=\"");
      out.print( pa.getId());
      out.write(" \">");
      out.print( pa.getPaisnombre());
      out.write("</option>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                        </select>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <label for=\"destination\" class=\"col-sm-2 col-form-label\">Hacia:</label>\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <select name=\"destination\" id=\"destination\" class=\"form-control\">\n");
      out.write("                            <option value=\"\" disabled selected>Selecciona un Pais</option>\n");
      out.write("                            ");

                                for (Pais pa : pais) {
                            
      out.write("\n");
      out.write("\n");
      out.write("                            <option value=\"");
      out.print( pa.getId());
      out.write(" \">");
      out.print( pa.getPaisnombre());
      out.write("</option>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label for=\"departureDate\" class=\"col-sm-2 col-form-label\">Aeropuerto: </label>\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <select name=\"airport\" id=\"origin\" class=\"form-control\">\n");
      out.write("                            <option value=\"\" disabled selected >Aeropuerto</option>\n");
      out.write("                             ");

                                 List<Ciudad> ciudades = new VueloDAO().tablaAeropuertos();
                                 for (Ciudad c : ciudades) {
                                 

                                  
      out.write("\n");
      out.write("                            \n");
      out.write("                            <option value=\"");
      out.print( c.getId() );
      out.write(" \">");
      out.print( c.getNombre() );
      out.write("</option>\n");
      out.write("                          ");
}
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <label for=\"returnDate\" class=\"col-sm-2 col-form-label\">Aeropuerto:</label>\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <select name=\"airport\" id=\"origin\" class=\"form-control\">\n");
      out.write("                            <option value=\"\" disabled selected >Aeropuerto</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label for=\"departureDate\" class=\"col-sm-2 col-form-label\">Fecha a Resevar:</label>\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <input type=\"date\" name=\"departureDate\" id=\"departureDate\" class=\"form-control\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label for=\"passengers\" class=\"col-sm-2 col-form-label\">Número de Pasajeros:</label>\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <input type=\"number\" name=\"passengers\" id=\"passengers\" class=\"form-control\" min=\"1\" max=\"10\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-sm-6\">\n");
      out.write("                        <!-- Contenedor animado utilizando la clase animate__animated de Animate.css -->\n");
      out.write("                        <div class=\"animate__animated animate__fadeInRight\">\n");
      out.write("                            <input type=\"submit\" value=\"Registro\" class=\"btn btn-primary\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Incluir Bootstrap JS y dependencias (jQuery) al final del documento -->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("                            function updateNavbar() {\n");
      out.write("                                const originSelect = document.getElementById('origin');\n");
      out.write("                                const destinationSelect = document.getElementById('destination');\n");
      out.write("                                const navbarBrand = document.getElementById('navbarBrand');\n");
      out.write("                                const airportContainer = document.getElementById('airportContainer');\n");
      out.write("\n");
      out.write("                                if (originSelect.value !== \"\" && destinationSelect.value !== \"\") {\n");
      out.write("                                    navbarBrand.textContent = \"Registro\";\n");
      out.write("                                    navbarBrand.style.color = \"blue\";\n");
      out.write("                                } else {\n");
      out.write("                                    navbarBrand.textContent = \"Palemar Airline\";\n");
      out.write("                                    navbarBrand.style.color = \"\";\n");
      out.write("                                }\n");
      out.write("\n");
      out.write("                                airportContainer.style.display = originSelect.value !== \"\" ? 'block' : 'none';\n");
      out.write("                            }\n");
      out.write("\n");
      out.write("                            function loadAirports() {\n");
      out.write("                                const originSelect = document.getElementById('origin');\n");
      out.write("                                const airportSelect = document.getElementById('airport');\n");
      out.write("\n");
      out.write("                                const selectedCountryId = originSelect.value;\n");
      out.write("\n");
      out.write("\n");
      out.write("                                // Aquí deberías obtener los aeropuertos disponibles para el país seleccionado.\n");
      out.write("                                // Puedes hacer una petición AJAX o cargarlos desde un objeto previamente definido.\n");
      out.write("\n");
      out.write("                                // Ejemplo de cómo cargar los aeropuertos desde un objeto predefinido:\n");
      out.write("\n");
      out.write("\n");
      out.write("                                airportSelect.innerHTML = ''; // Limpiamos el contenido actual del select\n");
      out.write("\n");
      out.write("                                if (selectedCountryId in id_alumno) {\n");
      out.write("                                    const airports = id_alumno;\n");
      out.write("                                    airports.forEach((airport) => {\n");
      out.write("                                        const option = document.createElement('option');\n");
      out.write("                                        option.value = airport;\n");
      out.write("                                        option.textContent = airport;\n");
      out.write("                                        airportSelect.appendChild(option);\n");
      out.write("                                    });\n");
      out.write("                                } else {\n");
      out.write("                                    const option = document.createElement('option');\n");
      out.write("                                    option.value = '';\n");
      out.write("                                    option.textContent = 'No se encontraron aeropuertos';\n");
      out.write("                                    airportSelect.appendChild(option);\n");
      out.write("                                }\n");
      out.write("                            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
