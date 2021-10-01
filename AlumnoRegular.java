package DigitalizaciónColegio;

public class AlumnoRegular extends Alumno{

    private double notaPonderadoFinalGradoAnterior;

    public AlumnoRegular() {
    }

    public AlumnoRegular(String dni, String nombres, String apellidos, int edad, int grado, double notaPonderadoFinalGradoAnterior) throws NotaPonderadoFinalGradoAnteriorIncorrecto {
        super(dni, nombres, apellidos, edad, grado);
        if(notaPonderadoFinalGradoAnterior<0 || notaPonderadoFinalGradoAnterior>20){
            throw new NotaPonderadoFinalGradoAnteriorIncorrecto();
        }
        this.notaPonderadoFinalGradoAnterior = notaPonderadoFinalGradoAnterior;
    }

    @Override
    public double calcularCostoPension() {
        double costoPension=0;
        if(notaPonderadoFinalGradoAnterior>=16){
           return costoPension=obtenerPrecioPensionMensualGrado()*0.9;
        }
        return costoPension=obtenerPrecioPensionMensualGrado();
    }

    @Override
    public double calcularPrimeraBoleta() {
        double costoTotalPrimeraBoleta = 0;
        double costoMatricula = 250;
        if (notaPonderadoFinalGradoAnterior >= 16) {
           return costoTotalPrimeraBoleta = costoMatricula*0.9 + calcularCostoPension();
        }
        return costoTotalPrimeraBoleta = costoMatricula + calcularCostoPension();

    }

    public double getNotaPonderadoFinalGradoAnterior() {
        return notaPonderadoFinalGradoAnterior;
    }

    public void setNotaPonderadoFinalGradoAnterior(double notaPonderadoFinalGradoAnterior) {
        this.notaPonderadoFinalGradoAnterior = notaPonderadoFinalGradoAnterior;
    }
}
