package dao;

import model.Ejemplar;
import model.enums.EstadoEjemplar;

import java.util.List;

public class EjemplarDAO implements IGenericDAO<Ejemplar> {
    @Override
    public List<Ejemplar> findAll() { return null; }
    @Override
    public Ejemplar findById(int id) { return null; }
    @Override
    public boolean insert(Ejemplar ejemplar) { return false; }
    @Override
    public boolean update(Ejemplar ejemplar) { return false; }
    @Override
    public boolean delete(int id) { return false; }
    public static void verDisponibilidad(int id_libro){}
    public static void buscarCodigoUnico(String codigo_unico){}
    public static void cambiarEstado(String estado_actual){}
}