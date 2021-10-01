package DigitalizaciónColegio;

public class AlumnoNuevo extends Alumno{

    private String tipoColegio;

    public AlumnoNuevo(String dni, String nombres, String apellidos, int edad, int grado, String tipoColegio) {
        super(dni, nombres, apellidos, edad, grado);
        this.tipoColegio = tipoColegio;
    }

    public double calcularCostoPension(){
        double costoPension=0;
        if (tipoColegio.equals("nacional")) {
            return costoPension = obtenerPrecioPensionMensualGrado() * 0.8;
        }
        return obtenerPrecioPensionMensualGrado();
    }

    @Override
    public double calcularPrimeraBoleta() {
        double costoTotalPrimeraBoleta=0;
        double costoMatricula=250;
        if (tipoColegio.equals("nacional")){
           return costoTotalPrimeraBoleta= costoMatricula*0.8 + calcularCostoPension();
        }
        return costoTotalPrimeraBoleta=costoMatricula + calcularCostoPension();
    }

    public String getTipoColegio() {
        return tipoColegio;
    }

    public void setTipoColegio(String tipoColegio) {
        this.tipoColegio = tipoColegio;
    }

}
