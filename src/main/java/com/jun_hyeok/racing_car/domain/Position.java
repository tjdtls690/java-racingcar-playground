package com.jun_hyeok.racing_car.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.Objects;

@Getter
@EqualsAndHashCode
public class Position {
    private final int position;
    
    public Position(int position) {
        this.position = position;
    }
    
    public Position move() {
        return new Position(position + 1);
    }
    
    public boolean lessThan(Position mxPosition) {
        return position > mxPosition.position;
    }
}
