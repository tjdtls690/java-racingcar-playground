package com.jun_hyeok.string_calculator.domain;

import org.assertj.core.util.Streams;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @DisplayName("두 숫자를 더한 값을 반환")
    @CsvSource({"3, 4, 7, true", "9, 5, 14, true", "3, 6, 9, true", "3, 6, 8, false", "3, 4, 8, false", "9, 5, 13, false"})
    void add(int num1, int num2, int assertNum, boolean assertCheck) {
        assertEquals(calculator.add(num1, num2) == assertNum, assertCheck);
    }

    @ParameterizedTest
    @DisplayName("모든 숫자를 더한 값을 반환")
    @MethodSource("allSumValueParameter")
    void allSumValue(List<Integer> numArr, int assertNum, boolean assertCheck) {
        assertEquals(calculator.allSumValue(numArr) == assertNum, assertCheck);
    }

    public static Stream<Arguments> allSumValueParameter() {
        return Stream.of(
                Arguments.of(Arrays.asList(3, 4, 7), 14, true),
                Arguments.of(Arrays.asList(9, 5, 14), 28, true),
                Arguments.of(Arrays.asList(3, 6, 9), 18, true),
                Arguments.of(Arrays.asList(3, 6, 8), 18, false),
                Arguments.of(Arrays.asList(3, 4, 8), 14, false),
                Arguments.of(Arrays.asList(9, 5, 13), 28, false)
        );
    }
}
