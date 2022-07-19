package com.jun_hyeok.racing_car.input;

public class InputView {


    public static final String INPUT_CARS_MESSAGE = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    public static final String TRY_NUM_MESSAGE = "시도할 회수는 몇회인가요?";

    public void inputCarsPrint(){
        System.out.println(INPUT_CARS_MESSAGE);
    }

    public void tryNumInputPrint(){
        System.out.println(TRY_NUM_MESSAGE);
    }
}
