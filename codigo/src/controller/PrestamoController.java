package controller;
import dao.*;

public class PrestamoController {
    private PrestamoDAO prestamoDAO = new PrestamoDAO();
    private EjemplarDAO ejemplarDAO = new EjemplarDAO();
    private AlumnoDAO alumnoDAO = new AlumnoDAO();
    private DevolucionDAO devolucionDAO = new DevolucionDAO();
    private LibroDAO libroDAO = new LibroDAO();

    public void prestarLibro(){}
    public void devolverLibro(){}
}
