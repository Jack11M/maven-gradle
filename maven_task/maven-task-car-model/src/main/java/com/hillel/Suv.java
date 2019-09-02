package com.hillel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString(callSuper = true, includeFieldNames = true)
class Suv extends AbstractCar {
    @Getter
    @Setter
    private boolean fourWheelDrive;

    Suv(String brandAndModel, int price, int maxSpeed, double fuelConsumption, boolean fourWheelDrive) {
        super(brandAndModel, price, maxSpeed, fuelConsumption);
        this.fourWheelDrive = fourWheelDrive;
    }
}
