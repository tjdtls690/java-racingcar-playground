package com.jun_hyeok.racing_car.domain;

import lombok.Data;

@Data
public class CarDTO {
    private final Name name;
    private Position position;
    
    public CarDTO(Name name, int position) {
        this.name = name;
        this.position = new Position(position);
    }
    
    public void move() {
        position = position.move();
    }
}
