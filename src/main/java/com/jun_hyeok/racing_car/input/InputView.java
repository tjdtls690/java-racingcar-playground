package com.jun_hyeok.racing_car.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {
    public static final String CARS_NAME_INPUT_MESSAGE = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    private final BufferedReader br;
    
    public InputView() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }
    
    public String getCarsName() {
        try {
            System.out.println(CARS_NAME_INPUT_MESSAGE);
            return br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
