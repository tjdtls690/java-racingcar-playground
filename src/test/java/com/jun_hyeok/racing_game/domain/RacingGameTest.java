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
        RacingGame racingGame = new RacingGame("jun");
        List<Car> carsList = (List<Car>) getPrivateVal(racingGame, "carsList");
        assertThat(carsList.size()).isEqualTo(1);
    }
    
    @Test
    @DisplayName("자동차 생성 (여러대)")
    void create_car_multi() {
        RacingGame racingGame = new RacingGame("jun, chul, young");
        List<Car> carsList = (List<Car>) getPrivateVal(racingGame, "carsList");
        assertThat(carsList.size()).isEqualTo(3);
    }
    
    private Object getPrivateVal(Object object, String fieldName) {
        try {
            Field field = object.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            return field.get(object);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
