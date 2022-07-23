package com.jun_hyeok.racing_game.output;

import com.jun_hyeok.racing_game.domain.Car;

import java.util.List;

public class ResultView {
    
    public static void printProcess(List<Car> cars) {
        for (Car car : cars) {
            System.out.print(car.getName().getName() + " : ");
            positionPrint(car);
        }
        System.out.println();
    }
    
    private static void positionPrint(Car car) {
        int position = car.getPosition().getPosition();
        for (int i = 0; i < position; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
    
    public static void printWinners(List<Car> winners) {
        StringBuilder winnersStr = new StringBuilder(winners.get(0).getName().getName());
        for(int i = 1; i < winners.size(); i++){
            winnersStr.append(", ").append(winners.get(i).getName().getName());
        }
        System.out.println(winnersStr + "가 최종 우승했습니다.");
    }
}
