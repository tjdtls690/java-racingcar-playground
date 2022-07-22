package com.jun_hyeok.racing_game.domain;

import java.util.function.Supplier;

public class RandomMovingSelect implements Supplier<Boolean> {
    
    public static final int MOVING_NUM = 4;
    
    @Override
    public Boolean get() {
        return getRanNum() >= MOVING_NUM;
    }
    
    private int getRanNum() {
        return (int) (Math.random() * 10);
    }
}
