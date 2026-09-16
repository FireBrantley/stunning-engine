public class Wheel extends Parts
{
    private int diameter;

    public Wheel(int diameter)
    {
        super("Wheel");
        this.diameter = diameter;
    }

    public String toString()
    {
        return super.toString() + "\nDiameter: " + diameter;
    }
}
