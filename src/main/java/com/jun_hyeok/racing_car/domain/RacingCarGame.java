package com.jun_hyeok.racing_car.domain;

import java.util.List;

public class RacingCarGame {
    private Cars cars;

    /**
     * 입렫받은 값을 토대로 쉼표를 구분자로 지정해서 나눈 다음, 그 수만큼 자동차 객체 생성
     * @author JunH
     * @param carsName 사용자로부터 입력 받은 차 이름들 (구분자는 쉼표)
     * @throws IllegalArgumentException 차의 이름이 5자를 초과할 시 에러
     */
    public void createCar(String carsName) throws IllegalArgumentException {
        cars = new Cars(carsName);
    }

    // 차의 이동 유무 결정
    public void play(){
        cars.play();
    }

    // 우승자 반환
    public List<Car> findWinner() {
        return cars.findWinner();
    }
}
