package DAO.Dao;

import java.util.List;

public interface Crud <T>{
    List<T> listarTodos();
    T leerPorId (int id);
    void registrar(T t);
    void actualizar(T t);
    void eliminar(int id);
}
