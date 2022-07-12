package Strategy;

import Strategy.interf.IEstrategia;

public class Contexto {
    private IEstrategia estrategia;

    public Contexto(IEstrategia estrategia) {
        this.estrategia = estrategia;
    }

    public void ejecutar() {
        this.estrategia.analizar();
    }
}
