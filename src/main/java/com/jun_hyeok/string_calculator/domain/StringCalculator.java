package com.jun_hyeok.string_calculator.domain;

public class StringCalculator {

    public int splitAndSum(String input) {
        if(input == null || input.isEmpty()){
            return 0;
        }

        return Integer.parseInt(input);
    }
}
