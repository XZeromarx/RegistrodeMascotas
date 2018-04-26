package cl.server.model;
 
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;        
import java.sql.SQLException;
import java.sql.Statement;      
 
public class Conexion {
    private Statement st;
    private ResultSet rs;
    private Connection con;
   
    public Conexion(String server, String bd) throws ClassNotFoundException, SQLException{
        String protocolo = "jdbc:sqlserver://";
        String serverIP = ""+server+";";
        String baseDeDatos = "databaseName="+bd+";";
        String seguridad = "integratedSecurity=true;";
       
        String url = protocolo+serverIP+baseDeDatos+seguridad;
        System.out.println(url);
        
        con = DriverManager.getConnection(url);
        
        
    }
   
    public void ejecutar(String query) throws SQLException{
        System.out.println(query);
        st = con.createStatement();
        System.out.println("por ejecutar query");
        st.execute(query);
        System.out.println("query ejecutado");
        close();
    }
   
    public ResultSet ejecutarSelect(String query) throws SQLException{
        System.out.println(query);
       
        st = con.createStatement();
        rs = st.executeQuery(query);
        return rs;
    }
   
    public void close() throws SQLException{
        st.close();
    }
}