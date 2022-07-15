package com.jun_hyeok.racing_car.domain;

import org.apache.commons.lang3.StringUtils;

public class Name {
    public static final String NAME_BLANK_ERROR_MESSAGE = "이름은 1자 이상이어야 합니다.";
    public static final String NAME_LENGTH_ERROR_MESSAGE = "이름은 5자를 초과할 수 없습니다.";
    private final String name;

    public Name(String name) throws IllegalArgumentException{
        if(StringUtils.isBlank(name)){
            throw new IllegalArgumentException(NAME_BLANK_ERROR_MESSAGE);
        }

        if(name.length() > 5){
            throw new IllegalArgumentException(NAME_LENGTH_ERROR_MESSAGE);
        }
        this.name = name;
    }
}
