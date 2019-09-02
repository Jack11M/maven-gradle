package com.hillel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public abstract class AbstractCar implements Car {

    private String brandAndModel;
    private int price;
    private int maxSpeed;
    private double fuelConsumption;

    @Override
    public String toString() {
        return "brand and model => '" + brandAndModel + '\''
                + ", price => " + price
                + ", maxSpeed => " + maxSpeed
                + ", fuelConsumption => " + fuelConsumption;
    }
}
