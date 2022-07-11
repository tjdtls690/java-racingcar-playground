package com.jun_hyeok.racing_car.domain;

public class RacingCarGame {
    public void stopIfNotMove(Car car, int ranNum) {
        if (ranNum > 3) {
            car.move();
        }
    }
}
