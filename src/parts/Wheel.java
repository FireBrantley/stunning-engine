package src.parts;

public class Wheel extends Parts
{
    private int diameter;
    private String unit;
    private String singularUnit;

    public Wheel(int diameter)
    {
        super("Wheel");
        this.diameter = diameter;
        this.unit = "in.";
        this.singularUnit = "in.";
    }

    public Wheel(int diameter, String unit)
    {
        super("Wheel");
        this.diameter = diameter;
        this.unit = unit.toLowerCase();
        this.singularUnit = (unit != null && unit.toLowerCase().endsWith("s")) 
                            ? unit.toLowerCase().substring(0, unit.length() - 1) 
                            : unit.toLowerCase();
    }

    public String toString()
    {
        return super.toString() + "\nDiameter: " + diameter + " " + unit;
    }

    public String summary()
    {
        return diameter + " " + singularUnit + " wheel";
    }

}
