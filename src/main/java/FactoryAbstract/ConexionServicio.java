package FactoryAbstract;

import FactoryAbstract.imple2.ServicioCompras;
import FactoryAbstract.imple2.ServicioVentas;
import FactoryAbstract.imple2.SinServicio;
import FactoryAbstract.inter2.IConexion2;
import FactoryAbstract.inter2.IFactoryAbstract;
import FactoryAbstract.inter2.IServicio;

public class ConexionServicio implements IFactoryAbstract {
    @Override
    public IConexion2 getConexion(String nombre) {
        return null;
    }

    @Override
    public IServicio getServicio(String servicio) {
        if(servicio.equalsIgnoreCase("compras")){
            return new ServicioCompras();
        } else if (servicio.equalsIgnoreCase("ventas")) {
            return new ServicioVentas();
        }
        return new SinServicio();
    }
}
