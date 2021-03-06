/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.usuarios;

import java.util.ArrayList;
import java.util.List;
import modelos.materias.Paralelo;

/**
 *
 * @author Willy Mateo
 */
public class Usuario {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String facultad;
    protected String direccion;
    protected String telefono;
    protected List<Paralelo> paralelos;

    public Usuario() {
        paralelos = new ArrayList<>();
    }

    public Usuario(String nombre, String apellido, int edad, String facultad, String direccion, String telefono) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.facultad = facultad;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Paralelo> getParalelos() {
        return paralelos;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
}
