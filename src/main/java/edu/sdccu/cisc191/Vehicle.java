package edu.sdccu.cisc191;


import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "Manufacturer", nullable = false, columnDefinition = "TEXT", updatable = true)
    private String manufacturerName;
    @Column(
            name="Milage",
            nullable = false
    )
    private int milesOnVehicle;
    @Column(
            name="Price",
            nullable = false
    )
    private int price;
    @Column(
            name="options",
            nullable = false
    )
    private Option[] option;
    @Column(
            name="Seats",
            nullable = false
    )
    private int numberOfSeats;

    public Vehicle() {
    }

    public Vehicle(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] option) {
        this.manufacturerName = manufacturerName;
        this.milesOnVehicle = milesOnVehicle;
        this.price = price;
        this.numberOfSeats = numberOfSeats;
        this.option = option;
    }

    public Long getId() {
        return id;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public int getMilesOnVehicle() {
        return milesOnVehicle;
    }

    public int getPrice() {
        return price;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public Option[] getOptions() {
        return option;
    }

    public String printOption()
    {
        String a = "";
        for(int i = 0;i < option.length;i++)
        {
            a += option[i];
        }
        return a;
    }

    @Override
    public String toString() {
        return this.manufacturerName + " Miles:" + this.milesOnVehicle + " Price:" + this.price + " Seats:"
                + this.numberOfSeats + " Options:" + printOption();
    }
}
