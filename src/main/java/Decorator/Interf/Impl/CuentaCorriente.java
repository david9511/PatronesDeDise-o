package Decorator.Interf.Impl;

import Decorator.Interf.ICuentaBancaria;
import Decorator.Model.Cuenta;

public class CuentaCorriente implements ICuentaBancaria {
    @Override
    public void AbrirCuenta(Cuenta cuenta) {
        System.out.println("-------------------------");
        System.out.println("Se abrió una cuenta Corriente");
        System.out.println("Cliente: " + cuenta.getCliente());
    }
}
