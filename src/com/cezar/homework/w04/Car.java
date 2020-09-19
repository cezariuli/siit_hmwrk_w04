package com.cezar.homework.w04;

public abstract class Car implements Vehicle {

    /* declaration of non-changeable properties */
    final Integer  fuelTankSize;
    final String fuelType;
    final Integer gears;
    final Float consumptionPer100Km;

    /* declaration of changeable properties */

    private Integer tireSize;

    /* declaration of instance specific properties */
    private String chassisNumber;

    private Boolean isCarStarted = false;
    private Boolean isCarStopped = false;

    private Float   currentConsumption;
    private Double   currentDrivenKm;
    private Integer    currentGear;

    //define Constructor
    public Car(Integer fuelTankSize, String fuelType, Integer gears, Float consumptionPer100Km) {
        this.fuelTankSize = fuelTankSize;
        this.fuelType = fuelType;
        this.gears = gears;
        this.consumptionPer100Km = consumptionPer100Km;
    }

    //define setters and getters;

    public void setCurrentGear(Integer gear) {
        this.currentGear = gear;
    }

    public Integer getCurrentGear() {
        return this.currentGear;
    }

    public void setTireSize ( Integer tireSize ){
        this.tireSize = tireSize;
    }

    public Integer getTireSize () {
        return this.tireSize;
    }

    public Integer getMaxGears() {
        return this.gears;
    }

    public void setCurrentDrivenKm(Double kms) {
        this.currentDrivenKm = kms;
    }

    public Double getCurrentDrivenKm() {
        return this.currentDrivenKm;
    }

    //define behaviors

    public void shiftGear(Integer gear) {
        if ( gear < getMaxGears() ) {
            setCurrentGear(gear);
        }
        else System.out.println("This car does not have a " + gear + "th gear.");
    }

    @Override
    public void start() {

        /* this "if" shall avoid the situation when "start" is called without previously stopping the car; this situation
        will lead to reset the current consumption without completing a driving cycle ( start -> stop )
         */
        if (isCarStarted == true ) {
            //do nothing, car is already started
            System.out.println("Car is already started");
        }
        else {
            isCarStarted = true;
            isCarStopped = false;

            currentConsumption = (float) 0.0;
            System.out.println("Car is started. Consumption stats are reset");
        }
    }

    @Override
    public void drive(double kms){
        setCurrentDrivenKm(kms);
    }

    @Override
    public void stop() {
        isCarStarted = false;
        isCarStopped = true;
        System.out.println("The car is stopped");
    }

    public Float getAvailableFuel() {
        return (float) 0.0;
    }

    public Float getAverageFuelConsumption() {
        return (float) 0.0;
    }
}
