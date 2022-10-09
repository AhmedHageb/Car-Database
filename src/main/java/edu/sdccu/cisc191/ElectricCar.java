package edu.sdccu.cisc191;

public class ElectricCar extends Car implements Chargeable{
    private int batteryCharge;
    public ElectricCar(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] option, int numberOfDoors) {
        super(manufacturerName, milesOnVehicle, price, numberOfSeats, option, numberOfDoors);
        this.batteryCharge = batteryCharge;
    }
    public int getBatteryCharge()
    {return batteryCharge;}
     public void chargeUp()
     {batteryCharge = 100;}
}
