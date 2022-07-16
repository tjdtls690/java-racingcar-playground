package com.jun_hyeok.racing_car.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CarsTest {


    private Cars cars;
    private Car jun;

    @BeforeEach
    void setUp() {
        cars = new Cars("jun, fobi, dong");
        List<Car> carList = (List<Car>) getPrivateField(cars, "carList");
        jun = carList.get(0);
    }

    @Test
    @DisplayName("move")
    void move() {
        cars.moveOrStop(jun, 4);
        assertThat(jun).isEqualTo(new Car("jun", 1));
    }

    @Test
    @DisplayName("stop")
    void stop() {
        cars.moveOrStop(jun, 3);
        assertThat(jun).isEqualTo(new Car("jun", 0));
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