package src.components;

/**
 * Represents the tank component of a vehicle. 
 * This class extends the Component class and adds specific attributes 
 * related to tanks, such as its capacity, unit of measurement, and what it stores.
 * 
 * @author FireBrantley
 * @version 1.2.0
 * @since 1.0.0
 */
public class Tank extends Component
{
    /**
     * The capacity of the tank.
     */
    private int capacity;

    /**
     * The unit of measurement for the tank's capacity (e.g., "liters", "gallons").
     */
    private String unit;

    /**
     * The type of substance the tank is designed to store (e.g., "fuel", "water").
     */
    private String storing;

    /**
     * The singular form of the unit of measurement for the tank's capacity.
     */
    private String singularUnit; 

    /**
     * Constructs a Tank with the specified capacity, unit of measurement, and substance it stores.
     * 
     * @param capacity The capacity of the tank to construct.
     * @param unit The unit of measurement for the tank's capacity.
     * @param storing The type of substance the tank is designed to store.
     * @since 1.0.0
     */
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

    /**
     * Returns a string representation of the tank.
     * Including its capacity, unit of measurement, substance it stores, and type from the parent class.
     * Instead of returning the default object representation, 
     * this method provides a more meaningful description of the tank.
     * 
     * @return A string representation of the tank.
     * @since 1.0.0
     */
    @Override
    public String toString()
    {
        return super.toString() + "\nCapacity: " + capacity + " " + unit + "\nStoring: " + storing;
    }

    /**
     * Returns a brief summary of the tank.
     * 
     * @return A string containing a brief summary of the tank.
     * @since 1.0.0
     */
    @Override
    public String summary()
    {
        return capacity + " " + singularUnit + " tank";
    }
}
