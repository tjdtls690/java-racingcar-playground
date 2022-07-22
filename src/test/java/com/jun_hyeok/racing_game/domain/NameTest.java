package com.jun_hyeok.racing_game.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class NameTest {
    
    @Test
    @DisplayName("차 이름 5자 초과")
    void car_name_length_error() {
        assertThatThrownBy(() -> new Name("hunHyeok"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("차 이름은 5자를 초과할 수 없습니다.");
    }
    
    @ParameterizedTest
    @DisplayName("차 이름 null 또는 공백")
    @NullAndEmptySource
    void car_name_null_or_empty(String carName) {
        assertThatThrownBy(() -> new Name(carName))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("차 이름은 null 또는 공백이 될 수 없습니다.");
    }
}