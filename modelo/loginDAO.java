package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class loginDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    
    public login log(String correo, String pass){
    login i = new login();
    String sql = "SELECT * FROM usuarios WHERE correo = ? AND pass = ?";
        try {
        con = cn.getConnection();
         ps = con.prepareStatement(sql);
         ps.setString(1, correo);
         ps.setString(2, pass);
         rs = ps.executeQuery();
            if (rs.next()){
                 i.setId(rs.getInt("id"));
                 i.setNombre(rs.getString("nombre"));
                 i.setCorreo(rs.getString("correo"));
                 i.setPass(rs.getString("pass"));
            }
        } catch (SQLException e){
            System.out.println(e.toString());
        }
        return i;
    }

    private static class Conexion {

        public Conexion() {
        }

        private Connection getConnection() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    
}
