package com.jun_hyeok.racing_car.domain;

import com.jun_hyeok.racing_car.input.InputView;
import com.jun_hyeok.racing_car.utils.InputFunction;

import java.util.List;

public class RacingCarMain {

    private final RacingCarGame racingCarGame;

    public RacingCarMain() {
        racingCarGame = new RacingCarGame();
    }

    private void run() {
        InputView inputView = new InputView();
        inputView.inputCarsPrint();
        InputFunction inputFunction = new InputFunction();
        String carsName = inputFunction.getInputString();
    }

    public static void main(String[] args) {
        RacingCarMain racingCarMain = new RacingCarMain();
        racingCarMain.run();
    }
}
