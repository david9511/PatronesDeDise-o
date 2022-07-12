package FactoryAbstract.imple2;

import FactoryAbstract.inter2.IServicio;

public class ServicioVentas implements IServicio {

    @Override
    public void enviarUrl(String url) {
        System.out.println("El servicio de ventas es: "+ url);
    }
}
