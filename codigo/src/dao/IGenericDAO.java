package dao;

import model.Alumno;

import java.util.List;

public interface IGenericDAO<T> {
    List<T> findAll();
    T findById(int id);
    boolean insert(T t);
    boolean update(T t);
    boolean delete(int id);
}
