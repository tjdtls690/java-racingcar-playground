package com.jun_hyeok.racing_game.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> carsList;
    
    public Cars(List<Car> carsList) {
        this.carsList = carsList;
    }
    
    public void move() {
        for (Car car : carsList) {
            car.move(new RandomMovingSelect());
        }
    }
    
    public List<Car> findWinners() {
        return getWinners(getMxPosition());
    }
    
    private List<Car> getWinners(Position mxPosition) {
        List<Car> winners = new ArrayList<>();
        
        for (Car car : carsList) {
            winnerAdd(mxPosition, winners, car);
        }
        
        return winners;
    }
    
    private void winnerAdd(Position mxPosition, List<Car> winners, Car car) {
        if (car.isWinner(mxPosition)) {
            winners.add(car);
        }
    }
    
    private Position getMxPosition() {
        Position mxPosition = new Position(0);
        
        for (Car car : carsList) {
            car.isMxPosition(mxPosition);
        }
        return mxPosition;
    }
}
