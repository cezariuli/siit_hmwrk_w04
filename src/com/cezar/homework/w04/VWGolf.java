package com.cezar.homework.w04;

public class VWGolf extends Volkswagen {

    public VWGolf(Integer availableFuel, String chassisNumber) {
        super(51, "Diesel",  5, (float) 4.5);
        setTireSize(15);

        //cannot have more fuel than the fuel tank capacity.
        if (availableFuel <= super.fuelTankSize) {
            super.setAvailableFuel(availableFuel);
        }
        else System.out.println("Cannot have " + availableFuel + "l of fuel if the tank size is " + super.fuelTankSize + "l ");

        super.setChassisNumber(chassisNumber);
    }
}
