package src.vehicles;

import java.util.ArrayList;

import src.components.Component;

/**
 * Represents a vehicle. 
 * This class serves as a base class for specific types of vehicles such as a Train.
 * It contains attributes related to the vehicle's type and the components it is built from.
 * 
 * @author FireBrantley
 * @version 1.1.0
 * @since 1.0.0
 */
public class Vehicle
{
    /**
     * The type of the vehicle (e.g., "Car", "Truck", "Train").
     */
    private String type;

    /**
     * A list of components that the vehicle is built from.
     */
    private ArrayList<Component> builtFrom = new ArrayList<Component>();

    /**
     * Constructs a Vehicle with the specified type.
     * Does not specify any components that the vehicle is built from.
     * 
     * @param type The type of the vehicle to construct.
     * @since 1.0.0
     */
    public Vehicle(String type)
    {
        this.type = type;
    }

    /**
     * Constructs a Vehicle with the specified type and components.
     * Allows for flexibility in specifying the components that the vehicle is built from,
     * which can be provided as multiple Component objects.
     * 
     * @param type The type of the vehicle to construct.
     * @param part The components that the vehicle is built from.
     * @since 1.0.0
     */
    public Vehicle(String type, Component... part)
    {
        this.type = type;
        for (Component p : part)
        {
            builtFrom.add(p);
        }
    }

    /**
     * Constructs a Vehicle with the specified type and a list of components.
     * Allows for flexibility in specifying the components that the vehicle is built from,
     * which can be provided as an ArrayList of Component objects.
     * 
     * @param type The type of the vehicle to construct.
     * @param builtFrom The list of components that the vehicle is built from.
     * @since 1.0.0
     */
    public Vehicle(String type, ArrayList<Component> builtFrom)
    {
        this.type = type;
        this.builtFrom = builtFrom;
    }

    /**
     * Returns a string representation of the vehicle.
     * Including its type and the components it is built from.
     * Instead of returning the default object representation, 
     * this method provides a more meaningful description of the vehicle.
     * 
     * @return A string representation of the vehicle.
     * @since 1.0.0
     */
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Type: ").append(type).append("\nBuilt From: [");

        if (builtFrom.isEmpty())
        {
            sb.append("(none)");
        }
        else
        {
            for (int i = 0; i < builtFrom.size(); i++)
            {
                if (i > 0)
                {
                    sb.append(", ");
                }
                sb.append(builtFrom.get(i).summary());
            }
        }

        sb.append("]");

        return sb.toString();
    }
}