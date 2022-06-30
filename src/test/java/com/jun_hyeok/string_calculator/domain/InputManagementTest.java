package com.jun_hyeok.string_calculator.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InputManagementTest {
    private InputManagement inputManagement;
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        inputManagement = new InputManagement();
        calculator = new Calculator();
    }

    @Test
    @DisplayName("음수일때 RuntimeException 발생 검증")
    void NegativeNumber(){
        List<String> strList = inputManagement.getStringList("1, -3, 9");
        List<Integer> numList = inputManagement.convertStringToInteger(strList);
        assertThatThrownBy(() -> {
            calculator.allSumValue(numList);
        }).isInstanceOf(RuntimeException.class);
    }

    @ParameterizedTest
    @DisplayName("null 또는 \"\" 를 입력 시 0반환 검증")
    @NullSource
    @EmptySource
    void null_or_space(String input) {
        List<String> strList = inputManagement.getStringList(input);
        List<Integer> numList = inputManagement.convertStringToInteger(strList);
        int sum = calculator.allSumValue(numList);
        assertEquals(0, sum);
    }

    @ParameterizedTest
    @DisplayName("숫자 하나만 입력했을 때 숫자 하나가 잘 나오는지 검증")
    @CsvSource({"1, 1", "5, 5", "7, 7", "10, 10", "15, 15", "100, 100", "1522, 1522", "123, 123", "5344, 5344"})
    void one_number(String input, int assertNum) {
        List<String> strList = inputManagement.getStringList(input);
        List<Integer> numList = inputManagement.convertStringToInteger(strList);
        int sum = calculator.allSumValue(numList);
        assertEquals(sum, assertNum);
    }

    @ParameterizedTest
    @DisplayName("문자열이 커스텀 구분자를 기준으로 잘 분리되는지 검증")
    @CsvSource(value = {"//n\\n1n3n9; 13; true", "//c\\n9c5c9; 23; true", "//.\\n2.3.1.6; 12; true"}, delimiter = ';')
    void divideStringCustomDelim(String input, int assertNum, boolean assertCheck) {
        List<String> strList = inputManagement.getStringList(input);
        List<Integer> numList = inputManagement.convertStringToInteger(strList);
        int sum = calculator.allSumValue(numList);
        assertEquals(sum == assertNum, assertCheck);
    }

    @ParameterizedTest
    @DisplayName("문자열이 기본 구분자[(,), (:)]를 기준으로 잘 분리되는지 검증")
    @CsvSource(value = {"1, 3: 9;13;true", "9, 5: 9; 23; true", "2, 3: 1,6; 12; true", "2,4; 7; false"}, delimiter = ';')
    void divideString(String input, int assertNum, boolean assertCheck) {
        List<String> strList = inputManagement.getStringList(input);
        List<Integer> numList = inputManagement.convertStringToInteger(strList);
        int sum = calculator.allSumValue(numList);
        assertEquals(sum == assertNum, assertCheck);
    }

    @ParameterizedTest
    @DisplayName("List<String> 을 List<Integer> 로 변환되는지 더하기 기능으로 검증")
    @MethodSource("stringListToIntegerListParameter")
    void stringListToIntegerList(List<String> strList, int assertNum, boolean assertCheck) {
        List<Integer> numList = inputManagement.convertStringToInteger(strList);
        int sum = calculator.allSumValue(numList);
        assertEquals(sum == assertNum, assertCheck);
    }

    public static Stream<Arguments> stringListToIntegerListParameter() {
        return Stream.of(
                Arguments.of(Arrays.asList("1", "3", "5"), 9, true),
                Arguments.of(Arrays.asList("9", "5", "9"), 23, true),
                Arguments.of(Arrays.asList("14", "1", "0"), 15, true),
                Arguments.of(Arrays.asList("0", "1", "4"), 5, true),
                Arguments.of(Arrays.asList("0", "1", "4"), 4, false),
                Arguments.of(Arrays.asList("100", "250", "300"), 651, false)
        );
    }
}
