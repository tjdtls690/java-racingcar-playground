package com.jun_hyeok.string_calculator.domain;

import java.util.List;

public class Calculator {

    public static final String ERROR_MESSAGE_NOT_NAGATIVE_NUMBER = "음수는 입력할 수 없습니다.";

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int allSumValue(List<Integer> numArr) throws RuntimeException{
        int sum = 0;
        for (int j : numArr) {
            isNegativeNumVerification(j);
            sum = add(sum, j);
        }
        return sum;
    }

    private void isNegativeNumVerification(int j) throws RuntimeException{
        if(j < 0){
            throw new RuntimeException(ERROR_MESSAGE_NOT_NAGATIVE_NUMBER);
        }
    }
}
