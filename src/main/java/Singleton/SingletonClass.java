package Singleton;

import Singleton.Conexion.Conexion;

public class SingletonClass {
    public static void main(String[] args) {
        Conexion a = Conexion.getConexion();

        System.out.println(a.inicioConexion());
        System.out.println(a.finConexion());
    }
}
