package modulo.profesor;

public abstract class Profesor {

    private String codigo;
    private String nombre;
    private String apellido;
    private String correo;
    private String nivel;
    private String especialidad;

    public Profesor() {
    }

    public Profesor(String codigo, String nombre, String apellido, String correo, String nivel, String especialidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.nivel = nivel;
        this.especialidad = especialidad;
    }

    public String obetenerDatos() {
        return "Codigo de docente: " + codigo + " Datos del docente: " + nombre + " " + apellido
                + " Correo del profesor: " +correo + " Nivel: " + nivel + " Especalidad ";
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
            case "Lenguaje":
                bono = 1.06;
                break;
            case "Idiomas":
                bono = 1.05;
                break;
            case "Historia":
                bono = 1.04;
                break;
            case "Religión":
                bono = 1.03;
                break;
            case "Educacion fisica":
                bono = 1.02;
                break;
        }return bono;
    }

    public double calcularSueldoFinal() {
        return 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
