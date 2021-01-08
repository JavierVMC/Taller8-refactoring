package modelos.usuarios;

import java.util.ArrayList;
import modelos.materias.Paralelo;

public class Profesor extends Usuario{
    private String codigo;
    private int añosdeTrabajo;
    private String facultad;
    private double BonoFijo;

    public Profesor(String codigo, String nombre, String apellido, String facultad, int edad, String direccion, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        paralelos= new ArrayList<>();
    }
    
    public void anadirParalelos(Paralelo p){
        paralelos.add(p);
    }

    public String getCodigo() {
        return codigo;
    }

    public int getAñosdeTrabajo() {
        return añosdeTrabajo;
    }

    public String getFacultad() {
        return facultad;
    }

    public double getBonoFijo() {
        return BonoFijo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setAñosdeTrabajo(int añosdeTrabajo) {
        this.añosdeTrabajo = añosdeTrabajo;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public void setBonoFijo(double BonoFijo) {
        this.BonoFijo = BonoFijo;
    }
   
}
