package model;

import model.enums.EstadoPrestamo;

public class Prestamo {
    private int id_prestamo;
    private String fecha_prestamo;
    private EstadoPrestamo estado_actual;
    private String curso_academico;
    private int id_alumno;
    private int id_ejemplar;

    public Prestamo(){}

    public Prestamo(int id_prestamo, String fecha_prestamo, EstadoPrestamo estado_actual, String curso_academico, int id_alumno, int id_ejemplar){
        this.id_prestamo = id_prestamo;
        this.fecha_prestamo = fecha_prestamo;
        this.estado_actual = estado_actual;
        this.curso_academico = curso_academico;
        this.id_alumno = id_alumno;
        this.id_ejemplar = id_ejemplar;
    }

    public int getId_prestamo() {
        return id_prestamo;
    }

    public void setId_prestamo(int id_prestamo) {
        this.id_prestamo = id_prestamo;
    }

    public String getFecha_prestamo() {
        return fecha_prestamo;
    }

    public void setFecha_prestamo(String fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    public EstadoPrestamo getEstado_actual() {
        return estado_actual;
    }

    public void setEstado_actual(EstadoPrestamo estado_actual) {
        this.estado_actual = estado_actual;
    }

    public String getCurso_academico() {
        return curso_academico;
    }

    public void setCurso_academico(String curso_academico) {
        this.curso_academico = curso_academico;
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    public int getId_ejemplar() {
        return id_ejemplar;
    }

    public void setId_ejemplar(int id_ejemplar) {
        this.id_ejemplar = id_ejemplar;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "id_prestamo=" + id_prestamo +
                ", fecha_prestamo=" + fecha_prestamo +
                ", estado_inicial=" + estado_actual +
                ", curso_academico=" + curso_academico +
                ", id_alumno=" + id_alumno +
                ", id_ejemplar=" + id_ejemplar +
                '}';
    }

}