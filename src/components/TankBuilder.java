package src.components;

/**
 * Builder class for constructing {@link Tank} instances.
 * This class follows the Builder design pattern, allowing for flexible and readable tank creation.
 *
 * <p>Example:
 * <pre>{@code
 * Tank tank = new TankBuilder(50)
 *     .unit("liters")
 *     .storing("fuel")
 *     .build();
 *
 * Tank barrel = new TankBuilder(55)
 *     .type("Barrel")
 *     .unit("gallons")
 *     .storing("water")
 *     .build();
 * }</pre>
 *
 * @version 2.0.0
 * @since 2.0.0
 */
public class TankBuilder
{
    /**
     * A required field that specifies the capacity of the tank.
     * Set through the constructor, and can be changed later with {@link #capacity(int)}.
     * @since 2.0.0
     */
    int capacity;

    /**
     * An optional field that can be set to customize the type of the tank (e.g., "Tank", "Barrel").
     * Defaults to "Tank" if not set.
     * @since 2.0.0
     */
    String type = "Tank";

    /**
     * An optional field that can be set to customize the unit of measurement for the tank's capacity.
     * Defaults to "liters" if not set.
     * @since 2.0.0
     */
    String unit = "liters";

    /**
     * An optional field that can be set to customize the type of substance the tank is designed to store.
     * Defaults to "fuel" if not set.
     * @since 2.0.0
     */
    String storing = "fuel";

    /**
     * Creates a new TankBuilder for constructing a tank.
     * The capacity is required, while the type, the unit of measurement, and the substance
     * it stores can be customized via their setter methods.
     * 
     * @param capacity The capacity of the tank.
     * @since 2.0.0
     */
    public TankBuilder(int capacity)
    {
        this.capacity = capacity;
    }

    /**
     * Sets the capacity of the tank, replacing the value given to the constructor.
     * Useful when reusing a single builder object to create tanks of different sizes
     * rather than creating a new TankBuilder each time.
     * 
     * @param capacity The capacity of the tank.
     * @return This builder for method chaining.
     * @since 2.0.0
     */
    public TankBuilder capacity(int capacity)
    {
        this.capacity = capacity;
        return this;
    }

    /**
     * Sets the type of the tank, allowing it to be something other than a plain tank (e.g., "Barrel").
     * Defaults to "Tank" if not called.
     * 
     * @param type The type of the tank (e.g., "Tank", "Barrel").
     * @return This builder for method chaining.
     * @since 2.0.0
     */
    public TankBuilder type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Sets the unit of measurement for the tank's capacity. Defaults to "liters" if not called.
     * 
     * @param unit The unit of measurement (e.g., "liters", "gallons").
     * @return This builder for method chaining.
     * @since 2.0.0
     */
    public TankBuilder unit(String unit)
    {
        this.unit = unit;
        return this;
    }

    /**
     * Sets the type of substance the tank is designed to store. Defaults to "fuel" if not called.
     * 
     * @param storing The type of substance the tank stores (e.g., "fuel", "water").
     * @return This builder for method chaining.
     * @since 2.0.0
     */
    public TankBuilder storing(String storing)
    {
        this.storing = storing;
        return this;
    }

    /**
     * Constructs and returns the Tank.
     * 
     * @return A new Tank with the configured properties.
     * @since 2.0.0
     */
    public Tank build()
    {
        return new Tank(this);
    }
}