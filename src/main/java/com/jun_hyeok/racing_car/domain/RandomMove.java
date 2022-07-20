package com.jun_hyeok.racing_car.domain;

import java.util.function.Supplier;

public class RandomMove implements Supplier<Boolean> {
    
    public static final int MIN_MOVE_RANDOM_NUMBER = 4;
    
    @Override
    public Boolean get() {
        return getRanNum() >= MIN_MOVE_RANDOM_NUMBER;
    }
    
    private int getRanNum() {
        return (int) (Math.random() * 10);
    }
}
