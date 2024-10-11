package com.ejercicio.fastandfurious.factory;

import com.ejercicio.fastandfurious.model.Chasis;
import com.ejercicio.fastandfurious.model.Cojineria;
import com.ejercicio.fastandfurious.model.Motor;


public class CojineriaFactory implements AbstractFactory {
    
    @Override
    public Cojineria createCojineria() {
        return new Cojineria("CJ123", "cuero");
    }

    @Override
    public Chasis createChasis() {
        return null;
    }

    @Override
    public Motor createMotor() {
        return null;
    }

    
}
