package cl.server.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {

    private Statement st;
    private ResultSet rs;
    private final Connection CON;

    public Conexion(String server, String bd) throws ClassNotFoundException, SQLException {
        String protocolo = "jdbc:sqlserver://";
        String serverIP = "" + server + ";";
        String baseDeDatos = "databaseName=" + bd + ";";
        String seguridad = "integratedSecurity=true;";

        String url = protocolo + serverIP + baseDeDatos + seguridad;
        System.out.println(url);

        CON = DriverManager.getConnection(url);

    }

    public void ejecutar(String query) throws SQLException {
        System.out.println(query);

        System.out.println("por ejecutar query");
        st = CON.createStatement();
        st.executeUpdate(query);
        System.out.println("query ejecutado");
        st.close();
    }

    public ResultSet ejecutarSelect(String query) throws SQLException {
        System.out.println(query);

        st = CON.createStatement();
        rs = st.executeQuery(query);
        return rs;
    }

    public void close() throws SQLException {
        st.close();
    }
}
