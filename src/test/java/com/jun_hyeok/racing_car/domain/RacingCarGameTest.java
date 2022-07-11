package com.jun_hyeok.racing_car.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingCarGameTest {
    private Car car;
    private RacingCarGame racingCarGame;

    @BeforeEach
    void setUp() {
        car = new Car();
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
}
