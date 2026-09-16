public class Tank extends Parts
{
    private int capacity;
    private String unit;
    private String storing;

    public Tank(int capacity, String unit, String storing)
    {
        super("Tank");
        this.capacity = capacity;
        this.unit = unit;
        this.storing = storing;
    }

    public String toString()
    {
        return super.toString() + "\nCapacity: " + capacity + " " + unit + "\nStoring: " + storing;
    }
}
