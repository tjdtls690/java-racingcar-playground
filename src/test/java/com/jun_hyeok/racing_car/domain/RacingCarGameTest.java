package com.jun_hyeok.racing_car.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingCarGameTest {

    private RacingCarGame racingCarGame;

    @BeforeEach
    void setUp() {
        racingCarGame = new RacingCarGame();
    }

    @Test
    @DisplayName("차 이름 입력 (1개)")
    void car_input_one() {
        List<Car> carList = getCars("jun");
        assertThat(carList.size()).isEqualTo(1);
    }

    @Test
    @DisplayName("차 이름 입력 (여러개)")
    void car_input_multi() {
        List<Car> carList = getCars("jun, fobi, dong");
        assertThat(carList.size()).isEqualTo(3);
    }

    private List<Car> getCars(String carsName) {
        racingCarGame.createCar(carsName);
        Cars cars = (Cars) getPrivateField(racingCarGame, "cars");
        return (List<Car>) getPrivateField(cars, "carList");
    }

    private Object getPrivateField(Object inputObject, String fieldName) {
        try {
            Field field = inputObject.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            return field.get(inputObject);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
