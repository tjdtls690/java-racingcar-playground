package com.jun_hyeok.racing_car.domain;

import java.util.List;

public class RacingCarGame {
    private Cars cars;

    public void createCar(String carsName) throws IllegalArgumentException {
        cars = new Cars(carsName);
    }

    public List<Car> findWinner() {
        return cars.findWinner();
    }
}
