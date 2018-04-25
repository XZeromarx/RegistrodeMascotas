package cl.server.model;

import cl.cliente.Mascota;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Data {

    private Conexion con;
    private String query;
    private ResultSet rs;
    private Statement st;

    public Data() throws ClassNotFoundException, SQLException {
        con = new Conexion("localhost", "db_sql");
    }

    public void crearMascota(Mascota m) throws SQLException {

        query = "INSERT INTO mascota VALUES('" + m.getNombre() + "'," + m.getEdad() + ",'" + m.getRaza() + "','" + m.getIdrun() + "','" + m.getSexo() + "','" + m.getTamanio() + "')";
        con.ejecutar(query);
        con.close();

    }

    public List<Mascota> datosMascota(Mascota m) throws SQLException {
        List mascotas = new ArrayList<>();
        Mascota masc = null;

//        for (Object mascota : mascotas) {
//            
//            masc.setNombre(m.getNombre());
//            masc.setEdad(m.getEdad());
//            masc.setRaza(m.getRaza());
//            masc.setIdrun(m.getIdrun());
//            masc.setSexo(m.getSexo());
//            masc.setTamanio(m.getTamanio());
//            
//            mascotas.add(masc);
//        }
//    return mascotas;
        query = "SELECT * FROM mascota";
        rs = con.ejecutarSelect(query);
        while (rs.next()) {
            masc.setIdrun(rs.getString(1));
            masc.setNombre(rs.getString(2));
            masc.setEdad(rs.getInt(3));
            masc.setRaza(rs.getString(4));
            masc.setIdrun(rs.getString(5));
            masc.setSexo(rs.getString(6));
            masc.setTamanio(m.getTamanio());
            
            mascotas.add(masc);
        }
        return mascotas;
    }

}
