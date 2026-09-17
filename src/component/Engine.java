package src.component;

/**
 * Represents the engine component of a vehicle. 
 * This class extends the Component class and adds specific attributes 
 * related to engines, such as its variant and whether or not it is electric.
 * 
 * @author FireBrantley
 * @version 1.0.0
 * @since 1.0.0
 */
public class Engine extends Component
{
    /**
     * The variant of the engine (e.g., "V6", "V8", "Inline-4").
     */
    private String variant;

    /**
     * Indicates whether or not the engine is electric.
     */
    private boolean electric;
    
    /**
     * Constructs an Engine with the specified variant and electric status.
     * 
     * @param electric Indicates if the engine is electric.
     * @param variant The variant of the engine to construct.
     * @since 1.0.0
     */
    public Engine(boolean electric, String variant)
    {
        super("Engine");
        this.variant = variant;
        this.electric = electric;
    }

    /**
     * Returns a string representation of the engine.
     * Including its variant, electric status, and type from the parent class.
     * Instead of returning the default object representation, 
     * this method provides a more meaningful description of the engine.
     * 
     * @return A string representation of the engine.
     * @since 1.0.0
     */
    public String toString()
    {
        return super.toString() + "\nVariant: " + variant + "\nElectric? " + electric;
    }

    /**
     * Returns a brief summary of the engine.
     * 
     * @return A string containing a brief summary of the engine.
     * @since 1.0.0
     */
    public String summary()
    {
        return variant + " engine";
    }

}
