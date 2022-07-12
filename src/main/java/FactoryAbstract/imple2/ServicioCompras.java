package FactoryAbstract.imple2;

import FactoryAbstract.inter2.IServicio;

public class ServicioCompras implements IServicio {

    @Override
    public void enviarUrl(String url) {
        System.out.println("El Servicio de compras es: " + url);
    }
}
