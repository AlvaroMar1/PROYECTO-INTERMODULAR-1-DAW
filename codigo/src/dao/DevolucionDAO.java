package dao;

import model.Devolucion;

import java.util.List;

public class DevolucionDAO implements IGenericDAO<Devolucion> {
    @Override
    public List<Devolucion> findAll() { return null; }
    @Override
    public Devolucion findById(int id) { return null; }
    @Override
    public boolean insert(Devolucion devolucion) { return false; }
    @Override
    public boolean update(Devolucion devolucion) { return false; }
    @Override
    public boolean delete(int id) { return false; }
}
