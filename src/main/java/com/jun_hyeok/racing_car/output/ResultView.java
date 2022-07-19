package com.jun_hyeok.racing_car.output;

import com.jun_hyeok.racing_car.domain.Car;

import java.util.List;

public class ResultView {

    public void processPrint(Car car) {
        car.namePrint();
        System.out.print(" : ");
        car.positionPrint();
        System.out.println();
    }

    public void winnersPrint(List<Car> winner) {
        winner.get(0).namePrint();
        for (int i = 1; i < winner.size(); i++) {
            System.out.print(", ");
            winner.get(i).namePrint();
        }
        System.out.println("가 최종 우승했습니다.");
    }
}
