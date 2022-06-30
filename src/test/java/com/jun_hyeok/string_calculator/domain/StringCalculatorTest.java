package com.jun_hyeok.string_calculator.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {
    StringCalculator s;

    @BeforeEach
    void setUp() {
        s = new StringCalculator();
    }

    @Test
    @DisplayName("숫자 하나")
    void num1(){
        int result = s.splitAndSum("2");
        assertThat(result).isEqualTo(2);
    }
}
