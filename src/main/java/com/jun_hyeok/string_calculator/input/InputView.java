package com.jun_hyeok.string_calculator.input;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {
    private final BufferedReader br;

    public InputView() {
        br = new BufferedReader(new InputStreamReader((System.in)));
    }



    public List<Integer> convertStringToInteger(List<String> input) throws RuntimeException{
        try {
            return input.stream()
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        }catch (NumberFormatException e){
            throw new RuntimeException("숫자 및 구분자를 올바르게 입력해주세요.");
        }
    }

    public List<String> getStringList(String input) {
        String[] split = input.split("[,:]");
        return Arrays.asList(split);
    }
}
