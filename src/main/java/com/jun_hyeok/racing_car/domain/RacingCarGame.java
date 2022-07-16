package com.jun_hyeok.racing_car.domain;

public class RacingCarGame {
    private Cars cars;

    public void createCar(String carsName) throws IllegalArgumentException {
        cars = new Cars(carsName);
    }
}
