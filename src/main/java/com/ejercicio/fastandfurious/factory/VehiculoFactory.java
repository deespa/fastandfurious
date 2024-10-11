package com.ejercicio.fastandfurious.factory;

import com.ejercicio.fastandfurious.model.Chasis;
import com.ejercicio.fastandfurious.model.Cojineria;
import com.ejercicio.fastandfurious.model.Motor;
import com.ejercicio.fastandfurious.model.Vehiculo;

public class VehiculoFactory {
    public static Vehiculo createVehiculo(String marca, String color, Chasis chasis, Motor motor, Cojineria cojineria) {
        return new Vehiculo(marca, color, chasis, motor, cojineria);
    }
}
