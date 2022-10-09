package edu.sdccu.cisc191;

public class GasCar extends Car implements Combustible{
    private int fuelLevel;

    public GasCar(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] option, int numberOfDoors) {
        super(manufacturerName, milesOnVehicle, price, numberOfSeats, option, numberOfDoors);
    }
    public int getFuelLevel()
    {return fuelLevel;}

     public void tankUp()
     {fuelLevel = 100;}
    public int getNumberOfDoors()
    {return super.getNumberOfDoors();}
}
