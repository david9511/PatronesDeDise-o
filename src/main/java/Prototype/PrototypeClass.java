package Prototype;

import Prototype.modelo.CuentaHAImpl;

public class PrototypeClass {

    public static void main(String[] args) {
        CuentaHAImpl cuenta = new CuentaHAImpl();
        cuenta.setMonto(200);

        CuentaHAImpl cuentaClonada = (CuentaHAImpl) cuenta.clonar();

        if(cuentaClonada != null){
            System.out.println(cuentaClonada.toString());
        }
    }
}
