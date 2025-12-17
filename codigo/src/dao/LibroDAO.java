package dao;

import model.Libro;

import java.util.List;

public class LibroDAO implements IGenericDAO<Libro> {
    @Override
    public List<Libro> findAll() { return null; }
    @Override
    public Libro findById(int id) { return null; }
    @Override
    public boolean insert(Libro libro) { return false; }
    @Override
    public boolean update(Libro libro) { return false; }
    @Override
    public boolean delete(int id) { return false; }

    public static void buscarISBN(String isbn){}
    public static void buscarTitulo(String titulo){}
}