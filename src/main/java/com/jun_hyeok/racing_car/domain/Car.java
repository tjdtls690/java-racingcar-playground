package com.jun_hyeok.racing_car.domain;

public class Car {

    private final CarPosition position;
    private final CarName name;

    public Car(String name) {
        position = new CarPosition();
        this.name = new CarName(name);
    }

    public int getPosition() {
        return position.getPosition();
    }

    public void move() {
        position.plus();
    }
}
