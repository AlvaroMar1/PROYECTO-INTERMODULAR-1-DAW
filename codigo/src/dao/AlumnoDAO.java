package dao;

import model.Alumno;

import java.util.List;

public class AlumnoDAO implements IGenericDAO<Alumno> {
    @Override
    public List<Alumno> findAll() { return null; }

    @Override
    public Alumno findById(int id) { return null; }

    @Override
    public boolean insert(Alumno alumno) { return false; }

    @Override
    public boolean update(Alumno alumno) { return false; }

    @Override
    public boolean delete(int id) { return false; }

    public static void buscarNIA(String nia) {}

    public static void buscarNombre(String nombre) {}

    public static void buscarCursoAlumno(String curso) {}
}




