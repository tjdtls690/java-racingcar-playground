package com.jun_hyeok.racing_car.domain;

import com.jun_hyeok.racing_car.output.ResultView;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    public static final int MOVE_NUM_POSITION = 4;
    private final List<Car> carList;
    private final ResultView resultView;
    
    public Cars(String carsName) throws IllegalArgumentException {
        resultView = new ResultView();
        carList = new ArrayList<>();
        createCars(getSplit(carsName));
    }
    
    private String[] getSplit(String carsName) {
        carsName = carsName.replace(" ", "");
        return carsName.split(",");
    }
    
    private void createCars(String[] split) throws IllegalArgumentException {
        for (String carName : split) {
            carList.add(new Car(carName));
        }
    }
    
    public void play() {
        for (Car car : carList) {
            int ranNum = (int) (Math.random() * 9) + 1;
            moveOrStop(car, ranNum);
            resultView.processPrint(car);
        }
    }
    
    public void moveOrStop(Car car, int ranNum) {
        if (ranNum >= MOVE_NUM_POSITION) {
            car.move();
        }
    }
    
    
    public List<Car> findWinner() {
        return getWinners(getMx());
    }
    
    private List<Car> getWinners(Car mx) {
        return carList.stream()
                .filter(mx::posEquals)
                .collect(Collectors.toList());
    }
    
    private Car getMx() {
        Car mx = new Car("mx");
        for (Car car : carList) {
            mx = isMx(mx, car);
        }
        return mx;
    }
    
    private Car isMx(Car mx, Car car) {
        if (car.lessThan(mx)) {
            return car;
        }
        return mx;
    }
}
