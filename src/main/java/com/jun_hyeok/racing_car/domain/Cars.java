package com.jun_hyeok.racing_car.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> carsList;
    
    public Cars(String carsName) {
        carsList = new ArrayList<>();
        createCars(carsName);
    }
    
    private void createCars(String carsName) {
        String[] carsNameList = getCarsNameList(carsName);
        
        for (String carName : carsNameList) {
            carsList.add(new Car(carName));
        }
    }
    
    private String[] getCarsNameList(String carsName) {
        carsName = carsName.replace(" ", "");
        String[] carsNameList = carsName.split(",");
        return carsNameList;
    }
}
