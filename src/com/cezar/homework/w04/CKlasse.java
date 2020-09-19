package com.cezar.homework.w04;

public class CKlasse extends MercedesBenz {

    public CKlasse(Integer availableFuel, String chassisNumber) {
        super(55, "Petrol",  5, (float) 4.8);
        setTireSize(16);

        //cannot have more fuel than the fuel tank capacity.
        if (availableFuel <= super.fuelTankSize) {
            super.setAvailableFuel(availableFuel);
        }
        else System.out.println("Cannot have " + availableFuel + "l of fuel if the tank size is " + super.fuelTankSize + "l ");

        super.setChassisNumber(chassisNumber);
    }
}
