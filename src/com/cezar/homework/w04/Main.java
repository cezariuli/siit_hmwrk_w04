package com.cezar.homework.w04;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car = new Logan(27, "abcdef1234");

        car.start();
        car.shiftGear(1);
        car.drive(0.01);

        float availableFuel = car.getAvailableFuel();
        float fuelConsumedPer100Km = car.getAverageFuelConsumption();

        Vehicle vehicle = new VWGolf(30, "1987ddkshik");

        Car car1 = (Car) vehicle;
        float availableFuelCar1 = car1.getAvailableFuel();
        float fuelConsumedPer100KmCar1 = car1.getAverageFuelConsumption();

    }
}
