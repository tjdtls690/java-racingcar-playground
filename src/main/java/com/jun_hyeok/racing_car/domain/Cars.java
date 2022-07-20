package com.jun_hyeok.racing_car.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> carsList;
    
    public Cars(String carsName) throws IllegalArgumentException {
        carsList = new ArrayList<>();
        createCars(carsName);
    }
    
    private void createCars(String carsName) throws IllegalArgumentException {
        String[] carsNameList = getCarsNameList(carsName);
        
        for (String carName : carsNameList) {
            carsList.add(new Car(carName));
        }
    }
    
    private String[] getCarsNameList(String carsName) {
        carsName = carsName.replace(" ", "");
        return carsName.split(",");
    }
    
    public void move() {
        for (Car car : carsList) {
            car.move(new RandomMove());
        }
    }
}
