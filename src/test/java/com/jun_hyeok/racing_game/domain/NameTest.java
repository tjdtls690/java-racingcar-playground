package com.jun_hyeok.racing_game.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
}