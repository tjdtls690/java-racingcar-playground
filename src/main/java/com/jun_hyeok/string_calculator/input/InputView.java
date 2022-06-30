package com.jun_hyeok.string_calculator.input;

import com.jun_hyeok.string_calculator.domain.InputManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {
    public static final String INPUT_MESSAGE = "숫자와 구분자를 입력해주세요.";
    private final BufferedReader br;


    public InputView() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public String getString() throws RuntimeException{
        String str = "";
        try {
            System.out.println(INPUT_MESSAGE);
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
