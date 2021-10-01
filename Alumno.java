package DigitalizaciónColegio;

public abstract class Alumno {

    private String dni;
    private String nombres;
    private String apellidos;
    private int edad;
    private int grado;

    public Alumno() {
    }

    public Alumno(String dni, String nombres, String apellidos, int edad, int grado) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.grado = grado;
    }

    public  abstract double calcularCostoPension();

    public abstract double calcularPrimeraBoleta();

    public double obtenerPrecioPensionMensualGrado(){
        double precioGrado=0;
        switch (grado) {
            case 1:
                precioGrado = 500;
                break;
            case 2:
                precioGrado = 600;
                break;
            case 3:
                precioGrado = 700;
                break;
            case 4 :
                precioGrado = 800;
                break;
            case 5:
                precioGrado = 900;
                break;
        }
        return precioGrado;
    }

    public String obtenerCursosYHorarioPorGrado(){
        String cursosYhorario=null;
        switch (grado) {
            case 1:
                cursosYhorario = "\n"+"lenguaje 1"+"\n"+"aritmetica"+"\n"+"fisica 1"+"\n"+"quimica 1"+"\n"+"historia 1" +"\n"+"ingles 1"+"\n"+ "E.física" +"\n"+
                        "horario: lunes a viernes de 8:00 - 14:00 --- sábados de 9:00 - 12:00";
                break;
            case 2:
                cursosYhorario = "\n"+"lenguaje 2"+"\n"+"algebra"+"\n"+"fisica 2"+"\n"+"quimica 2"+"\n"+"historia 2" +"\n"+"ingles 2"+"\n"+ "E.física" +"\n"+
                        "horario: lunes a viernes de 8:00 - 14:00 --- sábados de 9:00 - 12:00";
                break;
            case 3:
                cursosYhorario = "\n"+"lenguaje 3"+"\n"+"geometria"+"\n"+"fisica 3"+"\n"+"quimica 3"+"\n"+"filosofia" +"\n"+"frances"+"\n"+ "E.física" +"\n"+
                        "horario: lunes a viernes de 8:00 - 14:00 --- sábados de 9:00 - 12:00";
                break;
            case 4 :
                cursosYhorario = "\n"+"redaccion"+"\n"+"trigonometria"+"\n"+"TExamenAdmision"+"\n"+"biologia 1"+"\n"+"literatura" +"\n"+"portugues 1"+"\n"+ "E.física" +"\n"+
                        "horario: lunes a viernes de 8:00 - 14:00 --- sábados de 9:00 - 12:00";
                break;
            case 5:
                cursosYhorario = "\n"+"razonamientoVerbal"+"\n"+"estadistica"+"\n"+"TExamenAdmision"+"\n"+"biologia 2"+"\n"+"psicologia" +"\n"+"portugues 2"+"\n"+ "E.física" +"\n"+
                        "horario: lunes a viernes de 8:00 - 14:00 --- sábados de 9:00 - 12:00";
                break;
        }
        return cursosYhorario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    @Override
    public String toString() {
        return "\n" +"Alumno" + "\n" +
                "dni= " + dni + '\n' +
                "nombres= " + nombres + '\n' +
                "apellidos= " + apellidos + '\n' +
                "edad=" + edad +"\n" +
                "grado=" + grado + "\n" +
                "costoPrimeraBoleta= " + calcularPrimeraBoleta() + "\n" +
                "costoPension= " + calcularCostoPension() + "\n" +
                "\ncursosYHorario: "+"\n" + obtenerCursosYHorarioPorGrado();
    }
}
