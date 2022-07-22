package com.jun_hyeok.racing_game.domain;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private final Cars cars;
    
    public RacingGame(String carsName) {
        cars = new Cars(createCarsList(carsName));
    }
    
    static List<Car> createCarsList(String carsName) {
        List<Car> carsList = new ArrayList<>();
        String[] carsSplit = getCarsSplit(carsName);
    
        for (String carName : carsSplit) {
            carsList.add(new Car(carName));
        }
        
        return carsList;
    }
    
    private static String[] getCarsSplit(String carsName) {
        carsName = carsName.replace(" ", "");
        return carsName.split(",");
    }
}
