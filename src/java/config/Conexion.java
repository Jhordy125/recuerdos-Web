package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
   
     public static Connection conectar() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logistica?useTimeZone=true&serverTimezone=UTC&autoReconnect=true&useSSL=false","root","12345");
            System.out.println("Se conectó");
        } catch (Exception e) {
            System.out.println("Error en: " + e);
        }
        return con;
    }

    public static void main(String[] args) {
        conectar();
    }
}
