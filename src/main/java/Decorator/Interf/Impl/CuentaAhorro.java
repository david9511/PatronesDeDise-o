package Decorator.Interf.Impl;

import Decorator.Interf.ICuentaBancaria;
import Decorator.Model.Cuenta;

public class CuentaAhorro implements ICuentaBancaria {
    @Override
    public void AbrirCuenta(Cuenta cuenta) {
        System.out.println("-------------------------");
        System.out.println("Se abrió una cuenta de Ahorros");
        System.out.println("Cliente: " + cuenta.getCliente());
    }
}
