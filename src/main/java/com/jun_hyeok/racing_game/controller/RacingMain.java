package com.jun_hyeok.racing_game.controller;

import com.jun_hyeok.racing_game.input.InputView;

public class RacingMain {
    private final InputView iv;
    
    public RacingMain() {
        iv = new InputView();
    }
    
    private void run() {
        String carsNameStr = iv.getString();
        
    }
    
    public static void main(String[] args) {
        RacingMain racingMain = new RacingMain();
        racingMain.run();
    }
}
