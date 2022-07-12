package DAO;

import DAO.Dao.Crud;
import DAO.Dao.Imple.PersonaImple;
import DAO.Dao.PersonaDao;
import DAO.model.Persona;

public class DaoClass {
    public static void main(String[] args) {
        Crud<Persona> dao = new PersonaImple();
        dao.listarTodos().forEach(x -> System.out.println(x.getNombres()));

        Persona per = new Persona();
        per.setNombres("Pruebas");
        dao.registrar(per);
    }
}
