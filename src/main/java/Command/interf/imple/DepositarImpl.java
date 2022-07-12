package Command.interf.imple;

import Command.interf.IOperacion;
import Command.model.Cuenta;

public class DepositarImpl implements IOperacion {
    private Cuenta cuenta;
    private double monto;

    public DepositarImpl(Cuenta cuenta, double monto) {
        this.cuenta = cuenta;
        this.monto = monto;
    }
    @Override
    public void execute() {
        this.cuenta.depositar(this.monto);
    }
}
