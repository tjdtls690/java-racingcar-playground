package com.jun_hyeok.racing_game.domain;

import java.util.function.Supplier;

public class Car {
    private final Name name;
    private Position position;
    
    public Car(String name) {
        this(name, 0);
    }
    
    public Car(String name, int position) throws IllegalArgumentException {
        this.name = new Name(name);
        this.position = new Position(position);
    }
    
    public void move(Supplier<Boolean> isMove) {
        if(isMove.get()) {
            position = position.move();
        }
    }
    
    public Position getPosition() {
        return position;
    }
    
    public void isMxPosition(Position mxPosition) {
        position.isMxPosition(mxPosition);
    }
    
    public boolean isWinner(Position mxPosition) {
        return position.equals(mxPosition);
    }
}
