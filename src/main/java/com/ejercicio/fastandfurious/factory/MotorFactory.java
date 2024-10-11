package com.ejercicio.fastandfurious.factory;

import com.ejercicio.fastandfurious.model.Chasis;
import com.ejercicio.fastandfurious.model.Cojineria;
import com.ejercicio.fastandfurious.model.Motor;

public class MotorFactory implements AbstractFactory {
    public Motor createMotor() {
        return new Motor(200, "M123", "eléctrico");
    }

    @Override
    public Chasis createChasis() {
        return null;
    }

    @Override
    public Cojineria createCojineria() {
        return null;
    }
}
