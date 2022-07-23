package com.jun_hyeok.racing_game.controller;

import com.jun_hyeok.racing_game.domain.RacingGame;
import com.jun_hyeok.racing_game.input.InputView;

public class RacingMain {
    private void run() {
        String carsNameStr = InputView.getInput();
        int tryNum = InputView.getInt();
        
        RacingGame racingGame = new RacingGame(carsNameStr, tryNum);
        while (!racingGame.isEnd()) {
        
        }
    }
    
    public static void main(String[] args) {
        RacingMain racingMain = new RacingMain();
        racingMain.run();
    }
}
