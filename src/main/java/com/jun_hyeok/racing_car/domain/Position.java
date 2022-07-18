package com.jun_hyeok.racing_car.domain;

import java.util.Objects;

public class Position {
    public static final String POSITION_ERROR_MESSAGE = "차의 위치는 0 미만이 될 수 없습니다.";
    private int position;

    public Position() {
        this(0);
    }

    public Position(int position) {
        if(position < 0){
            throw new IllegalArgumentException(POSITION_ERROR_MESSAGE);
        }
        this.position = position;
    }

    public Position move() {
        return new Position(position + 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }

    public boolean lessThan(Position mx) {
        return this.position > mx.position;
    }
}
