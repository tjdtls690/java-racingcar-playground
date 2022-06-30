package com.jun_hyeok.string_calculator.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringCalculator {

    public int splitAndSum(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        input = input.replace(" ", "");
        if (input.length() == 1) {
            return Integer.parseInt(input);
        }

        return getSum(input);
    }

    private int getSum(String input) {
        String[] split = input.split(",");
        List<String> strings = Arrays.asList(split);
        List<Integer> integerList = stringListToIntegerList(strings);
        return add(integerList);
    }

    private int add(List<Integer> integerList) {
        int sum = 0;
        for(int num : integerList){
            sum += num;
        }
        return sum;
    }

    private List<Integer> stringListToIntegerList(List<String> strings) {
        return strings.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

}
