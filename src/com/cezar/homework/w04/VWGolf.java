package com.cezar.homework.w04;

public class VWGolf extends Volkswagen {

    private Integer availableFuel;
    private final String chassisNumber;

    public VWGolf(Integer availableFuel, String chassisNumber) {
        super(51, "Diesel",  5, (float) 5.0);
        setTireSize(15);

        //cannot have more fuel than the fuel tank capacity.
        if (availableFuel <= super.fuelTankSize) {
            this.availableFuel = availableFuel;
        }
        else System.out.println("Cannot have " + availableFuel + "l of fuel if the tank size is " + super.fuelTankSize + "l ");

        this.chassisNumber = chassisNumber;
    }
}
