/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUD_v;
import Modelo.Ciudad;
import Modelo.Vuelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Modelo.Pais;


/**
 *
 * @author USUARIO
 */
public class VueloDAO implements CRUD_v{
    Conexion cn =  new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    Vuelo vue=new Vuelo();
    Pais Pais= new Pais();
    public List<Pais> getCountry(){
         List<Pais> pais = new ArrayList<>();
        String sql = "SELECT * FROM pais";
        try {

            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            //rs={9}
            while (rs.next()) {
                Pais pa = new Pais();

                pa.setId(rs.getInt("id"));
                pa.setPaisnombre(rs.getString("paisnombre"));

                pais.add(pa);
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }

        return pais;
    }
    
       public List<Ciudad> tablaAeropuertos() {
    List<Ciudad> ciudades= new ArrayList<>();
     String sql = "SELECT p.*, c.nombre "
           + "FROM pais p "
           + "INNER JOIN ciudad c ON p.id = c.pais_id " ;

    
    try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();

        while (rs.next()) {
            Ciudad ciu = new Ciudad();
            
            ciu.setId(rs.getInt("id"));
            ciu.setId_pais(rs.getInt("pais_id"));
            ciu.setNombre(rs.getString("nombre"));
            
            ciudades.add(ciu);
        }
    } catch (Exception e) {
        System.out.println("Error: " + e);
    }
    return ciudades;
}
        
    

    @Override
    public List listar() {
        ArrayList<Vuelo>list = new ArrayList<>();
        String sql = "SELECT * FROM vuelo";
        try {
            
            con = cn.getConnection();
            ps = con.prepareStatement(sql); 
            rs = ps.executeQuery();
            
            //rs={9}
            while(rs.next()){
                Vuelo vue=new Vuelo();
                vue.setIdv(rs.getInt("idv"));
                vue.setPrecio(rs.getFloat("precio"));
                vue.setFsalida(rs.getString("fsalida"));
                vue.setDuracion(rs.getString("duracion"));
                vue.setPsalida(rs.getString("psalida"));
                vue.setCsalida(rs.getString("csalida"));
                vue.setPllegada(rs.getString("pllegada"));
                vue.setCllegada(rs.getString("cllegada"));
                
                list.add(vue);
            }
            } catch (Exception e) {
            System.out.println("Error en: "+e);
        }

        return list;
    }
    

    @Override
    public Vuelo list(int idv) {
        String sql = "SELECT * FROM vuelo WHERE idv="+idv; 
        try {
            
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                vue.setIdv(rs.getInt("idv"));
                vue.setPrecio(rs.getFloat("precio"));
                vue.setFsalida(rs.getString("fsalida"));
                vue.setDuracion(rs.getString("duracion"));
                vue.setPsalida(rs.getString("psalida"));
                vue.setCsalida(rs.getString("csalida"));
                vue.setPllegada(rs.getString("pllegada"));
                vue.setCllegada(rs.getString("cllegada"));
                            
            }
        
        } catch (Exception e) {
            System.out.println("Error en: "+e);
        }
        return vue;
                
        
    }

    @Override
    public boolean add(Vuelo vue) {
        String sql = "insert into vuelo(precio,fsalida,duracion,psalida,csalida,pllegada,cllegada)values('"+vue.getPrecio()+"','"+vue.getFsalida()+"','"+vue.getDuracion()+"','"+vue.getPsalida()+"','"+vue.getCsalida()+"','"+vue.getPllegada()+"','"+vue.getCllegada()+"')";
        
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("Error al guardar en: "+e);
        }
        
        return false;
    }

    @Override
    public boolean edit(Vuelo vue) {
            String sql = "UPDATE vuelo set precio='"+vue.getPrecio()+"',fsalida='"+vue.getFsalida()+"',duracion='"+vue.getDuracion()+"',psalida='"+vue.getPsalida()+"',csalida='"+vue.getCsalida()+"',pllegada='"+vue.getPllegada()+"',cllegada='"+vue.getCllegada()+"' WHERE idv="+vue.getIdv();
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("Error al modificar en: "+e);
        }
        
        
        return false;   
    }

    @Override
    public boolean delete(int idv) {
        String sql = "delete from vuelo where idv="+idv; // mod

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("Error al modificar en: "+e);
        }
        
        return false;

    }
    
}

