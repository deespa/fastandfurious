package com.ejercicio.fastandfurious.factory;

import com.ejercicio.fastandfurious.model.Chasis;
import com.ejercicio.fastandfurious.model.Cojineria;
import com.ejercicio.fastandfurious.model.Motor;

public interface AbstractFactory {
    Chasis createChasis();
    Motor createMotor();
    Cojineria createCojineria();
}
