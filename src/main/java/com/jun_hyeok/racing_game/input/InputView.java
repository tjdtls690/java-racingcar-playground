package com.jun_hyeok.racing_game.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {
    private final BufferedReader br;
    
    public InputView() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }
    
    public String getString() {
        try {
            return br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
