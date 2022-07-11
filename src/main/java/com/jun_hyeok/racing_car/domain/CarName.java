package com.jun_hyeok.racing_car.domain;

public class CarName {
    public static final String NAME_LENGTH_ERROR_MESSAGE = "이름은 5자를 초과할 수 없습니다.";
    private final String name;

    public CarName(String name) throws RuntimeException {
        if(name.length() > 5){
            throw new RuntimeException(NAME_LENGTH_ERROR_MESSAGE);
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
