package DigitalizaciónColegio;

public class ProfesorTC extends Profesor {

    private double sueldoBase;

    public ProfesorTC(String codigo, String nombre, String apellido, String correo, String especialidad, double sueldoBase) throws SueldoMaximoException {
        super(codigo, nombre, apellido, correo, especialidad);
        if (sueldoBase > 2500){
            throw new SueldoMaximoException();
        }
        this.sueldoBase = sueldoBase;
        }

    public String obetenerDatos() {
        return super.obetenerDatos() + "Sueldo final: " + calcularSueldoFinal()+ '\n';

    }


    public double calcularSueldoFinal() {
        return this.sueldoBase * calcularBonoEspecialidad();
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
}
