package com.jun_hyeok.string_calculator.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {
    StringCalculator s;

    @BeforeEach
    void setUp() {
        s = new StringCalculator();
    }

    @Test
    @DisplayName("숫자 하나")
    void splitAndSum_num1(){
        int result = s.splitAndSum("2");
        assertThat(result).isEqualTo(2);
    }

    @ParameterizedTest
    @DisplayName("빈 문자열 또는 null")
    @NullAndEmptySource
    void splitAndSum_nullOrEmpty(String inputStr){
        int result = s.splitAndSum(inputStr);
        assertThat(result).isEqualTo(0);
    }

    @ParameterizedTest
    @DisplayName("쉼표 구분자")
    @CsvSource(value = {"2, 5, 10; 17", "100, 5, 10; 115"}, delimiter = ';')
    void splitAndSum_restSeparator(String inputStr, int assertNum){
        int result = s.splitAndSum(inputStr);
        assertEquals(assertNum, result);
    }

    @ParameterizedTest
    @DisplayName("쉼표 또는 콜론 구분자")
    @CsvSource(value = {"2, 5: 10; 17", "100, 5: 10; 115"}, delimiter = ';')
    void splitAndSum_restOrColonSeparator(String inputStr, int assertNum){
        int result = s.splitAndSum(inputStr);
        assertEquals(assertNum, result);
    }
}
