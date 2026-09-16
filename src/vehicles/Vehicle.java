package src.vehicles;

import java.util.ArrayList;

import src.parts.Parts;

public class Vehicle
{
    private String type;
    private ArrayList<Parts> builtFrom = new ArrayList<Parts>();

    public Vehicle(String type)
    {
        this.type = type;
    }

    public Vehicle(String type, Parts... part)
    {
        this.type = type;
        for (Parts p : part)
        {
            builtFrom.add(p);
        }
    }

    public Vehicle(String type, ArrayList<Parts> builtFrom)
    {
        this.type = type;
        this.builtFrom = builtFrom;
    }

    public String toString()
    {
        return "Type: " + type + "\nBuilt From: " + builtFrom;
    }
}