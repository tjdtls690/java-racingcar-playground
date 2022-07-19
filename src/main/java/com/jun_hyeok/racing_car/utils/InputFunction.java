package com.jun_hyeok.racing_car.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputFunction {
    public static final String NUMBER_FORMAT_ERROR_MESSAGE = "올바른 '숫자'를 입력해 주세요.";
    private final BufferedReader br;

    public InputFunction() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public String getInputString() {
        try {
            return br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int getNum() {
        int num = 0;
        try {
            String str = br.readLine();
            num = Integer.parseInt(str);
        } catch (IOException | NumberFormatException e) {
            System.out.println(NUMBER_FORMAT_ERROR_MESSAGE);
            return getNum();
        }
        return num;
    }
}
