package com.jun_hyeok.racing_car.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {
    public static final String CAR_NAME_INPUT_MESSAGE = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    public static final String TRY_NUM_INPUT_MESSAGE = "시도할 회수는 몇회인가요?";
    public static final String ERROR_MESSAGE = "다시 입력해주세요.";
    private final BufferedReader br;

    public InputView() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public void nameInputPrint(){
        System.out.println(CAR_NAME_INPUT_MESSAGE);
    }

    public void tryNumInputMessage(){
        System.out.println(TRY_NUM_INPUT_MESSAGE);
    }

    public String getInput() {
        try {
            return br.readLine();
        } catch (IOException e) {
            System.out.println(ERROR_MESSAGE);
            return getInput();
        }
    }


    public int getTryNumInput() {
        return 0;
    }
}
