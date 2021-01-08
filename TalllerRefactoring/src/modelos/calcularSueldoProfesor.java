package modelos;

public class calcularSueldoProfesor {
    
    public double calcularSueldo(Profesor prof){
        double sueldo=0;
        sueldo= prof.getInfo().getAñosdeTrabajo()*600 + prof.getInfo().getBonoFijo();
        return sueldo;
    }  
}
