package com.jun_hyeok.string_calculator.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {


    @ParameterizedTest
    @DisplayName("두 숫자를 더한 값을 반환")
    @CsvSource({"3, 4, 7, true", "9, 5, 14, true", "3, 6, 9, true", "3, 6, 8, false", "3, 4, 8, false", "9, 5, 13, false"})
    void add(int num1, int num2, int assertNum, boolean assertCheck) {
        Calculator calculator = new Calculator();
        assertEquals(calculator.add(num1, num2) == assertNum, assertCheck);
    }
}
