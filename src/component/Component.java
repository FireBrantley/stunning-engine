package src.component;

/**
 * Represents a component of a vehicle. 
 * This class serves as a base class for specific types of components such as an Engine.
 * 
 * @author FireBrantley
 * @version 1.0.0
 * @since 1.0.0
 */
public class Component
{
    /**
     * The type of the component (e.g., "Engine", "Wheel", "Door").
     */
    private String type;

    /**
     * Constructs a Component with the specified type.
     * 
     * @param type The type of the component to construct.
     * @since 1.0.0
     */
    public Component(String type)
    {
        this.type = type;
    }

    /**
     * Returns a string representation of the component.
     * Including its type.
     * Instead of returning the default object representation, 
     * this method provides a more meaningful description of the component.
     * 
     * @return A string representation of the component.
     * @since 1.0.0
     */
    public String toString()
    {
        return "Type: " + type;
    }

    /**
     * Returns a brief summary of the component.
     * 
     * @return A string containing a brief summary of the component.
     * @since 1.0.0
     */
    public String summary()
    {
        return type;
    }
}