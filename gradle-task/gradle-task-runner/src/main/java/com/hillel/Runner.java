package com.hillel;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Suv("Mercedes GL350", 83900, 220, 8.5, true));
        cars.add(new PassengerCar("Audi S8", 42800, 250, 14.1, 5));
        cars.add(new Suv("Renault Koleos", 43500, 210, 8.3, true));
        cars.add(new Truck("Mercedes Actros", 38900, 150, 35, 30000));
        cars.add(new Truck("Renault Magnum", 14300, 140, 40, 19000));
        cars.add(new PassengerCar("Smart ForTwo 3", 2100, 155, 4.5, 2));
        cars.add(new PassengerCar("Audi A8", 35800, 230, 12.9, 5));

        TaxiPark taxiPark = new TaxiParkImpl(cars);

        System.out.println("Total cost of Taxi park is: $" + taxiPark.totalCostOfTaxiPark() + "\n");

        taxiPark.sortCarsByFuelConsumption();

        System.out.println("List of cars with the adjusted speed: ");
        for (Car car: taxiPark.findCarsBySpeed(155, 250)) {
            System.out.println(car);
        }
    }
}
