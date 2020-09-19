package com.cezar.homework.w04;

public abstract class MercedesBenz extends Car {

    private Integer availableFuel;
    private String chassisNumber;

    public MercedesBenz(Integer fuelTankSize, String fuelType, Integer gears, Float consumptionPer100Km) {
        super(fuelTankSize, fuelType, gears, consumptionPer100Km);
    }

    public void setAvailableFuel(Integer availableFuel) {
        this.availableFuel = availableFuel;
    }

    public void setChassisNumber(String chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    public Float getAvailableFuel() {
        return  availableFuel - super.getCurrentConsumption();

    }

    public Float getAverageFuelConsumption() {
        Float avgFuelCons = ( super.getCurrentConsumption() * 100 ) / super.getCurrentDrivenKm();
        return avgFuelCons;

    }
}
