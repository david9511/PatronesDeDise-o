package FactoryAbstract.imple2;

import FactoryAbstract.inter2.IConexion2;

public class ConexionOracle2 implements IConexion2 {

    @Override
    public String inicioConexion() {
        return "Inicio Conexion Oracle";
    }

    @Override
    public String finConexion() {
        return "Fin Conexion Oracle";
    }
}
