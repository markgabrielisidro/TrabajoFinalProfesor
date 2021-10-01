package DigitalizaciónColegio;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException, SueldoMaximoException {
        Controller controller = new Controller("Marie Curie");

        Scanner scanner = new Scanner(System.in);
        int opcionSeleccionada = Menu.mostrarMenu();
        do {
            switch (opcionSeleccionada) {
                case 1:
                    System.out.println("Mostrar Lista Alumnos");
                    try {
                        controller.registrarAlumno("AR", "780315694", "Fernando", "Tobar", "13", "2", "16.5");
                        controller.registrarAlumno("AN", "712315645", "Ricardo", "Juarez", "12", "1", "nacional");
                        controller.mostrarListadoAlumno();
                        controller.mostrarBusquedaxDNIalumno();
                    } catch (NotaPonderadoFinalGradoAnteriorIncorrecto e) {
                        System.out.println(e.getMessage());
                    }


                    try {
                        controller.registrarAlumno("AR", "780315694", "Fernando", "Tobar", "13", "2", "22");
                        controller.mostrarListadoAlumno();
                    } catch (NotaPonderadoFinalGradoAnteriorIncorrecto e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 2:
                    System.out.println("Mostrar Lista Profesores");
                    try {
                        controller.registrarProfesor("ProfesorTC", "45708997", "Juan", "Andrade", "juan.andrade@mariecourie.com", "Matematica", "1200");
                        controller.registrarProfesor("ProfesorTC", "56702382", "Fernando", "Ramirez", "fernando.ramirez@mariecourie.com", "Letras", "1500");
                        controller.registrarProfesor("ProfesorTC", "38492032", "Carlos", "Ortiz", "carlos.ortiz@mariecourie.com", "Idiomas", "1050");
                        controller.registrarProfesor("ProfesorTC", "41400572", "Luis", "Fernandez", "luis.fernandez@mariecourie.com", "Ciencias", "1100");
                        controller.registrarProfesor("ProfesorTC", "70349323", "Christian", "Alva", "christian.alva@mariecourie.com", "Educacion Fisica", "950");
                        controller.registrarProfesor("ProfesorTC", "39982919", "Martha", "Delgado", "martha.delgado@mariecourie.com", "Lenguaje", "1180");
                        controller.registrarProfesor("ProfesorTP", "50332010", "Teresa", "Contreras", "teresa.contreras@mariecourie.com", "Matematica", "40", "45");
                        controller.mostrarListadoProfesor();
                        controller.buscarXDNIProfesor();
                    } catch (SueldoMaximoException e) {
                        System.out.println(e.getMessage());
                    }

                    try {
                        controller.registrarProfesor("ProfesorTC", "58683922", "Fabiana", "Lopez", "juan.andrade@mariecourie.com", "Matematica", "3000");
                        controller.mostrarListadoProfesor();
                    } catch (SueldoMaximoException ex) {
                        System.out.println(ex.getMessage());
                        System.out.println("-------------------------");
                    }
                    break;

            }
            System.out.println("Presiona Enter para continuar");
            System.in.read();
            opcionSeleccionada = Menu.mostrarMenu();
        } while (opcionSeleccionada != 3) ;
        System.out.println("Terminado la ejecucion");

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    }
}
