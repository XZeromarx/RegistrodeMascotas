package cl.server.model;

import cl.cliente.Mascota;
import cl.cliente.Duenio;
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
    private List<Mascota> listMascotas;
    private List<Duenio> listDuenios;

    public Data() throws ClassNotFoundException, SQLException {
        con = new Conexion("localhost", "db_sql");
    }

    public void crearMascotaAndDuenio(Mascota m, Duenio d) throws SQLException, InterruptedException {

        System.out.println("insert mascota");
        query = "EXEC crearMascotayDuenio '" + m.getNombre() + "'," + m.getEdad() + ",'" + m.getRaza() + "','" + m.getRun() + "','" + m.getSexo() + "','" + m.getTamanio() + "','" + d.getNombre() + "','" + d.getRut() + "','" + d.getDireccion() + "' ";
        System.out.println("ejecuta insert");
        con.ejecutar(query);
        con.close();
        
    }

    public List<Mascota> readMascota() throws SQLException {
        Mascota m = null;
        query = "SELECT * FROM mascota ORDER BY id ASC";
        rs = con.ejecutarSelect(query);
        listMascotas = new ArrayList<>();

        while (rs.next()) {
            m.setNombre(rs.getString(2));
            m.setEdad(rs.getInt(3));
            m.setRaza(rs.getString(4));
            m.setRun(rs.getString(5));
            m.setSexo(rs.getString(6));
            m.setTamanio(rs.getString(7));

            listMascotas.add(m);
        }
        return listMascotas;
    }

    public List<Duenio> readDuenio(Duenio d) throws SQLException {
        query = "SELECT * FROM duenio ORDER BY id ASC";
        rs = con.ejecutarSelect(query);
        listDuenios = new ArrayList<>();

        while (rs.next()) {
            d.setNombre(rs.getString(1));
            d.setRut(rs.getString(2));
            d.setDireccion(rs.getString(3));
            listDuenios.add(d);
        }
        return listDuenios;
    }

}
