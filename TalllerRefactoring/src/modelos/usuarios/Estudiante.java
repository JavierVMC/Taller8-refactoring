package modelos.usuarios;

import modelos.materias.Notas;
import modelos.materias.Paralelo;

public class Estudiante extends Usuario{
    //Informacion del estudiante
    protected String matricula;
    protected String facultad;
    
    //Getter y setter de Matricula

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    //Getter y setter de la Facultad
    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    
    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. El teorico y el practico se calcula por parcial.
    public double CalcularNotaInicial(Notas notas){
        double notaInicial=0;
        for(Paralelo par:paralelos){
            if(notas.getP().equals(par)){
                notaInicial = notaFinal(notas.getNexamen(),notas.getNdeberes(),notas.getNlecciones(),notas.getNtalleres());
            }
        }
        return notaInicial;
    }
    
    //Calcula y devuelve la nota final contando examen, deberes, lecciones y talleres. El teorico y el practico se calcula por parcial.
    
    public double CalcularNotaFinal(Notas notas){
        double notaFinal=0;
        for(Paralelo par:paralelos){
            if(notas.getP().equals(par)){
                notaFinal = notaFinal(notas.getNexamen(),notas.getNdeberes(),notas.getNlecciones(),notas.getNtalleres());
            }
        }
        return notaFinal;
    }
    
    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. Esta nota es solo el promedio de las dos calificaciones anteriores.
    public double CalcularNotaTotal(Paralelo p){
        double notaTotal=0;
        for(Paralelo par:paralelos){
            if(p.equals(par)){
                notaTotal=(p.getMateria().getNotaInicial()+p.getMateria().getNotaFinal())/2;
            }
        }
        return notaTotal;
    }
    
    public double notaFinal(double nexamen, double ndeberes, double nlecciones, double ntalleres){
        return ((nexamen+ndeberes+nlecciones)*0.80) + ((ntalleres)*0.20);
    }
}