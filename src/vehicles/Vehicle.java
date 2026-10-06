package src.vehicles;

import java.util.ArrayList;

import src.components.Component;

/**
 * Represents a vehicle. 
 * This class serves as a base class for specific types of vehicles such as a Train.
 * It contains attributes related to the vehicle's type and the components it is built from.
 * 
 * @author FireBrantley
 * @version 2.0.0
 * @since 1.0.0
 */
public class Vehicle
{
    /**
     * The type of the vehicle (e.g., "Car", "Truck", "Train").
     * @since 1.0.0
     */
    private String type;

    /**
     * A list of components that the vehicle is built from.
     * @since 1.0.0
     */
    private ArrayList<Component> builtFrom;

    /**
     * Package-private constructor used by VehicleBuilder to create Vehicle instances.
     * This constructor should not be called directly; use {@link VehicleBuilder}
     * to construct Vehicle instances.
     *
     * @param builder The VehicleBuilder containing the vehicle configuration.
     * @since 2.0.0
     */
    Vehicle(VehicleBuilder builder)
    {
        this.type = builder.type;
        this.builtFrom = new ArrayList<Component>(builder.builtFrom);
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