/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUD;
import Modelo.Alumno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author DELL
 */
public class AlumnoDAO implements CRUD{
    Conexion cn =  new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    Alumno alu = new Alumno();

    
    @Override
    public List listar() {
        
        ArrayList<Alumno>list = new ArrayList<>();
        String sql = "SELECT * FROM usuari";
        try {
            
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            //rs={9}
            while(rs.next()){
            Alumno alu = new Alumno();
                alu.setId(rs.getInt("Id"));//2 
                alu.setCed(rs.getString("ced"));//172245   
                alu.setNombres(rs.getString("nombres"));//Jaimito Perez
                alu.setApellidos(rs.getString("apellido"));
                alu.setEmail(rs.getString("email"));
                alu.setPassword(rs.getString("password"));
                /*
                id   ced    nombress
                1   1722     JunaiP
                2   17222    Maria C
                3   1723     Juan T
                = alu
                */
                list.add(alu);  //
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

    @Override   
    public Alumno list(int id) {
       
        //SELECT * FROM alumno WHERE Id = 3
            String sql = "SELECT * FROM usuari WHERE Id="+id; 
            try {

                con = cn.getConnection();
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();

                while(rs.next()){

                    alu.setId(rs.getInt("Id"));
                    alu.setCed(rs.getString("ced"));
                    alu.setNombres(rs.getString("nombres"));
                    alu.setApellidos(rs.getString("apellido"));
                    alu.setEmail(rs.getString("email"));
                    alu.setPassword(rs.getString("password"));

                }

            } catch (Exception e) {
                System.out.println("Error en: "+e);
            }
            return alu;
                
        
    }

    @Override
    public boolean add(Alumno alu) {
        
       String sql = "insert into usuari(ced, nombres,apellido,email,password)values('"+alu.getCed()+"','"+alu.getNombres()+"','"+alu.getApellidos()+"','"+alu.getEmail()+"','"+alu.getPassword()+"')";
        
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
    public boolean edit(Alumno alu) {

        String sql = "UPDATE usuari set ced='"+alu.getCed()+"', nombres='"+alu.getNombres()+"', apellido='"+alu.getApellidos()+"', email='"+alu.getEmail()+"', password='"+alu.getPassword()+"' WHERE Id="+alu.getId();
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
    public boolean delete(int id) {

        String sql = "delete from usuari where Id="+id; // mod

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
