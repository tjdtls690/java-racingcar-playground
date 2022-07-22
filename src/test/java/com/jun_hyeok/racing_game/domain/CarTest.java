package com.jun_hyeok.racing_game.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    
    private Car car;
    
    @BeforeEach
    void setUp() {
        car = new Car("jun");
    }
    
    @Test
    @DisplayName("이동")
    void move() {
        car.move(() -> true);
        assertThat(car.getPosition()).isEqualTo(new Position(1));
    }
    
    @Test
    @DisplayName("정지")
    void stop() {
        car.move(() -> false);
        assertThat(car.getPosition()).isEqualTo(new Position(0));
    }
}