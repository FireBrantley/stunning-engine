package src.vehicles;

import java.util.ArrayList;

import src.components.Component;

/**
 * Builder class for constructing {@link Train} instances.
 * This class follows the Builder design pattern, allowing for flexible and readable train creation.
 * It extends {@link VehicleBuilder}, so the inherited methods are overridden to return
 * a TrainBuilder, which keeps method chaining working in any order.
 *
 * <p>Example:
 * <pre>{@code
 * Train train = new TrainBuilder()
 *     .model("Shinkansen")
 *     .component(engine)
 *     .component(wheel)
 *     .build();
 * }</pre>
 *
 * @version 2.0.0
 * @since 2.0.0
 */
public class TrainBuilder extends VehicleBuilder
{
    /**
     * An optional field that can be set to customize the train's model.
     * Defaults to "Unknown" if not set.
     * @since 2.0.0
     */
    String model = "Unknown";

    /**
     * Creates a new TrainBuilder for constructing a train.
     * The vehicle type defaults to "Train". All other attributes can be
     * customized via their setter methods.
     * Doesn't require any parameters since all attributes are optional.
     *
     * @since 2.0.0
     */
    public TrainBuilder()
    {
        this.type = "Train";
    }

    /**
     * Sets the model of the train. Defaults to "Unknown" if not called.
     *
     * @param model The model of the train.
     * @return This builder for method chaining.
     * @since 2.0.0
     */
    public TrainBuilder model(String model)
    {
        this.model = model;
        return this;
    }

    /**
     * Sets the type of the vehicle. Defaults to "Train" if not called.
     *
     * @param type The type of the vehicle.
     * @return This builder for method chaining.
     * @deprecated A train's type should always be "Train", so there is no need to set it.
     * @since 2.0.0
     */
    @Deprecated
    @Override
    public TrainBuilder type(String type)
    {
        super.type(type);
        return this;
    }

    /**
     * Adds a single component to the train. Can be called multiple times to add multiple components.
     *
     * @param component The component to add to the train.
     * @return This builder for method chaining.
     * @since 2.0.0
     */
    @Override
    public TrainBuilder component(Component component)
    {
        super.component(component);
        return this;
    }

    /**
     * Sets the full list of components the train is built from, replacing any previously added components.
     *
     * @param builtFrom The list of components that the train is built from.
     * @return This builder for method chaining.
     * @since 2.0.0
     */
    @Override
    public TrainBuilder components(ArrayList<Component> builtFrom)
    {
        super.components(builtFrom);
        return this;
    }

    /**
     * Constructs and returns the Train.
     *
     * @return A new Train with the configured properties.
     * @since 2.0.0
     */
    @Override
    public Train build()
    {
        return new Train(this);
    }
}