package com.jun_hyeok.racing_car.controller;

import com.jun_hyeok.racing_car.domain.Car;
import com.jun_hyeok.racing_car.domain.RacingCarGame;
import com.jun_hyeok.racing_car.view.InputView;

import java.util.List;

public class RacingCarMain {
    private final InputView inputView;
    private final RacingCarGame racingCarGame;

    public RacingCarMain() {
        inputView = new InputView();
        racingCarGame = new RacingCarGame();
    }

    public void play() {
        inputView.nameInputPrint();
        String input = inputView.getInput();
        racingCarGame.createCars(input); // 예외

        inputView.tryNumInputMessage();
        int tryNum = inputView.getTryNumInput();
    }
}
