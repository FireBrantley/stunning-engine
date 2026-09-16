package src.vehicles;

public class Vehicle
{
    private String type;

    public Vehicle(String type)
    {
        this.type = type;
    }

    public String toString()
    {
        return "Type: " + type;
    }
}