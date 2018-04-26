package cl.cliente;

import java.io.Serializable;

/**
 *
 * @author XZeroMarx
 */
public class Mascota implements Serializable {

    private String nombre;
    private int edad;
    private String run;
    private String raza;
    private String tamanio;
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

    public String getRun() {
        return run;
    }

    public void setRun(String idrun) {
        this.run = idrun;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", edad=" + edad + ", run=" + run + ", raza=" + raza + ", tamanio=" + tamanio + ", sexo=" + sexo + '}';
    }

    
    
}
