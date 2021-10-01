package DigitalizaciónColegio;

public class Factoria {
    public static Alumno dameObjeto(String... arg) throws NotaPonderadoFinalGradoAnteriorIncorrecto {

        Alumno alumno = null;

        switch (arg[0]){
            case "AR":
                alumno = new AlumnoRegular(arg[1],arg[2],arg[3],Integer.parseInt(arg[4]),Integer.parseInt(arg[5]),Double.parseDouble(arg[6]));
                break;
            case "AN":
                alumno = new AlumnoNuevo(arg[1],arg[2],arg[3],Integer.parseInt(arg[4]),Integer.parseInt(arg[5]),arg[6]);
                break;
        }
        return  alumno;
    }
}

