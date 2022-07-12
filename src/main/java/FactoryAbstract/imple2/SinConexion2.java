package FactoryAbstract.imple2;

import FactoryAbstract.inter2.IConexion2;

public class SinConexion2 implements IConexion2 {
    @Override
    public String inicioConexion() {
        return "Sin Iniciar Conexion";
    }

    @Override
    public String finConexion() {
        return "Sin finalizar Conexion";
    }
}
