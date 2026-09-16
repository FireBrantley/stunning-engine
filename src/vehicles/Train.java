package src.vehicles;

import java.util.ArrayList;

import src.parts.Parts;

public class Train extends Vehicle
{
    private String model;

    public Train(String model)
    {
        super("Train");
        this.model = model;
    }

    public Train(String model, Parts... part)
    {
        super("Train", part);
        this.model = model;
    }

    public Train(String model, ArrayList<Parts> builtFrom)
    {
        super("Train", builtFrom);
        this.model = model;
    }

    public String toString()
    {
        return super.toString() + "\nModel: " + model;
    }
}
