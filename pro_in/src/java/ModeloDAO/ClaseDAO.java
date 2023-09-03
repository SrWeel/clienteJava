/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUD_cla;
import Modelo.Alu;
import Modelo.Clase;
import Modelo.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class ClaseDAO implements CRUD_cla {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
                    Alu al = new Alu();
                    Clase cla =new Clase();


    public List<Alu> obteneralumnos() {
        List<Alu> alumnos = new ArrayList<>();
        String sql = "SELECT * FROM alumno";
        try {

            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            //rs={9}
            while (rs.next()) {
                Alu al = new Alu();

                al.setAlumno_id(rs.getInt("alumno_id"));
                al.setNombre(rs.getString("nombre"));

                alumnos.add(al);
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }

        return alumnos;
    }
    
    
    
   public List<Clase> tablaNombres() {
    List<Clase> clases = new ArrayList<>();
     String sql = "SELECT c.*, m.nombre_materia, a.nombre "
           + "FROM Clase c "
           + "INNER JOIN materia m ON c.materia_id = m.id_mate " 
           + "INNER JOIN alumno a ON c.alumno_id = a.alumno_id";

    
    try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();

        while (rs.next()) {
            Clase cla = new Clase();
            cla.setId_cla(rs.getInt("id_cla"));
            cla.setId_alumno(rs.getInt("alumno_id"));
            cla.setId_materia(rs.getInt("materia_id"));
            cla.setNombre_profesor(rs.getString("nombre_profesor"));
            cla.setParalelo(rs.getString("paralelo"));
            cla.setSemestre(rs.getString("semestre"));
            cla.setNombre_materia(rs.getString("nombre_materia")); //nombre de la materia
            cla.setNombre_alu(rs.getString("nombre"));
            clases.add(cla);
        }
    } catch (Exception e) {
        System.out.println("Error: " + e);
    }
    return clases;
}

    
    
    

    public List<Materia> obtenermaterias() {
        List<Materia> materias = new ArrayList<>();
        String sql = "SELECT * FROM materia";
        try {

            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            //rs={9}
            while (rs.next()) {
                Materia mat = new Materia();
                mat.setId_mate(rs.getInt("id_mate"));
                mat.setNombre_materia(rs.getString("nombre_materia"));

                materias.add(mat);
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }

        return materias;
    }
    public Clase list(int id_cla) {
       
        //SELECT * FROM alumno WHERE Id = 3
            String sql = "SELECT * FROM clase WHERE id_cla="+id_cla; 
            try {

                con = cn.getConnection();
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();

                while(rs.next()){
                    cla.setId_cla(rs.getInt(id_cla));
                    
                }

            } catch (Exception e) {
                System.out.println("Error en: "+e);
            }
            return cla;
    }
    public boolean edit(Clase cla) {
        String sql = "UPDATE clase set alumno_id='"+cla.getId_alumno()+"', materia_id='"+cla.getId_materia()+"', nombre_profesor='"+cla.getNombre_profesor()+"', paralelo='"+cla.getParalelo()+"', semestre='"+cla.getSemestre()+"' WHERE id_cla="+cla.getId_cla();
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("Error al modificar en: "+e);
        }
        
       
        return false;   
    }

    public boolean registrarClase(Clase clase) {
        String sql = "INSERT INTO clases(alumno_id,materia_id,nombre_profesor,paralelo,semestre) values('" + clase.getId_alumno() + "','" + clase.getId_cla() + "','" + clase.getNombre_profesor() + "','" + clase.getParalelo() + "','" + clase.getSemestre() + "')";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error al guardar en: " + e);
        }

        return false;
    }

    @Override
    public boolean add(Clase cla) {
        String sql = "INSERT INTO clase(alumno_id,materia_id,nombre_profesor,paralelo,semestre) values('" + cla.getId_alumno() + "','" + cla.getId_cla() + "','" + cla.getNombre_profesor() + "','" + cla.getParalelo() + "','" + cla.getSemestre() + "')";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error al guardar en: " + e);
        }

        return false;
    }

    @Override
    public List listar() {
        ArrayList<Clase>list = new ArrayList<>();
        String sql = "SELECT * FROM clase";
        try {
            
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            //rs={9}
            while(rs.next()){
            Clase cla = new Clase();
            ClaseDAO cladao =new ClaseDAO();
            cla.setId_cla(rs.getInt("id_cla"));
                        cla.setId_alumno(rs.getInt("alumno_id"));

            cla.setId_materia(rs.getInt("materia_id"));
            cla.setNombre_profesor(rs.getString("nombre_profesor"));
            cla.setParalelo(rs.getString("paralelo"));
            cla.setSemestre(rs.getString("semestre"));
                
                /*
                id   ced    nombress
                1   1722     JunaiP
                2   17222    Maria C
                3   1723     Juan T
                = alu
                */
                list.add(cla);  //
                /*
                list.add
                {1,1788345672,'Grace Padilla'},
                {2,172245,Jaimito Perez},
                {},{},{}
                
                
                */
                
            }
        
        } catch (Exception e) {
            System.out.println("Error en: "+e);
        }

        return list;
    }

    private Alu obteneralumnosID(int alumno_id) {

        String sql = "SELECT * FROM alumno WHERE alumno_id=" + alumno_id;
        try {

            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            //rs={9}
            while (rs.next()) {
                Alu al = new Alu();

                al.setAlumno_id(rs.getInt("alumno_id"));
                al.setNombre(rs.getString("nombre"));
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }

        return al;
    }
    private List<Materia> obtenermateriasID(int id_mate) {
        List<Materia> materias = new ArrayList<>();

        String sql = "SELECT * FROM materia WHERE id_mate=" + id_mate;
        try {

            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            //rs={9}
            while (rs.next()) {
                Materia mat = new Materia();
                mat.setId_mate(rs.getInt("id_mate"));
                mat.setNombre_materia(rs.getString("nombre_materia"));

                materias.add(mat);
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }

        return materias;
    }
}
