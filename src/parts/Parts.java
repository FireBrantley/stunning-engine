package src.parts;

public class Parts
{
    private String type;

    public Parts(String type)
    {
        this.type = type;
    }

    public String toString()
    {
        return "Type: " + type;
    }

    public String summary()
    {
        return type;
    }
}