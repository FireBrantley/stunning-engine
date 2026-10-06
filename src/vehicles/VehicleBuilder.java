package src.vehicles;

import java.util.ArrayList;

import src.components.Component;

/**
 * Builder class for constructing {@link Vehicle} instances.
 * This class follows the Builder design pattern, allowing for flexible and readable vehicle creation.
 *
 * <p>Example:
 * <pre>{@code
 * Vehicle vehicle = new VehicleBuilder()
 *     .type("Car")
 *     .component(engine)
 *     .component(transmission)
 *     .component(wheels)
 *     .build();
 * }</pre>
 *
 * @version 2.0.0
 * @since 2.0.0
 */
public class VehicleBuilder
{
    /**
     * An optional field that can be set to customize the vehicle type.
     * Defaults to "Vehicle" if not set.
     * @since 2.0.0
     */
    String type = "Vehicle";

    /**
     * An optional field that can be set to specify the components the vehicle is built from.
     * Defaults to an empty list if not set.
     * @since 2.0.0
     */
    ArrayList<Component> builtFrom = new ArrayList<Component>();

    /**
     * Creates a new VehicleBuilder for constructing a vehicle.
     * Type and components can be customized via their setter methods.
     * Doesn't require any parameters since all attributes are optional.
     *
     * @since 2.0.0
     */
    public VehicleBuilder()
    {
        // No required attributes for Vehicle class
    }

    /**
     * Sets the type of the vehicle. Defaults to "Vehicle" if not called.
     *
     * @param type The type of the vehicle (e.g., "Car", "Truck", "Train").
     * @return This builder for method chaining.
     * @since 2.0.0
     */
    public VehicleBuilder type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Adds a single component to the vehicle. Can be called multiple times to add multiple components.
     *
     * @param component The component to add to the vehicle.
     * @return This builder for method chaining.
     * @since 2.0.0
     */
    public VehicleBuilder component(Component component)
    {
        this.builtFrom.add(component);
        return this;
    }

    /**
     * Sets the full list of components the vehicle is built from, replacing any previously added components.
     *
     * @param builtFrom The list of components that the vehicle is built from.
     * @return This builder for method chaining.
     * @since 2.0.0
     */
    public VehicleBuilder components(ArrayList<Component> builtFrom)
    {
        this.builtFrom = new ArrayList<Component>(builtFrom);
        return this;
    }

    /**
     * Constructs and returns the Vehicle.
     *
     * @return A new Vehicle with the configured properties.
     * @since 2.0.0
     */
    public Vehicle build()
    {
        return new Vehicle(this);
    }
}