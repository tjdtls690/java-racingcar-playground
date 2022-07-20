package com.jun_hyeok.racing_car.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
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
    
    @Test
    @DisplayName("우승자 선정 (1명)")
    void winner_one() {
        Cars cars = new Cars("jun, fobi, dong");
        List<Car> carList = (List<Car>) getPrivateField(cars, "carsList");
        Car jun = carList.get(0);
        jun.move(() -> true);
        jun.move(() -> true);
        jun.move(() -> false);
        Car fobi = carList.get(1);
        fobi.move(() -> true);
        fobi.move(() -> false);
        fobi.move(() -> true);
        Car dong = carList.get(2);
        dong.move(() -> true);
        dong.move(() -> true);
        dong.move(() -> true);
        dong.move(() -> false);
        List<Car> winners = cars.findWinners();
        assertThat(winners).containsExactly(dong);
    }
    
    @Test
    @DisplayName("우승자 선정 (여러명)")
    void winner_multi() {
        Cars cars = new Cars("jun, fobi, dong");
        List<Car> carList = (List<Car>) getPrivateField(cars, "carsList");
        Car jun = carList.get(0);
        jun.move(() -> true);
        jun.move(() -> true);
        jun.move(() -> true);
        Car fobi = carList.get(1);
        fobi.move(() -> true);
        fobi.move(() -> false);
        fobi.move(() -> true);
        Car dong = carList.get(2);
        dong.move(() -> true);
        dong.move(() -> true);
        dong.move(() -> true);
        dong.move(() -> false);
        List<Car> winners = cars.findWinners();
        assertThat(winners).containsExactly(jun, dong);
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
