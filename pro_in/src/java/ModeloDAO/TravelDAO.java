package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUD_travel;
import Modelo.Travel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 * @author SrWeel
 */
public class TravelDAO implements CRUD_travel {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs; 
    //
    Travel trv = new Travel();
    //
    @Override
    public Travel list(int id) {
        String sql="SELECT *FROM traveling WHERE id="+id;
        try
        {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){trv.setId(id);}
        }
        catch(Exception e){System.out.println("Error en: "+e);}
        return trv;
    }

    @Override
    public List listar() {
        ArrayList<Travel>list = new ArrayList<>();
        String sql = "SELECT * FROM reserv";
        try
        {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next())
            {
                trv.setId(rs.getInt("idr"));
                trv.setId_pais(rs.getString("pais_origen"));
                trv.setId_paisd(rs.getString("destino"));
                trv.setId_ciudad(rs.getInt("ciudad_id"));
                trv.setNombre(rs.getString("nombre"));
                trv.setNombre_cliente(rs.getString("cliente"));
                trv.setFecha(rs.getString("fecha"));
                trv.setPasajeros(rs.getString("npasajeros"));
                trv.setPrecio(rs.getFloat("precio"));
                list.add(trv);
            }
        }
        catch(Exception e){System.out.println("Error en: "+e);}
      return list;  
    }
    @Override
    public boolean add(Travel tr) {
        String sql = "insert into reserv(pais_origen,destino,ciudad_id,nombre,cliente,fecha,npasajeros,precio)values('"+trv.getId_pais()+"','"+trv.getId_paisd()+"', '"+trv.getId_ciudad()+"', '"+trv.getNombre()+"', '"+trv.getNombre_cliente()+"', '"+trv.getFecha()+"','"+trv.getPasajeros()+"', '"+trv.getPrecio()+"')";
        try
        {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ps.executeUpdate();
        }
        catch(Exception e){System.out.println("Error en: "+e);}  
        return false;
    }
    @Override
    public boolean edit(Travel tr) {
        String sql = "";
        try
        {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ps.executeUpdate();
        }
        catch(Exception e){System.out.println("Error en: "+e);}  
        return false;
    }

    @Override
    public boolean delete(int id) {
        String sql = "delete from reserv where Id="+id;
        try
        {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ps.executeUpdate();
        }
        catch(Exception e){System.out.println("Error en: "+e);}  
        return false;
    }
    
}