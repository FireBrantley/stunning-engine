package src.vehicles;

import java.util.ArrayList;

import src.component.Component;

public class Train extends Vehicle
{
    private String model;

    public Train(String model)
    {
        super("Train");
        this.model = model;
    }

    public Train(String model, Component... part)
    {
        super("Train", part);
        this.model = model;
    }

    public Train(String model, ArrayList<Component> builtFrom)
    {
        super("Train", builtFrom);
        this.model = model;
    }

    public String toString()
    {
        return super.toString() + "\nModel: " + model;
    }
}
