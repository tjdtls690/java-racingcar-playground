package com.jun_hyeok.string_calculator.input;

import com.jun_hyeok.string_calculator.domain.InputManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {
    private final BufferedReader br;


    public InputView() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public String getString() throws RuntimeException{
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
