package com.jun_hyeok.racing_car.domain;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Cars {
    private final List<Car> carList;

    public Cars(String carsName) {
        carList = new ArrayList<>();
        createCars(getSplit(carsName));
    }

    private String[] getSplit(String carsName) {
        carsName = carsName.replace(" ", "");
        return carsName.split(",");
    }

    private void createCars(String[] split) {
        for (String car : split) {
            carList.add(new Car(car));
        }
    }
}
