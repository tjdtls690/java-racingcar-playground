package com.jun_hyeok.string_calculator.domain;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
        Matcher m = Pattern.compile("//(.)\\\\n(.*)").matcher(input);
        if(m.find()){
            return getSumAssistant2(input);
        }

        return getSumAssistant1(input);
    }

    private int getSumAssistant2(String input) {
        int idx = input.indexOf("\\n");
        List<Integer> integerList = getIntegerList(input, idx);
        return add(integerList);
    }

    private int getSumAssistant1(String input) {
        List<Integer> integerList = getIntegerList(input);
        return add(integerList);
    }

    private List<Integer> getIntegerList(String input, int idx) {
        String delim = input.substring(2, idx);
        input = input.substring(idx + 2);
        String[] split = input.split("[" + delim + "]");
        List<String> strings = Arrays.asList(split);
        return stringListToIntegerList(strings);
    }

    private List<Integer> getIntegerList(String input) {
        String[] split = input.split("[,:]");
        List<String> strings = Arrays.asList(split);
        return stringListToIntegerList(strings);
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
