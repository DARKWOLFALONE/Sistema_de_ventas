package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClienteDAO {
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    // @formatter:off
   public boolean RegistrarClientes(Clientes cl){
        String sql = "INSERT INTO clientes (Nombre, TipoDeVendedor, Vendedor, NombreDeContacto, Telefono, Correo, fecha) VALUES (?,?,?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cl.getNombre());
            ps.setInt(2, cl.getTipoDeVendedor());
            ps.setString(3, cl.getVendedor());
            ps.setString(4, cl.getNombreDeContacto());
            ps.setInt(5, cl.getTelefono());
            ps.setString(6, cl.getCorreo());
            ps.setString(7, cl.getfecha());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
    
   public List ListarClientes(){
       List<Clientes> ListaCl = new ArrayList();
       String sql = "SELECT * FROM clientes";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Clientes cl = new Clientes();
               cl.setId(rs.getInt("id"));
               cl.setnombre(rs.getString("Nombre"));
               cl.setTipoDeVendedor(rs.getInt("TipoDeVendedor"));
               cl.setVendedor(rs.getString("Vendedor"));
               cl.setNombreDeContacto(rs.getString("NombreDeContacto"));
               cl.setTelefono(rs.getInt("Telefono"));
               cl.setCorreo(rs.getString("Correo"));
               cl.setfecha(rs.getString("fecha"));
               ListaCl.add(cl);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return ListaCl;
   }
   
   public boolean EliminarClientes(int id){
       String sql = "DELETE FROM clientes WHERE id = ?";
       try {
           ps = con.prepareStatement(sql);
           ps.setInt(1, id);
           ps.execute();
           return true;
       } catch (SQLException e) {
           System.out.println(e.toString());
           return false;
       }finally{
           try {
               con.close();
           } catch (SQLException ex) {
               System.out.println(ex.toString());
           }
       }
   }
   
   public boolean ModificarClientes(Clientes cl){
       String sql = "UPDATE clientes SET Nombre=?, TipoDeVendedor=?, Vendedor=?, NombreDeContacto=?, Telefono=?, Correo=? WHERE id=?";
       try {
           ps = con.prepareStatement(sql);   
            ps.setString(1, cl.getNombre());
            ps.setInt(2, cl.getTipoDeVendedor());
            ps.setString(3, cl.getVendedor());
            ps.setString(4, cl.getNombreDeContacto());
            ps.setInt(5, cl.getTelefono());
            ps.setString(6, cl.getCorreo());
            ps.setString(7, cl.getfecha());
           ps.setInt(5, cl.getId());
           ps.execute();
           return true;
       } catch (SQLException e) {
           System.out.println(e.toString());
           return false;
       }finally{
           try {
               con.close();
           } catch (SQLException e) {
               System.out.println(e.toString());
           }
       }
   }
   
   public Clientes Buscarcliente(int TipoDeVendedor){
       Clientes cl = new Clientes();
       String sql = "SELECT * FROM clientes WHERE TipoDeVendedor = ?";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           ps.setInt(1, TipoDeVendedor);
           rs = ps.executeQuery();
           if (rs.next()) {
               cl.setId(rs.getInt("id"));
               cl.setNombre(rs.getString("nombre"));
               cl.setInt(rs.getString("telefono"));
               cl.setDireccion(rs.getString("direccion"));
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return cl;
   }

    private static class Conexion {

        public Conexion() {
        }

        private Connection getConnection() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
   
}
