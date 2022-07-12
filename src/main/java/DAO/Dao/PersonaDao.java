package DAO.Dao;

import DAO.model.Persona;

public interface PersonaDao extends Crud<Persona>{
    void mostrarNombre();
}
