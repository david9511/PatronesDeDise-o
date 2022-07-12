package FactoryAbstract;

import Factory.inter.IConexion;
import FactoryAbstract.imple2.ConexionOracle2;
import FactoryAbstract.imple2.ConexionSql2;
import FactoryAbstract.imple2.SinConexion2;
import FactoryAbstract.inter2.IConexion2;
import FactoryAbstract.inter2.IFactoryAbstract;
import FactoryAbstract.inter2.IServicio;

public class ConexionBD implements IFactoryAbstract {

    @Override
    public IConexion2 getConexion(String nombre) {
        if(nombre.equalsIgnoreCase("sql")){
            return new ConexionSql2();
        } else if (nombre.equalsIgnoreCase("oracle")) {
            return new ConexionOracle2();
        }
        return new SinConexion2();
    }

    @Override
    public IServicio getServicio(String servicio) {
        return null;
    }
}
