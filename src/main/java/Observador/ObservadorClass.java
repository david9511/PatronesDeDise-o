package Observador;

import Observador.model.PesoARGObservador;
import Observador.model.PesoMXObservador;
import Observador.model.SolObservador;
import Observador.model.Subject;

public class ObservadorClass {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new SolObservador(subject);
        new PesoARGObservador(subject);
        new PesoMXObservador(subject);

        System.out.println("Si desea cambiar 10 dólares obtendrá : ");
        subject.setEstado(10);
        System.out.println("-----------------");
        System.out.println("Si desea cambiar 100 dólares obtendrá : ");
        subject.setEstado(100);
    }
}
