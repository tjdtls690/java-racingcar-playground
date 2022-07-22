package com.jun_hyeok.racing_game.domain;

public class Car {
    private final Name name;
    
    public Car(String name) throws IllegalArgumentException {
        this.name = new Name(name);
    }
}
