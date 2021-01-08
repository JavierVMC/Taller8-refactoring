package modelos.usuarios;

import java.util.List;
import java.util.ArrayList;
import modelo.calificaciones.Notas;

public class Estudiante extends Usuario{
    //Informacion del estudiante
    protected String matricula;
    protected List<Notas> notas;

    public Estudiante() {
        notas = new ArrayList<>();
    }

    public Estudiante(String matricula) {
        this();
        this.matricula = matricula;
    }
    
    //Getter y setter de Matricula
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public List<Notas> getNotas() {
        return notas;
    }
}