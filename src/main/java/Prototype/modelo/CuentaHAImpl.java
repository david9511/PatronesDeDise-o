package Prototype.modelo;

import Prototype.interf.ICuenta;



public class CuentaHAImpl implements ICuenta {

    private String tipo;
    private double monto;

    public CuentaHAImpl(){
        this.tipo = "Ahorro";
    }

    @Override
    public ICuenta clonar() {
        CuentaHAImpl cuenta = null;

        try{
            cuenta = (CuentaHAImpl) clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return cuenta;
    }

    @Override
    public String toString() {
        return "CuentaHAImpl{" +
                "tipo='" + tipo + '\'' +
                ", monto=" + monto +
                '}';
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
