package com.hillel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString(callSuper = true, includeFieldNames = true)
class PassengerCar extends AbstractCar {
    @Getter
    @Setter
    private int quantityOfPassengerSeats;

    PassengerCar(String brandAndModel, int price, int maxSpeed, double fuelConsumption, int quantityOfPassengerSeats) {
        super(brandAndModel, price, maxSpeed, fuelConsumption);
        this.quantityOfPassengerSeats = quantityOfPassengerSeats;
    }
}
