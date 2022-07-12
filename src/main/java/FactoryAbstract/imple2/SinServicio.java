package FactoryAbstract.imple2;

import FactoryAbstract.inter2.IServicio;

public class SinServicio implements IServicio {
    @Override
    public void enviarUrl(String url) {
        System.out.println("Sin servicios");
    }
}
