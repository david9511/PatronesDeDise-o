package Proxy;

import Proxy.Proxy.CuentaProxy;
import Proxy.interf.ICuenta;
import Proxy.interf.imple.CuentaBancoBImpl;
import Proxy.model.Cuenta;

public class ProxyClass {
    public static void main(String[] args) {
        Cuenta c = new Cuenta(1, "mitocode", 100);

        ICuenta cuentaProxy = new CuentaProxy(new CuentaBancoBImpl());
        cuentaProxy.mostrarSaldo(c);
        c = cuentaProxy.depositarDinero(c, 50);
        c = cuentaProxy.retirarDinero(c, 20);
        cuentaProxy.mostrarSaldo(c);
    }
}
