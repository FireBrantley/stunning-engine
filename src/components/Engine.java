package src.components;

/**
 * Represents the engine component of a vehicle. 
 * This class extends the Component class and adds specific attributes 
 * related to engines, such as its variant and whether or not it is electric.
 * 
 * @author FireBrantley
 * @version 2.0.0
 * @since 1.0.0
 */
public class Engine extends Component
{
    /**
     * Indicates whether or not the engine is electric.
     * @since 1.0.0
     */
    private boolean electric;

    /**
     * The variant of the engine (e.g., "V6", "V8", "Inline-4").
     * @since 1.0.0
     */
    private String variant;

    /**
     * The type of fuel the engine uses (e.g., "gasoline", "diesel", "electricity").
     * @since 2.0.0
     */
    private String fuelType;
    
    /**
     * Package-private constructor used by EngineBuilder to create Engine instances.
     * This constructor should not be called directly; use {@link EngineBuilder} instead.
     * 
     * @param builder The EngineBuilder containing the engine configuration.
     * @since 2.0.0
     */
    Engine(EngineBuilder builder)
    {
        super("Engine");
        this.electric = builder.electric;
        this.variant = builder.variant;
        this.fuelType = builder.fuelType;
    }

    /**
     * Returns a string representation of the engine.
     * This includes all of its fields/properties,
     * instead of returning the default object representation 
     * providing a more meaningful description of the engine.
     * 
     * @return A string representation of the engine.
     * @since 1.0.0
     */
    @Override
    public String toString()
    {
        return super.toString() + "\nVariant: " + variant + "\nElectric? " + electric + "\nFuel Type: " + fuelType;
    }

    /**
     * Returns a brief summary of the engine.
     * This summary will include all of the engine's fields/properties, 
     * providing a concise overview of its characteristics.
     * 
     * @return A string containing a brief summary of the engine.
     * @since 1.0.0
     */
    @Override
    public String summary()
    {
        return variant + " engine that takes " + fuelType + " and is " + (electric ? "electric." : "not electric.");
    }

}