/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

// import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.tipovehi;

/**
 *
 * @author wcastro
 */
public class tipoVehiDAO {
    public static boolean insertartv(tipovehi tv){
        try {            
            Connection cone = conexionLib.conectarnosBD();
            String SQL = "INSERT INTO tipo_vehiculo (idtv,nomtv) VALUES(?,?)";
            //String SQL = "INSERT INTO tbl_tipovehi VALUES(?,?)";
            
            PreparedStatement ps = cone.prepareStatement(SQL);                        
            ps.setInt(1, tv.getIdtv());
            ps.setString(2, tv.getNomtv());
                        
            return ps.executeUpdate() > 0;             
            
        } catch (SQLException ex) {
            //System.out.println(ex);
            return false;
        }
        //return false;
    }

    public static ArrayList<tipovehi> listarTv() {
        ArrayList<tipovehi> listatv = new ArrayList<>();
        String sqlListarTv = "SELECT * FROM tipo_vehiculo";

        try (Connection conex = conexionLib.conectarnosBD();
             PreparedStatement st = conex.prepareStatement(sqlListarTv);
             ResultSet resultado = st.executeQuery()) {

            while (resultado.next()) {
                tipovehi TipoVehi = new tipovehi();
                TipoVehi.setIdtv(resultado.getInt("idtv"));
                TipoVehi.setNomtv(resultado.getString("nomtv"));
                listatv.add(TipoVehi);
            }

        } catch (SQLException ex) {
            //System.out.println(ex);
            //return null;
            ex.printStackTrace();
        }

        return listatv;
    }


    //Metodo para mostrar los tipo de vehi en la vista del listado de vehiculos (listarVehi.jsp). Para cada vehi mostrar su tipo de vehi
    public static String getTipoVehi(int id) {
        String sql = "SELECT nombre FROM tipo_vehiculo WHERE id = ?";
        try (Connection con = conexionLib.conectarnosBD();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) return rs.getString(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "";
    }

    /*public static String getTipoVehi(int IdTV){
        try {
            String sqlTvForVehi = "select nomtv from tipovehi where IdTv=?";        
            Connection conex = conexionLib.conectarnosBD();
            PreparedStatement st = conex.prepareStatement(sqlTvForVehi);
            //Enviar el parametro IdTv
            st.setInt(1, IdTV);
            ResultSet resultado = st.executeQuery();
            //Verificar si existen los TV y traer su nombre
            if (resultado.next()){
                return resultado.getString("nomTv");             
            }
            return "--";
        } catch (SQLException ex) {            
            return "--";
        }
    }*/
}
