package com.jun_hyeok.racing_game.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {
    public static final String INPUT_CARS_NAME_MESSAGE = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    public static final String NUMBER_FORMAT_ERROR_MESSAGE = "숫자만 입력 가능합니다.";
    public static final String INPUT_TRY_NUMBER_MESSAGE = "시도할 회수는 몇회인가요?";
    private final BufferedReader br;
    
    public InputView() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }
    
    public String getInput() {
        System.out.println(INPUT_CARS_NAME_MESSAGE);
        return getString();
    }
    
    public int getInt() {
        try {
            System.out.println(INPUT_TRY_NUMBER_MESSAGE);
            String inputStr = getString();
            return Integer.parseInt(inputStr);
        } catch (NumberFormatException e) {
            System.out.println(NUMBER_FORMAT_ERROR_MESSAGE);
            return getInt();
        }
    }
    
    private String getString() {
        try {
            return br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
