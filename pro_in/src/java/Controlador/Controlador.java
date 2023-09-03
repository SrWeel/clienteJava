/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Alumno;
import Modelo.Clase;
import Modelo.Reserva;
import Modelo.Usuario;
import Modelo.Vuelo;
import ModeloDAO.AlumnoDAO;
import ModeloDAO.ClaseDAO;
import ModeloDAO.ReservaDAO;
import ModeloDAO.UsuarioDAO;
import ModeloDAO.VueloDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
@WebServlet(name = "Controlador", urlPatterns = {"/Controlador"})
public class Controlador extends HttpServlet {
    
    String listar = "alumno/listar.jsp";
    String add= "alumno/agregar.jsp";
    String edit = "alumno/editar.jsp";
    String admin = "admin.jsp";
    String usua = "usuario.jsp";
    String init = "register.jsp";
    String ind = "index.jsp";
    String bien="bienvenido.jsp";
    String listarcla="clases/listar_cla.jsp";
    String actv1="alumno/indexRegistro.jsp";
    String travelView="alumno/viewTravel.jsp";
    
    ClaseDAO cladao=new ClaseDAO();
    Clase clas=new Clase();
    Alumno a = new Alumno();
    AlumnoDAO dao = new AlumnoDAO();
    int id;
    
    String listarv="vuelo/listarv.jsp";
    String addv= "vuelo/agregarv.jsp";
    String editv="vuelo/editarv.jsp";
    Vuelo av=new Vuelo();
    VueloDAO daov =new VueloDAO();
    int idv;
    
    String listarre="reserva/listarre.jsp";
    String addr="reserva/agregarre.jsp";
    
    Reserva res=new Reserva();
    ReservaDAO daor= new ReservaDAO();
    int idr;
    
    
    Usuario u = new Usuario();
    UsuarioDAO udao = new UsuarioDAO();
    

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String acceso = "";
        
        String action = request.getParameter("accion");// obtiene el valor de acci
        
