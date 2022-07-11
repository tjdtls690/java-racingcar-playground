package com.jun_hyeok.racing_car.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingCarGameTest {
    private Car car;
    private RacingCarGame racingCarGame;

    @BeforeEach
    void setUp() {
        car = new Car("fobi");
        racingCarGame = new RacingCarGame();
    }

    @Test
    @DisplayName("move 검증")
    void move(){
        racingCarGame.stopIfNotMove(car, 4);
        int position = car.getPosition();
        assertThat(position).isEqualTo(1);
    }

    @Test
    @DisplayName("stop 검증")
    void stop(){
        racingCarGame.stopIfNotMove(car, 3);
        int position = car.getPosition();
        assertThat(position).isEqualTo(0);
    }

    @Test
    @DisplayName("multi move 검증")
    void multi_move(){
        racingCarGame.stopIfNotMove(car, 4);
        racingCarGame.stopIfNotMove(car, 3);
        racingCarGame.stopIfNotMove(car, 1);
        racingCarGame.stopIfNotMove(car, 5);
        racingCarGame.stopIfNotMove(car, 8);
        int position = car.getPosition();
        assertThat(position).isEqualTo(3);
    }

    @Test
    @DisplayName("Car 객체 1개 생성")
    void one_car(){
        racingCarGame.createCar("jun");
        List<Car> cars = (List<Car>) privateValueGet("carList");
        assertThat(cars.size()).isEqualTo(1);

    }

    private Object privateValueGet(String str) {
        try {
            Field field = racingCarGame.getClass().getDeclaredField(str);
            field.setAccessible(true);
            return field.get(racingCarGame);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
            throw new RuntimeException("테스트 코드 에러");
        }
    }
}
