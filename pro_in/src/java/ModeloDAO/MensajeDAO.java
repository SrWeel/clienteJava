/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDAO;

import Config.Conexion;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author blass
 */
public class MensajeDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Usuario u = new Usuario();
    
    public Usuario msg(int idper){
        String cmsg="SELECT * FROM alumno WHERE id="+idper; 
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(cmsg);
            rs = ps.executeQuery();
            while (rs.next()) {
                u.setIdper(rs.getInt("idper"));
                u.setNombres(rs.getString("nombres"));

            }

        } catch (Exception e) {
            System.out.println("Error en" + e);

        }

        return u;
        
    }
    
}
