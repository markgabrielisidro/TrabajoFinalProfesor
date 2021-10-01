package DigitalizaciónColegio;

public class ProfesorTP extends Profesor {

    private int horasTrabajadas;
    private double tarifaHora;

    public ProfesorTP(String codigo, String nombre, String apellido, String correo, String especialidad, int horasTrabajadas, double tarifaHora) {
        super(codigo, nombre, apellido, correo, especialidad);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    public double calcularSueldoFinal() {
        return horasTrabajadas * tarifaHora;
    }

    @Override
    public String obetenerDatos(){
        return super.obetenerDatos() + "Sueldo final: " + calcularSueldoFinal();
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }
}
