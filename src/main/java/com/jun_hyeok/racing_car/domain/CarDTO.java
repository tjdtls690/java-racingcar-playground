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
    
    public boolean lessThan(CarDTO carDTO) {
        return position.lessThan(carDTO.position);
    }
    
    public boolean isWinner(CarDTO mxCarDTO) {
        return position.equals(mxCarDTO.position);
    }
}
