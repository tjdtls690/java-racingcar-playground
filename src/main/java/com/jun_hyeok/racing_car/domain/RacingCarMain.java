package com.jun_hyeok.racing_car.domain;

import com.jun_hyeok.racing_car.input.InputView;
import com.jun_hyeok.racing_car.output.ResultView;
import com.jun_hyeok.racing_car.utils.InputFunction;

import java.util.List;

public class RacingCarMain {

    private final RacingCarGame racingCarGame;

    public RacingCarMain() {
        racingCarGame = new RacingCarGame();
    }

    private void run() {
        playGame();
        winnerPrint();
    }

    private void winnerPrint() {
        List<Car> winner = racingCarGame.findWinner();
        ResultView resultView = new ResultView();
        resultView.winnersPrint(winner);
    }

    private void playGame() {
        InputView inputView = new InputView();
        InputFunction inputFunction = new InputFunction();

        correctCreateCars(inputView, inputFunction);

        int tryNum = getTryNum(inputView, inputFunction);
        move(tryNum);
    }

    private void move(int tryNum) {
        System.out.println("실행 결과");
        for(int i = 0; i < tryNum; i++){
            racingCarGame.play();
            System.out.println();
        }
    }

    private int getTryNum(InputView inputView, InputFunction inputFunction) {
        inputView.tryNumInputPrint();
        return inputFunction.getNum();
    }

    private void correctCreateCars(InputView inputView, InputFunction inputFunction) {
        boolean isCorrectCarName = false;
        while(!isCorrectCarName) {
            String carsName = getString(inputView, inputFunction);
            isCorrectCarName = createCars(carsName);
        }
    }

    private boolean createCars(String carsName) {
        try {
            racingCarGame.createCar(carsName); // 예외 처리 : 이름 5자 초과 시, 공백 입력 시
            return true;
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    private String getString(InputView inputView, InputFunction inputFunction) {
        inputView.inputCarsPrint();
        return inputFunction.getInputString();
    }

    public static void main(String[] args) {
        RacingCarMain racingCarMain = new RacingCarMain();
        racingCarMain.run();
    }
}
