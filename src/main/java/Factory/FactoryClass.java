package Factory;

import Factory.inter.IConexion;

public class FactoryClass {
    public static void main(String[] args) {
        Fabrica conexionFabrica = new Fabrica();

        IConexion sql = conexionFabrica.conexion("sql");
        System.out.println(sql.inicioConexion());
        System.out.println(sql.finConexion());

        IConexion oracle = conexionFabrica.conexion("oracle");
        System.out.println(oracle.inicioConexion());
        System.out.println(oracle.finConexion());

        IConexion sinConexion = conexionFabrica.conexion("sinConexion");
        System.out.println(sinConexion.inicioConexion());
        System.out.println(sinConexion.finConexion());
    }
}
