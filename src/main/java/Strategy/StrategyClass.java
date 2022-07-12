package Strategy;

import Strategy.interf.AntivirusAvanzado;

public class StrategyClass {
    public static void main(String[] args) {
        Contexto contexto = new Contexto(new AntivirusAvanzado());
        contexto.ejecutar();
    }
}
