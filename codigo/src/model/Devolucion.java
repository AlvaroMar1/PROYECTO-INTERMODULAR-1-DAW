package model;

public class Devolucion {
    private int id_devolucion;
    private String fecha_devolucion;
    private String estado_devolucion;
    private int id_prestamo;

    public Devolucion(){}

    public Devolucion(int id_devolucion, String fecha_devolucion, String estado_devolucion, int id_prestamo){
        this.id_devolucion = id_devolucion;
        this.fecha_devolucion = fecha_devolucion;
        this.estado_devolucion = estado_devolucion;
        this.id_prestamo = id_prestamo;
    }

    public int getId_devolucion() {
        return id_devolucion;
    }

    public void setId_devolucion(int id_devolucion) {
        this.id_devolucion = id_devolucion;
    }

    public String getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(String fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    public String getEstado_devolucion() {
        return estado_devolucion;
    }

    public void setEstado_devolucion(String estado_devolucion) {
        this.estado_devolucion = estado_devolucion;
    }

    public int getId_prestamo() {
        return id_prestamo;
    }

    public void setId_prestamo(int id_prestamo) {
        this.id_prestamo = id_prestamo;
    }

    @Override
    public String toString() {
        return "Devolucion{" +
                "id_devolucion=" + id_devolucion +
                ", fecha_devolucion=" + fecha_devolucion +
                ", estado_devolucion=" + estado_devolucion +
                ", id_prestamo=" + id_prestamo +
                '}';
    }
}
