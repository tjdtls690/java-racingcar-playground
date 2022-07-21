package com.jun_hyeok.racing_car.domain;

import java.util.function.Supplier;

public class Car {
    private final Name name;
    private final CarDTO carDTO;
    
    public Car(String carName) throws IllegalArgumentException {
        this(carName, 0);
    }
    
    public Car(String carName, int position) throws IllegalArgumentException{
        this.name = new Name(carName);
        this.carDTO = new CarDTO(name, position);
    }
    
    public void move(Supplier<Boolean> isMove) {
        if (isMove.get()) {
            carDTO.move();
        }
    }
    
    public Position getPosition() {
        return carDTO.getPosition();
    }
    
    public boolean lessThan(Car mxCar) {
        return carDTO.lessThan(mxCar.carDTO);
    }
    
    public boolean isWinner(Car mxCar) {
        return carDTO.isWinner(mxCar.carDTO);
    }
    
    public String getName() {
        return name.getName();
    }
}
