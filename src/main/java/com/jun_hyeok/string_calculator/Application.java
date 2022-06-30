package com.jun_hyeok.string_calculator;

import com.jun_hyeok.string_calculator.domain.Calculator;
import com.jun_hyeok.string_calculator.domain.InputManagement;
import com.jun_hyeok.string_calculator.input.InputView;
import com.jun_hyeok.string_calculator.output.ResultView;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Application application = new Application();
        application.run();
    }

    private void run() {
        boolean checkCorrectInput = false;
        while(!checkCorrectInput){
            checkCorrectInput = isCorrectInput();
        }
    }

    private boolean isCorrectInput() {
        try {
            String inputStr = getInputStr();
            List<Integer> integerList = getIntegerList(inputStr);
            finalResultPrint(integerList);
            return true;
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    private void finalResultPrint(List<Integer> integerList) throws RuntimeException{
        int resultNum = getResultNum(integerList);
        ResultView resultView = new ResultView();
        resultView.resultPrint(resultNum);
    }

    private int getResultNum(List<Integer> integerList) throws RuntimeException{
        Calculator calculator = new Calculator();
        return calculator.allSumValue(integerList);
    }

    private List<Integer> getIntegerList(String inputStr) throws RuntimeException{
        InputManagement inputManagement = new InputManagement();
        List<String> stringList = inputManagement.getStringList(inputStr);
        return inputManagement.convertStringToInteger(stringList);
    }

    private String getInputStr() {
        InputView inputView = new InputView();
        return inputView.getString();
    }
}
