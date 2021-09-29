package modulo.profesor;

import java.util.ArrayList;
import java.util.List;

public class Colegio {

    private List<Profesor> profesores;

    public Colegio() {
        this.profesores = new ArrayList<>();
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public void registrarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }
}
