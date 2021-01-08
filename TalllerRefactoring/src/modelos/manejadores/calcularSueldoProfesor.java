package modelos.manejadores;

import modelos.usuarios.Profesor;

public class calcularSueldoProfesor {
    
    public double calcularSueldo(Profesor prof){
        return prof.getAñosdeTrabajo()*600 + prof.getBonoFijo();
    }  
}
