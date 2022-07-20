package com.jun_hyeok.racing_car.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class RacingCarGameTest {
    
    
    @Test
    @DisplayName("자동차 이름 5자 초과")
    void carNameLengthError() {
        assertThatThrownBy(() -> new RacingCarGame("jun, fobi, dongUk"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("자동차 이름은 5자를 초과할 수 없습니다.");
    }
}
