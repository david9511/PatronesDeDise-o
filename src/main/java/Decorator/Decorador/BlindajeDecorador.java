package Decorator.Decorador;

import Decorator.Interf.ICuentaBancaria;
import Decorator.Model.Cuenta;

public class BlindajeDecorador extends CuentaDecorador{

    public BlindajeDecorador(ICuentaBancaria cuentaDecorada) {
        super(cuentaDecorada);
    }

    public void agregarBlindaje(Cuenta c) {
        System.out.println("Se agregó blindaje a la cuenta del cliente " + c.getCliente());
    }

    @Override
    public void AbrirCuenta(Cuenta cuenta) {
        cuentaDecorada.AbrirCuenta(cuenta);
        agregarBlindaje(cuenta);
    }
}
