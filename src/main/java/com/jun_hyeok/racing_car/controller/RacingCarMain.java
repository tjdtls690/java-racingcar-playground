package com.jun_hyeok.racing_car.controller;

import com.jun_hyeok.racing_car.domain.Car;
import com.jun_hyeok.racing_car.domain.RacingCarGame;
import com.jun_hyeok.racing_car.input.InputView;
import com.jun_hyeok.racing_car.output.ResultView;

import java.util.List;

public class RacingCarMain {
    public static void main(String[] args) {
        RacingCarMain racingCarMain = new RacingCarMain();
        racingCarMain.run();
    
    }
    
    private void run() {
        InputView inputView = new InputView();
    
        RacingCarGame racingCarGame = getRacingCarGame(inputView);
    
        int tryNum = inputView.getTryNum();
        
        ResultView resultView = new ResultView();
        for (int i = 0; i < tryNum; i++) {
            racingCarGame.moveCars();
            List<Car> carsList = racingCarGame.getCarsList();
            resultView.printProcess(carsList);
        }
    }
    
    private RacingCarGame getRacingCarGame(InputView inputView) {
        try {
            String carsName = inputView.getInput();
            return new RacingCarGame(carsName);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getRacingCarGame(inputView);
        }
    }
}
