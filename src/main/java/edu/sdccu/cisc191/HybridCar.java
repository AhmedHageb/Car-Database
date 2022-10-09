package edu.sdccu.cisc191;

public class HybridCar extends Car implements Chargeable, Combustible{
    private int fuelLevel;
    private int batteryCharge;


    public HybridCar(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] option, int numberOfDoors) {
        super(manufacturerName, milesOnVehicle, price, numberOfSeats, option, numberOfDoors);
    }

    public void tankUp()
    {fuelLevel = 100;}

    public int getFuelLevel()
    {return fuelLevel;}

    public int getBatteryCharge()
    {return batteryCharge;}

    public void chargeUp()
    {batteryCharge = 100;}

}
