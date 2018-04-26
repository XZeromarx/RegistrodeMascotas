package cl.cliente;

import java.io.Serializable;

/**
 *
 * @author XZeroMarx
 */
public class Duenio implements Serializable {

    private String nombre;
    private String rut;
    private String direccion;

    public Duenio() {
    }

    public Duenio(String nombre, String rut, String direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
