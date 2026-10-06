package src.components;

/**
 * Builder class for constructing {@link Engine} instances.
 * This class follows the Builder design pattern, allowing for flexible and readable engine creation.
 *
 * <p>Example:
 * <pre>{@code
 * Engine engine = new EngineBuilder(false)
 *     .variant("V8")
 *     .fuelType("gasoline")
 *     .build();
 * }</pre>
 *
 * @version 2.0.0
 * @since 2.0.0
 */
public class EngineBuilder
{
    /**
     * A required field that specifies whether or not the engine is electric.
     * Set through the constructor, and can be changed later with {@link #electric(boolean)}.
     * @since 2.0.0
     */
    boolean electric;

    /**
     * An optional field that can be set to customize the engine variant.
     * Defaults to "Steam" if not set.
     * @since 2.0.0
     */
    String variant = "Steam";

    /**
     * An optional field that can be set to customize the type of fuel the engine uses.
     * Defaults to "coal" if not set.
     * @since 2.0.0
     */
    String fuelType = "coal";

    /**
     * Creates a new EngineBuilder for an engine with the specified electric status.
     * Variant and fuelType can be customized via their setter methods.
     * 
     * @param electric Whether the engine is electric.
     * @since 2.0.0
     */
    public EngineBuilder(boolean electric)
    {
        this.electric = electric;
    }

    /**
     * Sets the electric status of the engine, replacing the value given to the constructor.
     * Useful when reusing a single builder object to create engines of different types
     * rather than creating a new EngineBuilder each time.
     * 
     * @param electric Whether the engine is electric.
     * @return This builder for method chaining.
     * @since 2.0.0
     */
    public EngineBuilder electric(boolean electric)
    {
        this.electric = electric;
        return this;
    }

    /**
     * Sets the variant of the engine. Defaults to "Steam" if not called.
     * 
     * @param variant The engine variant (e.g., "V6", "V8", "Inline-4").
     * @return This builder for method chaining.
     * @since 2.0.0
     */
    public EngineBuilder variant(String variant)
    {
        this.variant = variant;
        return this;
    }

    /**
     * Sets the fuel type for the engine. Defaults to "coal" if not called.
     * 
     * @param fuelType The type of fuel (e.g., "gasoline", "diesel", "electricity").
     * @return This builder for method chaining.
     * @since 2.0.0
     */
    public EngineBuilder fuelType(String fuelType)
    {
        this.fuelType = fuelType;
        return this;
    }

    /**
     * Constructs and returns the Engine.
     * 
     * @return A new Engine with the configured properties.
     * @since 2.0.0
     */
    public Engine build()
    {
        return new Engine(this);
    }
}