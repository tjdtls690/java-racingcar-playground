package com.jun_hyeok.string_calculator.domain;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class InputManagement {

    public static final String ERROR_MESSAGE_NUMBER_FORMAT = "숫자 및 구분자를 올바르게 입력해주세요.";

    public List<Integer> convertStringToInteger(List<String> input) throws RuntimeException {
        try {
            return input.stream()
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        } catch (NumberFormatException e) {
            throw new RuntimeException(ERROR_MESSAGE_NUMBER_FORMAT);
        }
    }

    public List<String> getStringList(String input) {
        if (input == null || input.isEmpty()) {
            return Collections.emptyList();
        }
        input = input.replace(" ", "");
        Matcher matcher = Pattern.compile("//(.*)\n(.*)").matcher(input);
        if (matcher.find()) {
            return getStrings(matcher);
        }
        return getStrings(input);
    }

    private List<String> getStrings(String input) {
        String[] split = input.split("[,:]");
        return Arrays.asList(split);
    }

    private List<String> getStrings(Matcher matcher) {
        String[] split = getSplit(matcher);
        return Arrays.asList(split);
    }

    private String[] getSplit(Matcher matcher) {
        String delim = matcher.group(1);
        String input = matcher.group(2);
        return input.split("[" + delim + "]");
    }
}
