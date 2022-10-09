package edu.sdccu.cisc191;

public class SportsUtilityVehicle extends Vehicle{
    private int maxTowingWeight;


    public SportsUtilityVehicle(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] option, int maxTowingWeight) {
        super(manufacturerName, milesOnVehicle, price, numberOfSeats, option);
        this.maxTowingWeight = maxTowingWeight;
    }

    public int getMaxTowingWeight()
    {
        return maxTowingWeight;
    }
}
