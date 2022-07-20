package com.jun_hyeok.racing_car.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
        assertEquals(car.getPosition().getPosition(), 1);
    }

    @Test
    @DisplayName("정지")
    void stop() {
        car.move(() -> false);
        assertEquals(car.getPosition().getPosition(), 0);
    }
}