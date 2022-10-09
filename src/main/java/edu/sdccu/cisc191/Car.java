package edu.sdccu.cisc191;

public class Car extends Vehicle
{
    private int numberOfDoors;

    public Car(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] option, int numberOfDoors)
    {
        super(manufacturerName, milesOnVehicle, price,numberOfSeats,option);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors()
    {return numberOfDoors;}
}


