package com.ejercicio.fastandfurious.builder;

import com.ejercicio.fastandfurious.model.Vehiculo;

public class VehiculoBuilder {
    private Vehiculo vehiculo;

    public VehiculoBuilder(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Vehiculo construir() {
        return vehiculo;
    }
}
