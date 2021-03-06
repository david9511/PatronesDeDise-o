package InyeccionDependencia;

import InyeccionDependencia.Dao.IConexion;
import InyeccionDependencia.Dao.PersonaDAO;
import InyeccionDependencia.Dao.imple.ConexionMySQL;
import InyeccionDependencia.Dao.imple.ConexionPostgre;
import InyeccionDependencia.Dao.imple.PersonaDAOImpl;

public class InyeccionDependencia {
    public static void main(String[] args) {
        IConexion cx1 = new ConexionMySQL("mitocode", "7482", "localhost");

        IConexion cx2 = new ConexionPostgre("mitocode", "7482", "192.168.1.1");

        PersonaDAO dao = new PersonaDAOImpl();
        dao.setConexion(cx1);

        dao.listarTodos();
    }
}
