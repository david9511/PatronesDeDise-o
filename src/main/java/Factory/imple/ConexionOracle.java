package Factory.imple;

import Factory.inter.IConexion;

public class ConexionOracle implements IConexion {

    @Override
    public String inicioConexion() {
        return "Inicio Conexion Oracle";
    }

    @Override
    public String finConexion() {
        return "Fin Conexion Oracle";
    }
}
