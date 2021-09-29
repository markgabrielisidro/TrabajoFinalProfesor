package modulo.profesor;

public class ProfesorTC extends Profesor {

    private double sueldoBase;

    public ProfesorTC(String codigo, String nombre, String apellido, String correo, String nivel, String especialidad, double sueldoBase) {
        super(codigo, nombre, apellido, correo, nivel, especialidad);
        this.sueldoBase = sueldoBase;
    }

    public String obetenerDatos() {
        return super.obetenerDatos() + "Sueldo final: " + calcularSueldoFinal();
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
