package com.cezar.homework.w04;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car = new Logan(27, "abcdef1234");

        car.start();
        car.shiftGear(1);
        car.drive((float)0.01);
        car.shiftGear(2);
        car.drive((float)0.02);
        car.shiftGear(3);
        car.drive((float)0.5);
        car.shiftGear(4);
        car.drive((float)0.5);
        car.shiftGear(5);
        car.drive((float)10);
        car.shiftGear(4);
        car.drive((float)0.5);
        car.shiftGear(3);
        car.drive((float)0.1);
        car.stop();

        float availableFuel = car.getAvailableFuel();
        float fuelConsumedPer100Km = car.getAverageFuelConsumption();

        System.out.println("Available fuel on Logan: " + availableFuel);
        System.out.println("Average consumption of Logan: " + fuelConsumedPer100Km);
        

    }
}
