package src.vehicles;

import src.components.Component;

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