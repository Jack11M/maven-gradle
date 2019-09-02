package com.hillel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString(callSuper = true, includeFieldNames = true)
class Truck extends AbstractCar {
    @Getter
    @Setter
    private double loadCapacity;

    Truck(String brandAndModel, int price, int maxSpeed, double fuelConsumption, double loadCapacity) {
        super(brandAndModel, price, maxSpeed, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }
}
