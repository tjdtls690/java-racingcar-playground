package com.jun_hyeok.string_calculator.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    public static final String INPUT_MESSAGE = "문자열을 입력해 주세요.";
    public static final String ERROR_INPUT_MESSAGE = "문자열을 다시 입력해 주세요.";
    private final BufferedReader br;

    public Input() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public String input() {
        System.out.println(INPUT_MESSAGE);
        try{
            return br.readLine();
        } catch (IOException e) {
            System.out.println(ERROR_INPUT_MESSAGE);
            return input();
        }
    }
}
