package src.vehicles;

import src.components.Component;

/**
 * Represents a car, which is a specific type of vehicle.
 * This class extends the Vehicle class and adds attributes specific to cars,
 * such as brand, model, year, and mileage.
 * 
 * @author FireBrantley
 * @version 1.3.0
 * @since 1.3.0
 */
public class Car extends Vehicle
{
    private static int currentYear = 2026;

    private String brand;
    private String model;
    private int year;
    private int miles;

    public Car(String type) {
        super(type);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString()
    {
        return super.toString() + "\nBrand: " + brand + 
        "\nModel: " + model + "\nYear: " + year + "\nMiles: " + miles;
    }
}