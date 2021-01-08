/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.calificaciones;

/**
 *
 * @author test1
 */
public class Calificacion {
    private double nexamen;
    private double ndeberes;
    private double nlecciones;
    private double ntalleres;

    public Calificacion() {
    }
    
    public Calificacion(double nexamen, double ndeberes, double nlecciones, double ntalleres) {
        this.nexamen = nexamen;
        this.ndeberes = ndeberes;
        this.nlecciones = nlecciones;
        this.ntalleres = ntalleres;
    }

    public double getNexamen() {
        return nexamen;
    }

    public void setNexamen(double nexamen) {
        this.nexamen = nexamen;
    }

    public double getNdeberes() {
        return ndeberes;
    }

    public void setNdeberes(double ndeberes) {
        this.ndeberes = ndeberes;
    }

    public double getNlecciones() {
        return nlecciones;
    }

    public void setNlecciones(double nlecciones) {
        this.nlecciones = nlecciones;
    }

    public double getNtalleres() {
        return ntalleres;
    }

    public void setNtalleres(double ntalleres) {
        this.ntalleres = ntalleres;
    }
    
    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. El teorico y el practico se calcula por parcial.
    public double CalcularNota(){
        return ((nexamen+ndeberes+nlecciones)*0.80) + ((ntalleres)*0.20);
    }
    
}
