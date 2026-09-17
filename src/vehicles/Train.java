package src.vehicles;

import java.util.ArrayList;

import src.component.Component;

/**
 * Represents a train vehicle. 
 * This class extends the Vehicle class and adds specific attributes 
 * related to trains, such as its model.
 * 
 * @author FireBrantley
 * @version 1.0.0
 * @since 1.0.0
 */
public class Train extends Vehicle
{
    /**
     * The model of the train.
     */
    private String model;

    /**
     * Constructs a Train with the specified model.
     * Does not specify any components that the train is built from.
     * 
     * @param model The model of the train to construct.
     * @since 1.0.0
     */
    public Train(String model)
    {
        super("Train");
        this.model = model;
    }

    /**
     * Constructs a Train with the specified model and components.
     * Allows for flexibility in specifying the components that the train is built from,
     * which can be provided as multiple Component objects.
     * 
     * @param model The model of the train to construct.
     * @param part The components that the train is built from.
     * @since 1.0.0
     */
    public Train(String model, Component... part)
    {
        super("Train", part);
        this.model = model;
    }

    /**
     * Constructs a Train with the specified model and a list of components.
     * Allows for flexibility in specifying the components that the train is built from,
     * which can be provided as an ArrayList of Component objects.
     * 
     * @param model The model of the train to construct.
     * @param builtFrom The list of components that the train is built from.
     * @since 1.0.0
     */
    public Train(String model, ArrayList<Component> builtFrom)
    {
        super("Train", builtFrom);
        this.model = model;
    }

    /**
     * Returns a string representation of the train.
     * Including its model and type from the parent class.
     * Instead of returning the default object representation, 
     * this method provides a more meaningful description of the train.
     * 
     * @return A string representation of the train.
     * @since 1.0.0
     */
    public String toString()
    {
        return super.toString() + "\nModel: " + model;
    }
}
