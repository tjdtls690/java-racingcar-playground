package com.jun_hyeok.string_calculator.input;

import jdk.internal.joptsimple.internal.Strings;
import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class InputView {
    private final BufferedReader br;

    public InputView() {
        br = new BufferedReader(new InputStreamReader((System.in)));
    }


    public List<Integer> convertStringToInteger(List<String> input) throws RuntimeException {
        try {
            return input.stream()
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        } catch (NumberFormatException e) {
            throw new RuntimeException("숫자 및 구분자를 올바르게 입력해주세요.");
        }
    }

    public List<String> getStringList(String input) {
        if (StringUtils.containsAny(input, "//", "\\n")) {
            String[] split = getSplit(input);
            return Arrays.asList(split);
        }
        String[] split = input.split("[,:]");
        return Arrays.asList(split);
    }

    private String[] getSplit(String input) {
        int idx = input.indexOf("\\n");
        String delim = input.substring(2, idx);
        input = input.substring(idx + 2);
        return input.split(delim);
    }
}
