package com.jun_hyeok.racing_car.domain;

import lombok.Getter;

@Getter
public class Name {
    
    public static final String NAME_LENGTH_ERROR_MESSAGE = "자동차 이름은 5자를 초과할 수 없습니다.";
    public static final int MAX_NAME_LENGTH = 5;
    private final String name;
    
    public Name(String carName) throws IllegalArgumentException {
        if (carName.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException(NAME_LENGTH_ERROR_MESSAGE);
        }
        this.name = carName;
    }
}
