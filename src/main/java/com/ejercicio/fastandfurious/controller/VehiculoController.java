package com.ejercicio.fastandfurious.controller;

import com.ejercicio.fastandfurious.factory.ChasisFactory;
import com.ejercicio.fastandfurious.factory.CojineriaFactory;
import com.ejercicio.fastandfurious.factory.MotorFactory;
import com.ejercicio.fastandfurious.factory.VehiculoFactory;
import com.ejercicio.fastandfurious.model.Chasis;
import com.ejercicio.fastandfurious.model.Cojineria;
import com.ejercicio.fastandfurious.model.Motor;
import com.ejercicio.fastandfurious.model.Vehiculo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {

    private final ChasisFactory chasisFactory;
    private final MotorFactory motorFactory;
    private final CojineriaFactory cojineriaFactory;

    public VehiculoController() {
        this.chasisFactory = new ChasisFactory();
        this.motorFactory = new MotorFactory();
        this.cojineriaFactory = new CojineriaFactory();
    }

    @PostMapping
    public Vehiculo crearVehiculo(@RequestBody VehiculoRequest request) {
        Chasis chasis = chasisFactory.createChasis();
        Motor motor = motorFactory.createMotor();
        Cojineria cojineria = cojineriaFactory.createCojineria();
        return VehiculoFactory.createVehiculo(request.getMarca(), request.getColor(), chasis, motor, cojineria);
    }

    @GetMapping("/{marca}")
    public Vehiculo obtenerVehiculo(@PathVariable String marca) {
        Chasis chasis = chasisFactory.createChasis();
        Motor motor = motorFactory.createMotor();
        Cojineria cojineria = cojineriaFactory.createCojineria();

        return VehiculoFactory.createVehiculo(marca, "Negro", chasis, motor, cojineria);
    }
}

class VehiculoRequest {
    private String marca;
    private String color;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
