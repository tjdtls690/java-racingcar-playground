package com.jun_hyeok.string_calculator.domain;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringCalculator {

    public static final String ERROR_MESSAGE_NEGATIVE = "음수는 입력할 수 없습니다.";

    public int splitAndSum(String input) throws RuntimeException {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        input = input.replace(" ", "");
        if (input.length() == 1) {
            return Integer.parseInt(input);
        }

        return getSum(input);
    }

    private int getSum(String input) throws RuntimeException {
        Matcher m = Pattern.compile("//(.)\\\\n(.*)").matcher(input);
        if (m.find()) {
            return getSumAssistant2(input);
        }

        return getSumAssistant1(input);
    }

    private int getSumAssistant2(String input) throws RuntimeException {
        int idx = input.indexOf("\\n");
        List<Integer> integerList = getIntegerList(input, idx);
        return add(integerList);
    }

    private int getSumAssistant1(String input) throws RuntimeException {
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

    private int add(List<Integer> integerList) throws RuntimeException {
        int sum = 0;
        for (int num : integerList) {
            isNegative(num);
            sum += num;
        }
        return sum;
    }

    private void isNegative(int num) {
        if (num < 0) {
            throw new RuntimeException(ERROR_MESSAGE_NEGATIVE);
        }
    }

    private List<Integer> stringListToIntegerList(List<String> strings) {
        return strings.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

}
