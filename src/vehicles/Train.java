package src.vehicles;

public class Train extends Vehicle
{
    private String model;

    public Train(String model)
    {
        super("Train");
        this.model = model;
    }

    public String toString()
    {
        return super.toString() + "\nModel: " + model;
    }
}
