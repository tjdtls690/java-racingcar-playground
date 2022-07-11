package com.jun_hyeok.racing_car.domain;

import java.util.ArrayList;
import java.util.List;

public class RacingCarGame {
    private final List<Car> carList;

    public RacingCarGame() {
        carList = new ArrayList<>();
    }

    public void stopIfNotMove(Car car, int ranNum) {
        if (ranNum > 3) {
            car.move();
        }
    }

    public void createCars(String players) throws RuntimeException {
        players = players.replace(" ", "");
        String[] split = players.split(",");
        for(String player : split){
            Car playerCar = new Car(player);
            carList.add(playerCar);
        }
    }

    public String winnerDetermination(List<Car> players) {
        String winners = "";
        int mx = 0;
        for(Car player : players){
            winners = getWinners(player, mx, winners);
            mx = getMaxNum(player, mx);
        }
        return winners;
    }

    private int getMaxNum(Car player, int mx) {
        if(player.getPosition() > mx){
            return player.getPosition();
        }
        return mx;
    }

    private String getWinners(Car player, int mx, String winners) {
        if(player.getPosition() > mx){
            return player.getName();
        }
        return winners;
    }
}
