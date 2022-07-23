package com.jun_hyeok.racing_game.input;

import com.jun_hyeok.racing_game.utils.UtilsFunctions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {
    public static final String INPUT_CARS_NAME_MESSAGE = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    public static final String NUMBER_FORMAT_ERROR_MESSAGE = "숫자만 입력 가능합니다.";
    public static final String INPUT_TRY_NUMBER_MESSAGE = "시도할 회수는 몇회인가요?";
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static String getInput() {
        System.out.println(INPUT_CARS_NAME_MESSAGE);
        String input = getString();
        try {
            isCorrectCarsName(input);
            return input;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getInput();
        }
    }
    
    private static void isCorrectCarsName(String input) throws IllegalArgumentException {
        String[] split = getSplit(input);
        for (String name : split) {
            UtilsFunctions.isCorrectName(name);
        }
    }
    
    private static String[] getSplit(String input) {
        input = input.replace(" ", "");
        String[] split = input.split(",");
        return split;
    }
    
    public static int getInt() {
        try {
            System.out.println(INPUT_TRY_NUMBER_MESSAGE);
            String inputStr = getString();
            return Integer.parseInt(inputStr);
        } catch (NumberFormatException e) {
            System.out.println(NUMBER_FORMAT_ERROR_MESSAGE);
            return getInt();
        }
    }
    
    private static String getString() {
        try {
            return br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
