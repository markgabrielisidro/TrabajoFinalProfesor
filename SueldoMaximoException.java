package DigitalizaciónColegio;

public class SueldoMaximoException extends Exception{
    public String getMessage() {
        return "No se permite un sueldo base de mas de S/2500.00";
    }

}
