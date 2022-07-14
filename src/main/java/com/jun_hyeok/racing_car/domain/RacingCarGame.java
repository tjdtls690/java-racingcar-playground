package com.jun_hyeok.racing_car.domain;

public class RacingCarGame {
    private Cars cars;

    public void createCar(String carsName) {
        cars = new Cars(carsName);
    }
}
