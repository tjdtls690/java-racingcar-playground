package com.jun_hyeok.string_calculator.input;

import com.jun_hyeok.string_calculator.domain.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InputViewTest {
    private InputView inputView;
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        inputView = new InputView();
        calculator = new Calculator();
    }

    @ParameterizedTest
    @DisplayName("List<String> 을 List<Integer> 로 변환되는지 더하기 기능으로 검증")
    @MethodSource("stringListToIntegerListParameter")
    void stringListToIntegerList(List<String> strList, int assertNum, boolean assertCheck) {
        List<Integer> numList = inputView.convertStringToInteger(strList);
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