        // editar == listar
        if(action.equalsIgnoreCase("listar")){
            acceso = listar;
            
         // editar == add  
        }else if(action.equalsIgnoreCase("Agregar clase")){
            int  id_alumno = Integer.parseInt(request.getParameter("id_alumno"));
            int  id_materia = Integer.parseInt(request.getParameter("id_materia"));
            String docente=request.getParameter("txtDoc");
            String paralelo=request.getParameter("txtPar");   
            String semestre=request.getParameter("txtSem");
            
            clas.setId_alumno(id_alumno);
            clas.setId_cla(id_materia);
            clas.setNombre_profesor(docente);
            clas.setParalelo(paralelo);
            clas.setSemestre(semestre);
            cladao.add(clas);

        }else if(action.equalsIgnoreCase("Registro")){
            int origin = Integer.parseInt(request.getParameter("origin"));
            int destination = Integer.parseInt(request.getParameter("destination"));
            int airport = Integer.parseInt(request.getParameter("airport"));
            int airport_d = Integer.parseInt(request.getParameter("airport_d"));
            String date_t = request.getParameter("departureDate");
            int passengers = Integer.parseInt(request.getParameter("passengers"));
            
            
            
        }else if(action.equalsIgnoreCase("listar_clase")){
            acceso = listarcla;    
        }
        
        
        else if(action.equalsIgnoreCase("listarv")){
            acceso=listarv;
        }else if(action.equalsIgnoreCase("inicio")){
            acceso=ind;
        }else if(action.equalsIgnoreCase("listarre")){
            acceso=listarre;
        }else if(action.equalsIgnoreCase("addr")){
            acceso = addr;
        }else if(action.equalsIgnoreCase("Continuar")){
            String org=request.getParameter("Org");
            String des=request.getParameter("Des");   
            String fch=request.getParameter("Fec");
            String npa=request.getParameter("Npa");
            
            res.setOrigen(org);
            res.setDestino(des);
            res.setFecha(fch);
            res.setNpasajeros(npa);

            daor.add(res);
            acceso = bien;
        }
        else if(action.equalsIgnoreCase("Agregaa")){
            String org=request.getParameter("Org");
            String des=request.getParameter("Des");   
            String fch=request.getParameter("Fec");
            String npa=request.getParameter("Npa");
            
            res.setOrigen(org);
            res.setDestino(des);
            res.setFecha(fch);
            res.setNpasajeros(npa);

            daor.add(res);
            acceso = listarre;
            
        }else if(action.equalsIgnoreCase("addv")){
            acceso = addv;
         // editar = Agregar
        }else if(action.equalsIgnoreCase("Agrega")){
            float pre = Float.parseFloat(request.getParameter("Pre"));
            String fsa=request.getParameter("Fsa");
            String dur=request.getParameter("Dur");   
            String psa=request.getParameter("Psa");
            String csa=request.getParameter("Csa");
            String pll=request.getParameter("Pll");
            String cll=request.getParameter("Cll");
            av.setPrecio(pre);
            av.setFsalida(fsa);
            av.setDuracion(dur);
           av.setPsalida(psa);
            av.setCsalida(csa);
            av.setPllegada(pll);
            av.setCllegada(cll);
            daov.add(av);
            acceso = listarv;
            
        }else if(action.equalsIgnoreCase("add")){
            acceso = add;
         // editar = Agregar
        }else if(action.equalsIgnoreCase("init")){
            acceso = init;
              
      
         // editar = Agregar
        }else if(action.equalsIgnoreCase("travel")){
            acceso = travelView;
              
      
         // editar = Agregar
        }else if(action.equalsIgnoreCase("Registrar")){
        
            String ced = request.getParameter("txtCed");
            //     ced = 1212
            String nom = request.getParameter("txtNom");
            //     nom = asas
            String ape = request.getParameter("txtApe");
            String ema = request.getParameter("txtEma");
            String pass = request.getParameter("txtPass");
            
            a.setCed(ced);
            a.setNombres(nom);
            a.setApellidos(ape);
            a.setEmail(ema);
            a.setPassword(pass);
            // a = {1212, asas}
            dao.add(a);// termina
            
            acceso = listar;
        }else if(action.equalsIgnoreCase("Agregar")){
        
            String ced = request.getParameter("txtCed");
            //     ced = 1212
            String nom = request.getParameter("txtNom");
            //     nom = asas
            String ape = request.getParameter("txtApe");
            String ema = request.getParameter("txtEma");
            String pass = request.getParameter("txtPass");
            
            a.setCed(ced);
            a.setNombres(nom);
            a.setApellidos(ape);
            a.setEmail(ema);
            a.setPassword(pass);
            // a = {1212, asas}
            dao.add(a);// termina
            
            acceso = listar;// alumno/listar.jsp
            // editar = editar
        }else if(action.equalsIgnoreCase("editarv")){
        
            request.setAttribute("idvue", request.getParameter("idv"));
            acceso = editv;
            
        }else if(action.equalsIgnoreCase("Actualiza")){
            
            idv = Integer.parseInt(request.getParameter("txtIdv"));
            float pre = Float.parseFloat(request.getParameter("Pre"));
            String fsa=request.getParameter("Fsa");
            String dur=request.getParameter("Dur");   
            String psa=request.getParameter("Psa");
            String csa=request.getParameter("Csa");
            String pll=request.getParameter("Pll");
            String cll=request.getParameter("Cll");

            

            av.setIdv(idv);
            av.setPrecio(pre);
            av.setFsalida(fsa);
            av.setDuracion(dur);
           av.setPsalida(psa);
            av.setCsalida(csa);
            av.setPllegada(pll);
            av.setCllegada(cll);

            
            daov.edit(av);
            
            acceso = listarv;
            // eliminar = eliminar
        }else if(action.equalsIgnoreCase("editar")){
        
            request.setAttribute("idalu", request.getParameter("id"));
            acceso = edit; // edit = "alumno/editar.jsp"
        }else if(action.equalsIgnoreCase("Actualizar")){
            
            id = Integer.parseInt(request.getParameter("txtIdA"));
            String ced=request.getParameter("txtCed");
            String nom = request.getParameter("txtNom");
            String ape = request.getParameter("txtApe");
            String ema = request.getParameter("txtEma");
            String pass = request.getParameter("txtPass");
            a.setId(id);
            a.setCed(ced);
            a.setNombres(nom);
            a.setApellidos(ape);
            a.setEmail(ema);
            a.setPassword(pass);
            
            dao.edit(a);
            
            acceso = listar;
            // eliminar = eliminar
        }else if(action.equalsIgnoreCase("eliminar")){
             id = Integer.parseInt(request.getParameter("id"));
             a.setId(id);
             dao.delete(id);
             acceso=listar;
        }else if(action.equalsIgnoreCase("eliminav")){
             idv = Integer.parseInt(request.getParameter("idv"));
             av.setIdv(idv);
             daov.delete(idv);
             acceso=listarv;
           
        }else if(action.equalsIgnoreCase("act1")){
            acceso=actv1;
            
        }
        
        
        RequestDispatcher vista = request.getRequestDispatcher(acceso);
        vista.forward(request, response);
        
        
        
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
