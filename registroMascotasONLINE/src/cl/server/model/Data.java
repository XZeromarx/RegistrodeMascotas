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
        query = "INSERT INTO mascota VALUES('" + m.getNombre() + "'," + m.getEdad() + ",'" + m.getRaza() + "','" + m.getRun() + "','" + m.getSexo() + "','" + m.getTamanio() + "')";
        System.out.println("ejecuta insert");
        con.ejecutar(query);

        System.out.println("crea segunda query");
        query = "SELECT id FROM mascota WHERE rut = '" + m.getRun() + "'";
        System.out.println("ejecuta segunda query");
        rs = con.ejecutarSelect(query);

        System.out.println("rescata id");
        String id = rs.getString(1);
        System.out.println("function");
        query = "SELECT dbo.crearDuenio('" + id + "')";
        System.out.println("ejecuta funcion");
        rs = con.ejecutarSelect(query);

        System.out.println("if");
        if (d.getDireccion().trim().equals("")) {
            System.out.println("insert1");
            query = "INSERT INTO duenio VALUES ('" + d.getNombre() + "','" + d.getRut() + "',DEFAULT," + rs.getString(1) + ")";
        } else {
            System.out.println("insert2");
            query = "INSERT INTO duenio VALUES ('" + d.getNombre() + "','" + d.getRut() + "','" + d.getDireccion() + "'," + rs.getString(1) + ")";
        }

        con.ejecutar(query);
        
        
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
