package com.jun_hyeok.racing_car.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    private Car car;
    private RacingCarGame racingCarGame;

    @BeforeEach
    void setUp() {
        car = new Car("jun");
        racingCarGame = new RacingCarGame();
    }

    @Test
    @DisplayName("한 번 움직인 상태일 때 표시")
    void current_situation_one(){
        racingCarGame.stopIfNotMove(car, 4);
        String currentSituation = car.getCurrentSituation();
        assertThat(currentSituation).isEqualTo("-");
    }

    @Test
    @DisplayName("여러번 움직인 상태일 때 표시")
    void current_situation_multi(){
        racingCarGame.stopIfNotMove(car, 4);
        racingCarGame.stopIfNotMove(car, 3);
        racingCarGame.stopIfNotMove(car, 8);
        racingCarGame.stopIfNotMove(car, 2);
        racingCarGame.stopIfNotMove(car, 9);
        String currentSituation = car.getCurrentSituation();
        assertThat(currentSituation).isEqualTo("---");
    }

    @Test
    @DisplayName("한 번도 안움직였을 시 표시")
    void current_situation_empty(){
        racingCarGame.stopIfNotMove(car, 3);
        racingCarGame.stopIfNotMove(car, 2);
        racingCarGame.stopIfNotMove(car, 1);
        racingCarGame.stopIfNotMove(car, 2);
        racingCarGame.stopIfNotMove(car, 3);
        String currentSituation = car.getCurrentSituation();
        assertThat(currentSituation).isEqualTo("");
    }
}
