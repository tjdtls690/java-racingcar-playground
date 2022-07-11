package com.jun_hyeok.racing_car.domain;

import java.util.ArrayList;
import java.util.List;

public class RacingCarGame {
    private final List<Car> carList;

    public RacingCarGame() {
        carList = new ArrayList<>();
    }

    public void stopIfNotMove(Car car, int ranNum) {
        if (ranNum > 3) {
            car.move();
        }
    }

    public void createCar(String players) {
        Car player = new Car(players);
        carList.add(player);
    }
}
