package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    public static Connection getConexion() {
        Connection con = null;

        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=GestionFuncionarios;encrypt=true;trustServerCertificate=true";
            String user = "sa";
            String pass = "123456";

            con = DriverManager.getConnection(url, user, pass);

            System.out.println("Conexión exitosa");

        } catch (Exception e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }

        return con;
    }
}