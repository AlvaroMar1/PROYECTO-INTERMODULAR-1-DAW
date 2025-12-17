package model;

public class Libro {
    private int id_libro;
    private String titulo;
    private String autor;
    private String isbn;
    private String volumen;
    private String nivel_educativo;

    public Libro(){}

    public Libro(int id_libro, String titulo, String autor, String isbn, String volumen, String nivel_educativo){
        this.id_libro = id_libro;
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.volumen = volumen;
        this.nivel_educativo = nivel_educativo;
    }

    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getVolumen() {
        return volumen;
    }

    public void setVolumen(String volumen) {
        this.volumen = volumen;
    }

    public String getNivel_educativo() {
        return nivel_educativo;
    }

    public void setNivel_educativo(String nivel_educativo) {
        this.nivel_educativo = nivel_educativo;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id_libro=" + id_libro +
                ", titulo=" + titulo +
                ", autor=" + autor +
                ", isbn=" + isbn +
                ", volumen=" + volumen +
                ", nivel_educativo=" + nivel_educativo +
                '}';
    }
}
