package com.hillel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class TaxiParkImpl implements TaxiPark {
    @Getter
    @Setter
    private List<Car> cars;

    @Override
    public int totalCostOfTaxiPark() {
        return cars.stream()
                .mapToInt(Car::getPrice)
                .sum();
    }

    @Override
    public void sortCarsByFuelConsumption() {
        cars = cars.stream()
                .sorted(Comparator.comparingDouble(Car::getFuelConsumption))
                .collect(Collectors.toList());
    }

    @Override
    public List<Car> findCarsBySpeed(int minSpeed, int maxSpeed) {
        return cars.stream()
                .filter(car -> car.getMaxSpeed() >= minSpeed && car.getMaxSpeed() <= maxSpeed)
                .collect(Collectors.toList());
    }
}
