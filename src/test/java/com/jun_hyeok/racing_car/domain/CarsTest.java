package com.jun_hyeok.racing_car.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarsTest {
    
    
    @Test
    @DisplayName("자동차 객체 생성 (1개)")
    void carCreateOne() {
        Cars cars = new Cars("jun");
        assertEquals(getCarsNum(cars), 1);
    }
    
    @Test
    @DisplayName("자동차 객체 생성 (여러개)")
    void carCreateMulti() {
        Cars cars = new Cars("jun, fobi, dong");
        assertEquals(getCarsNum(cars), 3);
    }
    
    private int getCarsNum(Cars cars) {
        List<Car> carsList = (List<Car>) getPrivateField(cars, "carsList");
        int size = carsList.size();
        return size;
    }
    
    private Object getPrivateField(Object object, String fieldName) {
        try {
            Field field = object.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            return field.get(object);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
