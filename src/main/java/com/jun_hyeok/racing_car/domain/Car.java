package com.jun_hyeok.racing_car.domain;

import java.util.function.Supplier;

public class Car {
    private final Name name;
    private final CarDTO carDTO;
    
    public Car(String carName) throws IllegalArgumentException {
        this.name = new Name(carName);
        this.carDTO = new CarDTO(name, 0);
    }
    
    public void move(Supplier<Boolean> isMove) {
        if (isMove.get()) {
            carDTO.move();
        }
    }
    
    public Position getPosition() {
        return carDTO.getPosition();
    }
}
