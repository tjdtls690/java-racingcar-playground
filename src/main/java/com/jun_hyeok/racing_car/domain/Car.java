package com.jun_hyeok.racing_car.domain;

import java.util.Objects;

public class Car {
    private final Name name;
    private Position position;

    public Car(String carName) {
        this(carName, 0);
    }

    public Car(String carName, int position) {
        this.name = new Name(carName);
        this.position = new Position(position);
    }

    public void move() {
        position = position.move();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(position, car.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }
}
