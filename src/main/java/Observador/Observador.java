package Observador;

import Observador.model.Subject;

public abstract class Observador {

    protected Subject sujeto;
    public abstract void actualizar();
}
