package com.jun_hyeok.racing_car.domain;

import java.util.List;

public class RacingCarGame {
    private final Cars cars;
    
    public RacingCarGame(String carsName) throws IllegalArgumentException {
        cars = new Cars(carsName);
    }
    
    public void moveCars() {
        cars.move();
    }
}
