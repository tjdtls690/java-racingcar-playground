package com.jun_hyeok.racing_game.domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RacingGame {
    private final List<Car> carsList;
    public RacingGame(String carsName) {
        carsList = createCarsList(carsName);
    }
    
    private List<Car> createCarsList(String carsName) {
        return Collections.singletonList(new Car(carsName));
    }
}
