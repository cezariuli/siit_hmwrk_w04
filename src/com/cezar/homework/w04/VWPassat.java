package com.cezar.homework.w04;

public class VWPassat extends Volkswagen{

    public VWPassat(Integer availableFuel, String chassisNumber) {
        super(66, "Diesel",  6, (float) 4.1);
        setTireSize(16);

        //cannot have more fuel than the fuel tank capacity.
        if (availableFuel <= super.fuelTankSize) {
            super.setAvailableFuel(availableFuel);
        }
        else System.out.println("Cannot have " + availableFuel + "l of fuel if the tank size is " + super.fuelTankSize + "l ");

        super.setChassisNumber(chassisNumber);
    }
}
