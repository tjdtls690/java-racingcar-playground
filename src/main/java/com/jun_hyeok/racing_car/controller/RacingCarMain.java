package com.jun_hyeok.racing_car.controller;

import com.jun_hyeok.racing_car.input.InputView;

public class RacingCarMain {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        String carsName = inputView.getInput();
        System.out.println(carsName);
        
        int tryNum = inputView.getTryNum();
        System.out.println(tryNum);
    }
}
