package DigitalizaciónColegio;

public class Controller {

    private Colegio colegio;
    private View view;

    public Controller(String nombre) {
        colegio = Colegio.obtenerInstanciaAlumno(nombre);
        colegio = Colegio.obtenerInstanciaProfesor(nombre);
        view = new View();
    }

    public void registrarAlumno(String... arg) throws NotaPonderadoFinalGradoAnteriorIncorrecto{
        Alumno alumno = Factoria.dameObjeto(arg);
        colegio.registrar(alumno);
    }

    public void mostrarListadoAlumno() {
        view.imprimirListado(colegio.getAlumnos());
    }


    public void mostrarBusquedaxDNIalumno() {
        Alumno p = colegio.obtenerDatosXDNIAlumno("780315694");
        view.mostrarBusquedaxDNIalumno(p);
    }


    public void registrarProfesor(String... arg) throws SueldoMaximoException{
        Profesor profesor = ProfesorFactoria.crear(arg);
        colegio.registrarProfesor(profesor);
    }

    public void buscarXDNIProfesor(){
        Profesor profesor = Colegio.obtenerDatosXDNIProfesor("45708997");
        view.mostrarBusquedaxDNIProfesor(profesor);
    }


    public void mostrarListadoProfesor() {
        view.printListadoProfesor(colegio.getProfesores());
    }



    public Colegio getColegio() {
        return colegio;
    }

    public void setColegio(Colegio colegio) {
        this.colegio = colegio;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }
}
