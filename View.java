package DigitalizaciónColegio;

import java.util.List;

public class View {
    public void imprimirListado(List<Alumno> alumnos) {
        System.out.println("\nAlumnos del colegio científico Marie Curie");
        for(Alumno p:alumnos){
            System.out.println(p.toString());
        }
        System.out.println("\nFIN");
    }

    /////////////////////////////////////////////////////////////////////

    public void mostrarBusquedaxDNIalumno(Alumno p) {
        System.out.println("\nBusqueda por DNI alumno: ");
        System.out.println("\nSus datos registrados son los siguientes: " + "\n"+p.toString());
    }

    public void printListadoProfesor(List<Profesor> profesores){
        System.out.println("-------------------------");
        for (Profesor profesor:profesores){
            System.out.println(profesor.obetenerDatos());
        }
        System.out.println("-------------------------");
    }

    public void mostrarDatosProfesor(Profesor profesor) throws SueldoMaximoException{
        System.out.println();
        System.out.println("Tus datos registrados son:" + '\n' + profesor.obetenerDatos());
    }


    public void mostrarBusquedaxDNIProfesor(Profesor profesor) {
        System.out.println("\nBusqueda por DNI Profesor: ");
        System.out.println("\nSus datos registrados son los siguientes: " + "\n"+profesor.obetenerDatos());
    }
}
