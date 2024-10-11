package com.ejercicio.fastandfurious.model;

public class Cojineria {
    private String noPieza;
    private String material;

    public Cojineria(String noPieza, String material) {
        this.noPieza = noPieza;
        this.material = material;
    }

    public String getNoPieza() {
        return noPieza;
    }

    public void setNoPieza(String noPieza) {
        this.noPieza = noPieza;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
