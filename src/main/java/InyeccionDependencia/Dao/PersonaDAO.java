package InyeccionDependencia.Dao;


import InyeccionDependencia.model.Persona;

public interface PersonaDAO extends CRUD<Persona>{
    void mostrarNombre();
    void setConexion(IConexion conexion);
}
