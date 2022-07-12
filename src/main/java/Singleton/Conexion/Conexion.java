package Singleton.Conexion;

public class Conexion {

    private static Conexion iniciarInstancia;

    private Conexion() {
    }

    public static Conexion getConexion(){
        if(iniciarInstancia == null){
            iniciarInstancia = new Conexion();
        }
        return iniciarInstancia;
    }

    public String inicioConexion(){
        return "Conexion Exitosa";
    }

    public String finConexion(){
        return "Conexion terminada";
    }
}
