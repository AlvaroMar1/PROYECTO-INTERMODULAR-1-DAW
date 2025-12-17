package model;

import model.enums.EstadoEjemplar;


public class Ejemplar {
    private int id_ejemplar;
    private int codigo_unico;
    private EstadoEjemplar estado_actual;
    private boolean prestado;
    private int id_libro;

    public Ejemplar(){}

        public Ejemplar(int id_ejemplar, int codigo_unico, EstadoEjemplar estado_actual, int id_libro){
            this.id_ejemplar = id_ejemplar;
            this.codigo_unico = codigo_unico;
            this.estado_actual = estado_actual;
            this.id_libro = id_libro;
        }

    public int getId_ejemplar() {
        return id_ejemplar;
    }

    public void setId_ejemplar(int id_ejemplar) {
        this.id_ejemplar = id_ejemplar;
    }

    public int getCodigo_unico() {
        return codigo_unico;
    }

    public void setCodigo_unico(int codigo_unico) {
        this.codigo_unico = codigo_unico;
    }

    public EstadoEjemplar getEstado_actual(){
        return estado_actual;
    }

    public void setEstado_actual(EstadoEjemplar estado_actual) {
        this.estado_actual = estado_actual;
    }

    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }


    @Override
    public String toString() {
        return "Ejemplar{" +
                "id_ejemplar=" + id_ejemplar +
                ", codigo_unico=" + codigo_unico +
                ", estado_actual=" + estado_actual +
                ", id_libro=" + id_libro +
                '}';
    }

}
