package com.mex.SpringBootProject.entities;

/**
 *
 * @author marco
 */
public enum RiscoEnum {

    A(0, "A"), B(10, "B"), C(20, "C");

    private int cantidad = 0;
    private String name = "";

    RiscoEnum(int cant, String name) {
        this.cantidad = cant;
        this.name = name;
    }

    RiscoEnum(String name) {
        this.name = name;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getName() {
        return name;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    

}
