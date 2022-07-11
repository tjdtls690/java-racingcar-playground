package com.jun_hyeok.racing_car.domain;

public class Car {

    private final CarPosition position;

    public Car() {
        position = new CarPosition();
    }

    public int getPosition() {
        return position.getPosition();
    }

    public void move() {
        position.plus();
    }
}
