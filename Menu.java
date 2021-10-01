package DigitalizaciónColegio;

import java.util.Scanner;

public class Menu {

    public static int mostrarMenu() {
        System.out.println("\n    Bienvenidos a la Institución Educativa Nivel Secundario Marie Curie ");
        System.out.println("    -------------------------------------------------------------------------");
        System.out.println("Ingrese opción usuario:\n");
        System.out.println("1. Alumno");
        System.out.println("2. Profesor");
        System.out.println("3. Salir");
        System.out.println("\nIngrese una opcion valida:");
        Scanner scanner = new Scanner(System.in);
        int opcionSeleccionada = scanner.nextInt();
        return opcionSeleccionada;
    }


}
