package com.jun_hyeok.racing_game.domain;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Position {
    private int position;
    
    public Position(int position) {
        this.position = position;
    }
    
    public Position move() {
        return new Position(position + 1);
    }
}
