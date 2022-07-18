package com.jun_hyeok.racing_car.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingCarGameTest {

    private RacingCarGame racingCarGame;
    private Cars cars;

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

    @Test
    @DisplayName("우승자 뽑기")
    void find_winner(){
        List<Car> carList = getCars("jun, fobi, dong");
        Car jun = carList.get(0);
        cars.moveOrStop(jun, 4);
        cars.moveOrStop(jun, 4);
        Car fobi = carList.get(1);
        cars.moveOrStop(fobi, 4);
        cars.moveOrStop(fobi, 4);
        Car dong = carList.get(2);
        cars.moveOrStop(dong, 4);
        cars.moveOrStop(dong, 3);

        List<Car> winners  = racingCarGame.findWinner();
        assertThat(winners).containsExactly(jun, fobi);
    }

    private List<Car> getCars(String carsName) {
        racingCarGame.createCar(carsName);
        cars = (Cars) getPrivateField(racingCarGame, "cars");
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
