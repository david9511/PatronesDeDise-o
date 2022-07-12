package FactoryAbstract;

import FactoryAbstract.inter2.IFactoryAbstract;

public class Fabrica2 {

    public IFactoryAbstract factory(String nombre){
        if(nombre.equalsIgnoreCase("BD")){
            return new ConexionBD();
        }else{
            return new ConexionServicio();
        }
    }
}
