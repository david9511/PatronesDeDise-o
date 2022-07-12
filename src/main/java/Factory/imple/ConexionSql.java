package Factory.imple;

import Factory.inter.IConexion;

public class ConexionSql implements IConexion {
    @Override
    public String inicioConexion() {
        return "Inicio Conexion SQL";
    }

    @Override
    public String finConexion() {
        return "Fin Conexion SQL";
    }
}
