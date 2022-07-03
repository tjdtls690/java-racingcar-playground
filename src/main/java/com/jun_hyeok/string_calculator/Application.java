package com.jun_hyeok.string_calculator;

import com.jun_hyeok.string_calculator.domain.StringCalculator;
import com.jun_hyeok.string_calculator.input.Input;
import com.jun_hyeok.string_calculator.output.ResultView;

public class Application {
    public static void main(String[] args) {
        int resultNum = getResultNum();

        resultPrint(resultNum);
    }

    private static int getResultNum() {
        String inputStr = getInputStr();

        try {
            return getResultNum(inputStr);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            return getResultNum();
        }
    }

    private static void resultPrint(int resultNum) {
        ResultView resultView = new ResultView();
        resultView.resultPrint(resultNum);
    }

    private static int getResultNum(String inputStr) {
        StringCalculator stringCalculator = new StringCalculator();
        return stringCalculator.splitAndSum(inputStr);
    }

    private static String getInputStr() {
        Input input = new Input();
        return input.input();
    }
}
