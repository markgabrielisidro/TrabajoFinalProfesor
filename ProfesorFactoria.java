package DigitalizaciónColegio;

public class ProfesorFactoria {
    public static Profesor crear(String... args) throws SueldoMaximoException{
        Profesor profesor = null;
        switch (args[0]){
            case "ProfesorTC":
            profesor = new ProfesorTC(args[1], args[2], args[3], args[4], args[5],Double.parseDouble(args[6]));
            break;
            case "ProfesorTP":
            profesor = new ProfesorTP(args[1],args[2],args[3],args[4],args[5],Integer.parseInt(args[6]),Double.parseDouble(args[7]));
            break;
        }return profesor;
    }
}
