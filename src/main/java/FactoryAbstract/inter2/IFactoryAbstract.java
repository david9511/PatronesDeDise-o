package FactoryAbstract.inter2;

import Factory.inter.IConexion;
import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;

public interface IFactoryAbstract {
    IConexion2 getConexion(String nombre);
    IServicio getServicio(String servicio);
}
