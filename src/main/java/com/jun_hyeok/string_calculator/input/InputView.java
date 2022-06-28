package com.jun_hyeok.string_calculator.input;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {
    public List<Integer> convertStringToInteger(List<String> input) {
        return input.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
