package FactoryAbstract;

import FactoryAbstract.inter2.IConexion2;
import FactoryAbstract.inter2.IFactoryAbstract;
import FactoryAbstract.inter2.IServicio;

public class FactoryAbstract {
    public static void main(String[] args) {
       IFactoryAbstract conexionBD = new Fabrica2().factory("BD");
       IConexion2 oracle =  conexionBD.getConexion("oracle");
        System.out.println(oracle.inicioConexion());
        System.out.println(oracle.finConexion());

        IFactoryAbstract conexionServicios = new Fabrica2().factory("servicios");
        IServicio compras = conexionServicios.getServicio("compras");
        compras.enviarUrl("Hola mundo compras");
    }
}
