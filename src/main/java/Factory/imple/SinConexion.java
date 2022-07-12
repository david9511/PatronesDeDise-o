package Factory.imple;

import Factory.inter.IConexion;

public class SinConexion implements IConexion {
    @Override
    public String inicioConexion() {
        return "Sin Iniciar Conexion";
    }

    @Override
    public String finConexion() {
        return "Sin finalizar Conexion";
    }
}
