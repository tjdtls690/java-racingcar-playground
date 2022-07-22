package com.jun_hyeok.racing_game.domain;

import org.apache.commons.lang3.StringUtils;

public class Name {
    public static final int MAX_CAR_NAME_LENGTH = 5;
    private final String name;
    
    public Name(String name) throws IllegalArgumentException {
        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException("차 이름은 null 또는 공백이 될 수 없습니다.");
        }
        
        if (name.length() > MAX_CAR_NAME_LENGTH) {
            throw new IllegalArgumentException("차 이름은 5자를 초과할 수 없습니다.");
        }
        
        this.name = name;
    }
}
