package com.jun_hyeok.racing_car.output;

import com.jun_hyeok.racing_car.domain.Car;

import java.util.List;

public class ResultView {
    public void printProcess(List<Car> carsList) {
        for (Car car : carsList) {
            System.out.print(car.getName());
            System.out.print(" : ");
            printPositionProcess(car);
        }
        System.out.println();
    }
    
    private void printPositionProcess(Car car) {
        int position = car.getPosition().getPosition();
        for(int i = 0; i < position; i++){
            System.out.print("-");
        }
        System.out.println();
    }
}
