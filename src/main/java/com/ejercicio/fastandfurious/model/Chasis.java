package com.ejercicio.fastandfurious.model;

public class Chasis {
    private int noEjes;
    private String noPieza;
    private String tipoTransmision;

    public Chasis(int noEjes, String noPieza, String tipoTransmision) {
        this.noEjes = noEjes;
        this.noPieza = noPieza;
        this.tipoTransmision = tipoTransmision;
    }

    public int getNoEjes() {
        return noEjes;
    }

    public void setNoEjes(int noEjes) {
        this.noEjes = noEjes;
    }

    public String getNoPieza() {
        return noPieza;
    }

    public void setNoPieza(String noPieza) {
        this.noPieza = noPieza;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }
}
