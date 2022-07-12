package Decorator;

import Decorator.Decorador.BlindajeDecorador;
import Decorator.Interf.ICuentaBancaria;
import Decorator.Interf.Impl.CuentaAhorro;
import Decorator.Model.Cuenta;

public class DecoradorClass {
    public static void main(String[] args) {
        Cuenta c = new Cuenta(1, "Pruebas");

        ICuentaBancaria cuenta = new CuentaAhorro();
        ICuentaBancaria cuentaBlindada = new BlindajeDecorador(cuenta);

        //cuenta.abrirCuenta(c);
        cuentaBlindada.AbrirCuenta(c);
    }
}
