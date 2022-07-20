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
    
    public List<Car> findWinners() {
        Car mxCar = new Car("mx", -1);
        for (Car car : carsList) {
            if (car.lessThan(mxCar)) {
                mxCar = car;
            }
        }
    
        
        List<Car> winners = new ArrayList<>();
        for (Car car : carsList) {
            if (car.isWinner(mxCar)) {
                winners.add(car);
            }
        }
        
        return winners;
    }
}
