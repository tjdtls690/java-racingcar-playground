package com.jun_hyeok.string_calculator.domain;

import java.util.List;

public class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int allSumValue(List<Integer> numArr) {
        int sum = 0;
        for (int j : numArr) {
            sum = add(sum, j);
        }
        return sum;
    }
}
