/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.calificaciones;

import modelos.materias.Paralelo;

/**
 *
 * @author Willy Mateo
 */
public class Notas {
    private Paralelo paralelo;
    private Calificacion notaInicial;
    private Calificacion notaFinal;

    public Notas(Paralelo paralelo) {
        this.paralelo = paralelo;
    }

    public Notas(Paralelo paralelo, Calificacion notaInicial, Calificacion notaFinal) {
        this(paralelo);
        this.notaInicial = notaInicial;
        this.notaFinal = notaFinal;
    }
    
    public double CalcularNotaTotal(){
        return (notaInicial.CalcularNota() + notaFinal.CalcularNota())/2;
    }

    public Calificacion getNotaFinal() {
        return notaFinal;
    }

    public Calificacion getNotaInicial() {
        return notaInicial;
    }

    public Paralelo getParalelo() {
        return paralelo;
    }

    public void setNotaFinal(Calificacion notaFinal) {
        this.notaFinal = notaFinal;
    }

    public void setNotaInicial(Calificacion notaInicial) {
        this.notaInicial = notaInicial;
    }

    public void setParalelo(Paralelo paralelo) {
        this.paralelo = paralelo;
    }
    
}
