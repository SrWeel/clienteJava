package ModeloDAO;

import Config.Conexion;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author User
 */
public class UsuarioDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    Usuario u = new Usuario();

    public Usuario Login(String usu, String pass) {

        String consultaLogin = "select * from usuario where usuario='" + usu + "' and pass='" + pass + "'";


        try {
            con = cn.getConnection();
            ps = con.prepareStatement(consultaLogin);
            rs = ps.executeQuery();
            while (rs.next()) {
                u.setIdper(rs.getInt("idper"));
              

            }

        } catch (Exception e) {
            System.out.println("Error en" + e);

        }

        return u;
        

    }

    

}