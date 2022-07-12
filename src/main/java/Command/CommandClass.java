package Command;

import Command.interf.imple.DepositarImpl;
import Command.interf.imple.RetirarImpl;
import Command.model.Cuenta;

public class CommandClass {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1, 200);

        //Prueba comando
        DepositarImpl opDepositar = new DepositarImpl(cuenta, 100);
        RetirarImpl opRetirar = new RetirarImpl(cuenta, 50);

        Invoker ivk = new Invoker();
        ivk.recibirOperacion(opDepositar);
        ivk.recibirOperacion(opRetirar);

        ivk.realizarOperaciones();
    }
}
