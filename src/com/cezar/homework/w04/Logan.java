package com.cezar.homework.w04;

public class Logan extends Dacia{

    private Integer availableFuel;

    // chassisNumber is final because the identification of a car cannot be changed once it has been created.
    // additional useful funcionality: to check if the given chassisNumber is not already taken by another car instance
    // chassisNumber should be unique for each car instance - but the feature is out of this homework's scope
    private final String chassisNumber;

    public Logan(Integer availableFuel, String chassisNumber) {
        super(45, "Petrol",  5, (float) 5.0);
        setTireSize(15);

        //cannot have more fuel than the fuel tank capacity.
        if (availableFuel <= super.fuelTankSize) {
            this.availableFuel = availableFuel;
        }
        else System.out.println("Cannot have " + availableFuel + "l of fuel if the tank size is " + super.fuelTankSize + "l ");

        this.chassisNumber = chassisNumber;
    }
}
