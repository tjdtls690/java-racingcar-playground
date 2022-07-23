package com.jun_hyeok.racing_game.domain;

import com.jun_hyeok.racing_game.utils.UtilsFunctions;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

@Getter
public class Name {
    private final String name;
    
    public Name(String name) throws IllegalArgumentException {
        UtilsFunctions.isCorrectName(name);
        this.name = name;
    }
}
