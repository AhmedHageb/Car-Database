package edu.sdccu.cisc191;

public class PickupTruck extends Vehicle{
    private int cargoCapacity;

    public PickupTruck (String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] option, int cargoCapacity)
    {
        super(manufacturerName, milesOnVehicle, price, numberOfSeats, option);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity()
    {
        return cargoCapacity;
    }
}
