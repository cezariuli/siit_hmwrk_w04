package com.cezar.homework.w04;

public class Logan extends Dacia{



    public Logan(Integer availableFuel, String chassisNumber) {
        super(45, "Petrol",  5, (float) 5.0);
        setTireSize(15);

        //cannot have more fuel than the fuel tank capacity.
        if (availableFuel <= super.fuelTankSize) {
            super.setAvailableFuel(availableFuel);
        }
        else System.out.println("Cannot have " + availableFuel + "l of fuel if the tank size is " + super.fuelTankSize + "l ");

        super.setChassisNumber(chassisNumber);
    }

}
