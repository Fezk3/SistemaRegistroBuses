
package modelo;


import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Conexion {
    public static final String URL = "jdbc:mysql://localhost:3306/mydb?autoReconnect=true&useSSL=false";
    public static final String usuario = "root";
    public static final String password = "MakI-0*1";//MakI-0*1"chismosear;
    public PreparedStatement ps;
    public ResultSet rs;
    
    public Connection getConnection() {

        Connection conexion = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            conexion = (com.mysql.jdbc.Connection) DriverManager.getConnection(URL, usuario, password);

        } catch (ClassNotFoundException | SQLException e) {

            System.err.println("Error," + e);
        }

        return conexion;

    }
}
