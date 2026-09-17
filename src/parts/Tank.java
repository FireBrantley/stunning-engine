package src.parts;

public class Tank extends Parts
{
    private int capacity;
    private String unit;
    private String storing;
    private String singularUnit; 

    public Tank(int capacity, String unit, String storing)
    {
        super("Tank");
        this.capacity = capacity;
        this.unit = unit.toLowerCase();
        this.storing = storing;
        this.singularUnit = (unit != null && unit.toLowerCase().endsWith("s")) 
                            ? unit.toLowerCase().substring(0, unit.length() - 1) 
                            : unit.toLowerCase();
    }

    public String toString()
    {
        return super.toString() + "\nCapacity: " + capacity + " " + unit + "\nStoring: " + storing;
    }

    public String summary()
    {
        return capacity + " " + singularUnit + " tank";
    }
}
