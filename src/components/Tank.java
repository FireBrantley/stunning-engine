package src.components;

/**
 * Represents the tank component of a vehicle. 
 * This class extends the Component class and adds specific attributes 
 * related to tanks, such as its capacity, unit of measurement, and what it stores.
 * The component type defaults to "Tank" but can be customized through {@link TankBuilder}
 * (e.g., "Barrel").
 * 
 * @author FireBrantley
 * @version 2.0.0
 * @since 1.0.0
 */
public class Tank extends Component
{
    /**
     * The capacity of the tank.
     * @since 1.0.0
     */
    private int capacity;

    /**
     * The unit of measurement for the tank's capacity (e.g., "liters", "gallons").
     * @since 1.0.0
     */
    private String unit;

    /**
     * The type of substance the tank is designed to store (e.g., "fuel", "water").
     * @since 1.0.0
     */
    private String storing;

    /**
     * Package-private constructor used by TankBuilder to create Tank instances.
     * This constructor should not be called directly; use {@link TankBuilder} 
     * to construct Tank instances.
     * 
     * @param builder The TankBuilder containing the tank configuration.
     * @since 2.0.0
     */
    Tank(TankBuilder builder)
    {
        super(builder.type);
        this.capacity = builder.capacity;
        this.unit = builder.unit;
        this.storing = builder.storing;
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
        return "A " + super.summary().toLowerCase() + " with a capacity of " + capacity + " " + unit;
    }
}