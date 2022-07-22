package com.jun_hyeok.racing_game.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarsTest {
    
    @Test
    @DisplayName("우승자 선정 (1명)")
    void find_winner_one() {
        Car jun = new Car("jun", 2);
        Car chul = new Car("chul", 3);
        Car young = new Car("young", 1);
        
        Cars cars = new Cars(Arrays.asList(jun, chul, young));
        List<Car> winners = cars.findWinners();
        assertThat(winners).containsExactly(chul);
    }
    
    @Test
    @DisplayName("우승자 선정 (여러명)")
    void find_winner_multi() {
        Car jun = new Car("jun", 3);
        Car chul = new Car("chul", 3);
        Car young = new Car("young", 1);
        
        Cars cars = new Cars(Arrays.asList(jun, chul, young));
        List<Car> winners = cars.findWinners();
        assertThat(winners).containsExactly(jun, chul);
    }
}