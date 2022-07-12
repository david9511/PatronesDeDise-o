package Decorator.Decorador;

import Decorator.Interf.ICuentaBancaria;
import Decorator.Model.Cuenta;

public abstract class CuentaDecorador implements ICuentaBancaria {
    protected ICuentaBancaria cuentaDecorada;

    public CuentaDecorador(ICuentaBancaria cuentaDecorada) {
        this.cuentaDecorada = cuentaDecorada;
    }

    @Override
    public void AbrirCuenta(Cuenta c) {
        this.cuentaDecorada.AbrirCuenta(c);
    }
}
