package com.ejercicio.fastandfurious.model;

public class Motor {
    private int potenciaMaxima;
    private String noPieza;
    private String tecnologia;

    public Motor(int potenciaMaxima, String noPieza, String tecnologia) {
        this.potenciaMaxima = potenciaMaxima;
        this.noPieza = noPieza;
        this.tecnologia = tecnologia;
    }
    
    public int getPotenciaMaxima() {
        return potenciaMaxima;
    }

    public void setPotenciaMaxima(int potenciaMaxima) {
        this.potenciaMaxima = potenciaMaxima;
    }

    public String getNoPieza() {
        return noPieza;
    }

    public void setNoPieza(String noPieza) {
        this.noPieza = noPieza;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }
}
