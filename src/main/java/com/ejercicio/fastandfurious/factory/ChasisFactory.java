package com.ejercicio.fastandfurious.factory;

import com.ejercicio.fastandfurious.model.Chasis;
import com.ejercicio.fastandfurious.model.Cojineria;
import com.ejercicio.fastandfurious.model.Motor;

public class ChasisFactory implements AbstractFactory {
    
    @Override
    public Chasis createChasis() {
        return new Chasis(4, "CH123", "automática");
    }

    @Override
    public Motor createMotor() {
        
        return null;
    }

    @Override
    public Cojineria createCojineria() {
        return null;
    }
}
