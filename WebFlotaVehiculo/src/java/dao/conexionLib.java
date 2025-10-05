/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author wcastro
 */
public class conexionLib {

    private static final String dbDriver = "org.mariadb.jdbc.Driver";

    private static final String URL =
            "jdbc:mariadb://localhost:3306/concesionario";
    private static final String USER = "soapp";       // <--
    private static final String PASS = "soapp123!";   // <--

    static {
        try {
            Class.forName(dbDriver); // Driver moderno
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("MySQL/MariaDB JDBC driver no encontrado", e);
        }
    }

    public static Connection conectarnosBD() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }
    
    /*Connection con = null;
    public conexionLib(){
        try {
            //Por medio del driver conectarse al server y bd que se le indique
            Class.forName("com.mysql.jdbc.Driver");
            //Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/concesionario", "root", "");
            //con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flotavehiculo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
            //con = DriverManager.getConnection("jdbc:mysql://localhost:3306/concesionario?zeroDateTimeBehavior=convertToNull", "root", "");
            boolean ok = con.isValid(5000);
            System.out.println(ok ? "Conexión bien" : "Conexión Fallo");
            //if (con != null){
                //System.out.println("Conexion Ok");
            //}
        } catch (SQLException ex) {
            System.out.println("Mensaje " + ex.getMessage());
        } catch (ClassNotFoundException e){
            System.out.println("Mensaje " + e.getMessage());
        }  
    }
    
    public Connection getConnection(){
        return con;
    } */
}