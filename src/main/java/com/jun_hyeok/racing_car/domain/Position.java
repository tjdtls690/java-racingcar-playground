package com.jun_hyeok.racing_car.domain;

import lombok.Getter;

@Getter
public class Position {
    private final int position;
    
    public Position(int position) {
        this.position = position;
    }
    
    public Position move() {
        return new Position(position + 1);
    }
}
