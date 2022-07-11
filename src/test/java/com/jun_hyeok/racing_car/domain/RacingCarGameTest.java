package com.jun_hyeok.racing_car.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

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
        racingCarGame.createCars("jun");
        List<Car> cars = (List<Car>) privateValueGet("carList");
        assertThat(cars.size()).isEqualTo(1);

    }

    @Test
    @DisplayName("Car 객체 여러개 생성")
    void multi_car(){
        racingCarGame.createCars("jun, fobi, dong");
        List<Car> cars = (List<Car>) privateValueGet("carList");
        assertThat(cars.size()).isEqualTo(3);

    }

    @Test
    @DisplayName("이름 5자 초과 시 에러 검증")
    void nameVerification(){
        assertThatThrownBy(() -> racingCarGame.createCars("jun, fobi, dongUk"))
                .isInstanceOf(RuntimeException.class)
                .hasMessage("이름은 5자를 초과할 수 없습니다.");
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

    @Test
    @DisplayName("우승자 선정 한명")
    void one_winner(){
        Car jun = new Car("jun");
        Car fobi = new Car("fobi");
        Car dong = new Car("dong");
        racingCarGame.stopIfNotMove(jun, 4);
        racingCarGame.stopIfNotMove(jun, 6);
        racingCarGame.stopIfNotMove(fobi, 4);
        racingCarGame.stopIfNotMove(dong, 3);
        String winner = racingCarGame.winnerDetermination(Arrays.asList(jun, fobi, dong));
        assertThat(winner).isEqualTo("jun");
    }

    @Test
    @DisplayName("우승자 선정 여러명")
    void multi_winner(){
        Car jun = new Car("jun");
        Car fobi = new Car("fobi");
        Car dong = new Car("dong");
        racingCarGame.stopIfNotMove(jun, 4);
        racingCarGame.stopIfNotMove(jun, 6);
        racingCarGame.stopIfNotMove(fobi, 4);
        racingCarGame.stopIfNotMove(fobi, 9);
        racingCarGame.stopIfNotMove(dong, 3);
        String winner = racingCarGame.winnerDetermination(Arrays.asList(jun, fobi, dong));
        assertThat(winner).isEqualTo("jun, fobi");
    }
}
