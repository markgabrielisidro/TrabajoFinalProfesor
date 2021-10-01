package DigitalizaciónColegio;

public abstract class Profesor {

    private String dni;
    private String nombre;
    private String apellido;
    private String correo;
    private String especialidad;

    public Profesor() {
    }

    public Profesor(String dni, String nombre, String apellido, String correo, String especialidad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.especialidad = especialidad;
    }

    public String obetenerDatos(){
        return "DNI de docente: " + dni + '\n' + "Datos del docente: " + nombre + " " + apellido
                + '\n' + "Correo del profesor: " +correo + '\n' + "Especalidad " + especialidad+ " "+ '\n' + "Lista de Cursos: " + '\n' +obtenerCursoxEspecialidad() + '\n';
    }

    public double calcularBonoEspecialidad() {
        double bono = 1;

        switch (especialidad) {
            case "Matematica":
                bono = 1.08;
                break;
            case "Ciencias":
                bono = 1.07;
                break;
            case "Letras":
                bono = 1.06;
                break;
            case "Lenguaje":
                bono = 1.05;
                break;
            case "Idiomas":
                bono = 1.045;
                break;
            case "Educacion Fisica":
                bono = 1.04;
                break;
        }return bono;
    }

    public String obtenerCursoxEspecialidad(){
        String curso = null;
        switch (especialidad){
            case "Matematica":
                curso = "Geometria " + '\n' +"Aritmetica" + '\n' + "Trigonometria" + '\n' + "Algebra" + '\n' +"Estadistica";
            break;
            case "Ciencias":
                curso = "Fisica 1 " + '\n' + "Fisica 2 " + '\n' + "Fisica 3"+ '\n' +"Quimica1" + '\n' + "Quimica2" + '\n' +"Biologia";
                break;
            case "Letras":
                curso = "Literatura" + '\n' + "Filosofia" + '\n' + "Historia1" + '\n' + "Historia2";
                break;
            case "Lenguaje":
                curso = "Redacción" + '\n' + "Razonamiento Verbal" + '\n' + "Lenguaje1" + '\n' +"Lenguaje2";
                break;
            case  "Idiomas":
                curso = "Ingles1" + '\n' +"Ingles2"+ '\n' + "Frances"+ '\n' +"Portugues";
                break;
            case "Educacion Fisica":
                curso = "Atletismo" + '\n' + "Futbol" + '\n' + "Basquet" + '\n' +"Voley";
                break;
        }return curso;
    }

    public abstract double calcularSueldoFinal();

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
