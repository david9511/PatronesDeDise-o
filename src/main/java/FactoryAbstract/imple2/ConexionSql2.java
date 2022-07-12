package FactoryAbstract.imple2;

import FactoryAbstract.inter2.IConexion2;

public class ConexionSql2 implements IConexion2 {
    @Override
    public String inicioConexion() {
        return "Inicio Conexion SQL";
    }

    @Override
    public String finConexion() {
        return "Fin Conexion SQL";
    }
}
