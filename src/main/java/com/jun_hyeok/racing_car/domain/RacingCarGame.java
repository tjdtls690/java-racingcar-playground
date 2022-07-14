package com.jun_hyeok.racing_car.domain;

import java.util.ArrayList;
import java.util.List;

public class RacingCarGame {
    private final List<Car> carList;

    public List<Car> getCarList() {
        return carList;
    }

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
        StringBuilder winners = new StringBuilder();
        int mx = getMax(players);
        for(Car player : players){
            winners.append(getWinners(player, mx));
        }
        return winners.substring(0, winners.length() - 2);
    }

    private String getWinners(Car player, int mx) {
        if(player.getPosition() == mx){
            return player.getName() + ", ";
        }
        return "";
    }

    private int getMax(List<Car> players) {
        int mx = 0;
        for(Car player : players){
            mx = Math.max(player.getPosition(), mx);
        }
        return mx;
    }
}
