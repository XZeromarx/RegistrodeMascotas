package cl.cliente;

import java.io.Serializable;

/**
 *
 * @author XZeroMarx
 */
public class Mascota  implements Serializable{

    private String nombre;
    private int edad;
    private String idrun;
    private String raza;
    private String tamanio;
    private String nombreDuenio;
    private String rutDuenio;
    private String direccion;
    private String sexo;

    public Mascota() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getIdrun() {
        return idrun;
    }

    public void setIdrun(String idrun) {
        this.idrun = idrun;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

    public String getRutDuenio() {
        return rutDuenio;
    }

    public void setRutDuenio(String rutDuenio) {
        this.rutDuenio = rutDuenio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    

    
    

    

    
    
    
}
