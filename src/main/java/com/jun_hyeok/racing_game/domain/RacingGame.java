package com.jun_hyeok.racing_game.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RacingGame {
    private final List<Car> carsList;
    
    public RacingGame(String carsName) {
        carsList = createCarsList(carsName);
    }
    
    private List<Car> createCarsList(String carsName) {
        List<Car> carsList = new ArrayList<>();
        
        carsName = carsName.replace(" ", "");
        String[] carsSplit = carsName.split(",");
        
        for (String carName : carsSplit) {
            carsList.add(new Car(carName));
        }
        
        return carsList;
    }
}
