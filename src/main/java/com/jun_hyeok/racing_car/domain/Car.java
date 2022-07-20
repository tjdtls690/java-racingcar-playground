package com.jun_hyeok.racing_car.domain;

public class Car {
    private final Name name;
    
    public Car(String carName) throws IllegalArgumentException {
        this.name = new Name(carName);
    }
}
