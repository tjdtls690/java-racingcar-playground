package com.jun_hyeok.racing_game.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {
    
    @Test
    @DisplayName("자동차 생성 (1대)")
    void create_car_one() {
        List<Car> carsList = RacingGame.createCarsList("jun");
        assertThat(carsList.size()).isEqualTo(1);
    }
    
    @Test
    @DisplayName("자동차 생성 (여러대)")
    void create_car_multi() {
        List<Car> carsList = RacingGame.createCarsList("jun, chul, young");
        assertThat(carsList.size()).isEqualTo(3);
    }
}
