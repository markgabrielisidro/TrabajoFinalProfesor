package DigitalizaciónColegio;

import java.util.ArrayList;
import java.util.List;

public class Colegio {

    private static Colegio colegio = new Colegio();
    private String nombre;
    private static List<Alumno> alumnos;
    private static List<Profesor> profesores;

    private Colegio() {
    }

    public static Colegio obtenerInstanciaAlumno(String nombre){
        colegio.setNombre(nombre);
        alumnos = new ArrayList<>();
        return colegio;
    }


    public static Colegio obtenerInstanciaProfesor(String nombre){
        colegio.setNombre(nombre);
        profesores = new ArrayList<>();
        return colegio;
    }


    public static Alumno obtenerDatosXDNIAlumno(String dni){
        Alumno datos=null;
        for(Alumno p:alumnos){
            if (p.getDni().equals(dni)){
                datos = p;
            }
        }
        return datos;
    }


    public void registrar(Alumno alumno){
        this.alumnos.add(alumno);
    }

    public List<Profesor> getProfesores() {return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {

        this.profesores = profesores;
    }

    public void registrarProfesor(Profesor profesor) {

        profesores.add(profesor);
    }

    public static Profesor obtenerDatosXDNIProfesor(String codigo){
        for(Profesor profesor: profesores){
            if(profesor.getDni().equals(codigo)){
                return profesor;
            }
        }return null;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static List<Alumno> getAlumnos() {
        return alumnos;
    }

    public static void setAlumnos(List<Alumno> alumnos) {
        Colegio.alumnos = alumnos;
    }
}
