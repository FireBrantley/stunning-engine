package src.component;

/**
 * Represents the wheel component of a vehicle. 
 * This class extends the Component class and adds specific attributes 
 * related to wheels, such as its diameter and unit of measurement.
 * 
 * @author FireBrantley
 */
public class Wheel extends Component
{
    /**
     * The diameter of the wheel.
     */
    private int diameter;

    /**
     * The unit of measurement for the wheel's diameter (e.g., "inches", "centimeters").
     */
    private String unit;
    
    /**
     * The singular form of the unit of measurement for the wheel's diameter.
     */
    private String singularUnit;

    /**
     * Constructs a Wheel with the specified diameter.
     * The unit of measurement defaults to "inches".
     * More specifically, the unit is set to "in." and the singular form is also set to "in.".
     * 
     * @param diameter The diameter of the wheel to construct.
     */
    public Wheel(int diameter)
    {
        super("Wheel");
        this.diameter = diameter;
        this.unit = "in.";
        this.singularUnit = "in.";
    }

    /**
     * Constructs a Wheel with the specified diameter and unit of measurement.
     * Allows for flexibility in specifying the unit of measurement for the wheel's diameter.
     * 
     * @param diameter The diameter of the wheel to construct.
     * @param unit The unit of measurement for the wheel's diameter.
     */
    public Wheel(int diameter, String unit)
    {
        super("Wheel");
        this.diameter = diameter;
        this.unit = unit.toLowerCase();
        this.singularUnit = (unit != null && unit.toLowerCase().endsWith("s")) 
                            ? unit.toLowerCase().substring(0, unit.length() - 1) 
                            : unit.toLowerCase();
    }

    /**
     * Returns a string representation of the wheel.
     * Including its diameter, unit of measurement, and type from the parent class.
     * Instead of returning the default object representation, 
     * this method provides a more meaningful description of the wheel.
     * 
     * @return A string representation of the wheel.
     */
    public String toString()
    {
        return super.toString() + "\nDiameter: " + diameter + " " + unit;
    }

    /**
     * Returns a brief summary of the wheel.
     * 
     * @return A string containing a brief summary of the wheel.
     */
    public String summary()
    {
        return diameter + " " + singularUnit + " wheel";
    }

}
