package src.components;

/**
 * Builder class for constructing {@link Wheel} instances.
 * This class follows the Builder design pattern, allowing for flexible and readable wheel creation.
 *
 * <p>Example:
 * <pre>{@code
 * Wheel wheel = new WheelBuilder()
 *     .diameter(22)
 *     .unit("inches")
 *     .build();
 * }</pre>
 *
 * @version 2.0.0
 * @since 2.0.0
 */
public class WheelBuilder
{
    /**
     * An optional field that can be set to customize the wheel diameter.
     * Defaults to 20 if not set.
     * @since 2.0.0
     */
    int diameter = 20;

    /**
     * An optional field that can be set to customize the unit of measurement for the wheel's diameter.
     * Defaults to "inches" if not set.
     * @since 2.0.0
     */
    String unit = "inches";

    /**
     * Creates a new WheelBuilder for constructing a wheel.
     * Diameter and unit can be customized via their setter methods.
     * Doesn't require any parameters since all attributes are optional.
     * 
     * @since 2.0.0
     */
    public WheelBuilder()
    {
        // No required attributes for Wheel Class
    }

    /**
     * Sets the diameter of the wheel. Defaults to 20 if not called.
     * 
     * @param diameter The diameter of the wheel.
     * @return This builder for method chaining.
     * @since 2.0.0
     */
    public WheelBuilder diameter(int diameter)
    {
        this.diameter = diameter;
        return this;
    }

    /**
     * Sets the unit of measurement for the wheel's diameter. Defaults to "inches" if not called.
     * 
     * @param unit The unit of measurement (e.g., "inches", "centimeters").
     * @return This builder for method chaining.
     * @since 2.0.0
     */
    public WheelBuilder unit(String unit)
    {
        this.unit = unit;
        return this;
    }

    /**
     * Constructs and returns the Wheel.
     * 
     * @return A new Wheel with the configured properties.
     * @since 2.0.0
     */
    public Wheel build()
    {
        return new Wheel(this);
    }
}
