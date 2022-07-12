package Factory;

import Factory.imple.ConexionOracle;
import Factory.imple.ConexionSql;
import Factory.imple.SinConexion;
import Factory.inter.IConexion;

public class Fabrica {

    public IConexion conexion(String nombre){
        if(nombre.equalsIgnoreCase("sql")){
            return new ConexionSql();
        } else if (nombre.equalsIgnoreCase("oracle")) {
            return new ConexionOracle();
        }
       return new SinConexion();
    }
}
