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

    private Float       currentConsumption; //consumption of fuel during current driving cycle;
    private Float       currentDrivenKm;    //total driven Kms of current driving cycle;
    private Integer     currentGear;

    //define Constructor
    public Car(Integer fuelTankSize, String fuelType, Integer gears, Float consumptionPer100Km) {
        this.fuelTankSize = fuelTankSize;
        this.fuelType = fuelType;
        this.gears = gears;
        this.consumptionPer100Km = consumptionPer100Km;
    }

    //declare abstract methods;

    public abstract Float getAvailableFuel();

    public abstract Float getAverageFuelConsumption();

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

    public void setCurrentDrivenKm(Float kms) {
        this.currentDrivenKm = kms;
    }

    public Float getCurrentDrivenKm() {
        return this.currentDrivenKm;
    }

    public Float getConsumptionPer100Km() {
        return this.consumptionPer100Km;
    }

    public void setCurrentConsumption(Float consumption) {
        this.currentConsumption += consumption;
    }

    public Float getCurrentConsumption() {
        return this.currentConsumption;
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
            currentDrivenKm = (float) 0.0;
            System.out.println("Car is started. Consumption stats are reset");
        }
    }

    @Override
    public void drive(float kms){
        if (isCarStarted) {
            Float distance = getCurrentDrivenKm();
            distance += kms;
            //update the total distance driven in current driving cycle
            setCurrentDrivenKm(distance);
            //calculate fuel consumption for the distance driven in current gear
            calculateConsumption(kms);
        }
        else System.out.println("Cannot drive, car is stopped");
    }

    @Override
    public void stop() {
        isCarStarted = false;
        isCarStopped = true;
        System.out.println("The car is stopped");
    }

    public void calculateConsumption(double kms) {
        double tmpCurrentGear = getCurrentGear();
        double tmpMaxGear = getMaxGears();
        float tmpConsumptionPer100Km;
        float tmpBurnedFuel;

        //calculate consumption per 100km for current gear
        tmpConsumptionPer100Km = (float) (getConsumptionPer100Km() * Math.pow(1.1, (tmpMaxGear - tmpCurrentGear)));
        //calculate how much fuel was burned during current drive in current gear;
        tmpBurnedFuel = (float) (( tmpConsumptionPer100Km * kms ) / 100);

        setCurrentConsumption(tmpBurnedFuel);
    }


}
