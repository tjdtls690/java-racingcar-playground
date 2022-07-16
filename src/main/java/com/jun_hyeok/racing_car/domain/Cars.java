package com.jun_hyeok.racing_car.domain;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Cars {
    public static final int MOVE_NUM_POSITION = 4;
    private final List<Car> carList;

    public Cars(String carsName) throws IllegalArgumentException {
        carList = new ArrayList<>();
        createCars(getSplit(carsName));
    }

    private String[] getSplit(String carsName) {
        carsName = carsName.replace(" ", "");
        return carsName.split(",");
    }

    private void createCars(String[] split) throws IllegalArgumentException {
        for (String carName : split) {
            carList.add(new Car(carName));
        }
    }

    public void play() {
        for (Car car : carList) {
            int ranNum = (int) (Math.random() * 9) + 1;
            moveOrStop(car, ranNum);
        }
    }

    public void moveOrStop(Car car, int ranNum) {
        if (ranNum >= MOVE_NUM_POSITION) {
            car.move();
        }
    }
}
