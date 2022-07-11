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

    public String getCurrentSituation() {
        StringBuilder currentSituation = new StringBuilder();
        for(int i = 0; i < getPosition(); i++){
            currentSituation.append("-");
        }
        return String.valueOf(currentSituation);
    }
}
