package src.components;

/**
 * Represents the wheel component of a vehicle. 
 * This class extends the Component class and adds specific attributes 
 * related to wheels, such as its diameter and unit of measurement.
 * 
 * @author FireBrantley
 * @version 2.0.0
 * @since 1.0.0
 */
public class Wheel extends Component
{
    /**
     * The diameter of the wheel.
     * @since 1.0.0
     */
    private int diameter;

    /**
     * The unit of measurement for the wheel's diameter (e.g., "inches", "centimeters").
     * @since 1.0.0
     */
    private String unit;

    /**
     * Package-private constructor used by WheelBuilder to create Wheel instances.
     * This constructor should not be called directly; use {@link WheelBuilder} 
     * to construct Wheel instances.
     * 
     * @param builder The WheelBuilder containing the wheel configuration.
     * @since 2.0.0
     */
    Wheel(WheelBuilder builder)
    {
        super("Wheel");
        this.diameter = builder.diameter;
        this.unit = builder.unit;
    }

    /**
     * Returns a string representation of the wheel.
     * Including its diameter, unit of measurement, and type from the parent class.
     * Instead of returning the default object representation, 
     * this method provides a more meaningful description of the wheel.
     * 
     * @return A string representation of the wheel.
     * @since 1.0.0
     */
    @Override
    public String toString()
    {
        return super.toString() + "\nDiameter: " + diameter + " " + unit;
    }

    /**
     * Returns a brief summary of the wheel.
     * 
     * @return A string containing a brief summary of the wheel.
     * @since 1.0.0
     */
    @Override
    public String summary()
    {
        return "A wheel with a diameter of " + diameter + " " + unit;
    }

}
