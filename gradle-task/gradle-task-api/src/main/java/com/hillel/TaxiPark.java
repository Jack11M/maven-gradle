package com.hillel;

import java.util.List;

public interface TaxiPark {
    int totalCostOfTaxiPark();

    void sortCarsByFuelConsumption();

    List<Car> findCarsBySpeed(int minSpeed, int maxSpeed);
}
