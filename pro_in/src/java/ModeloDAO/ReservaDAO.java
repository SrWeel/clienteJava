/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUD_r;
import Modelo.Reserva;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class ReservaDAO implements CRUD_r {
    Conexion cn =  new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    Reserva res=new Reserva();

    @Override
    public List listar() {
        ArrayList<Reserva>list = new ArrayList<>();
        String sql = "SELECT * FROM reserva";
        try {
            
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            //rs={9}
            while(rs.next()){
                    Reserva res=new Reserva();

                res.setIdr(rs.getInt("idr"));
                res.setOrigen(rs.getString("origen"));
                res.setDestino(rs.getString("destino"));
                res.setFecha(rs.getString("fecha"));
                res.setNpasajeros(rs.getString("npasajeros"));
                

                list.add(res);  

            }
        
        } catch (Exception e) {
            System.out.println("Error en: "+e);
        }

        return list;
    }

    @Override
    public Reserva list(int idr) {
        String sql = "SELECT * FROM reserva WHERE idr="+idr; 
        try {
            
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                res.setIdr(rs.getInt("idr"));
                res.setOrigen(rs.getString("origen"));
                res.setDestino(rs.getString("destino"));
                res.setFecha(rs.getString("fecha"));
                res.setNpasajeros(rs.getString("npasajeros"));
            
               
            }
        
        } catch (Exception e) {
            System.out.println("Error en: "+e);
        }
        return res;
                
        
    }

    @Override
    public boolean add(Reserva res) {
        String sql = "insert into reserva(origen,destino,fecha,npasajeros)values('"+res.getOrigen()+"','"+res.getDestino()+"','"+res.getFecha()+"','"+res.getNpasajeros()+"')";
        
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("Error al guardar en: "+e);
        }
        
        return false;    }

    @Override
    public boolean edit(Reserva res) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int idr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
