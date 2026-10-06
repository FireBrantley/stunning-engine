package src.vehicles;

import java.util.ArrayList;

import src.components.Component;

/**
 * Builder class for constructing {@link Car} instances.
 * This class follows the Builder design pattern, allowing for flexible and readable car creation.
 * It extends {@link VehicleBuilder}, so the inherited methods are overridden to return
 * a CarBuilder, which keeps method chaining working in any order.
 *
 * <p>Example:
 * <pre>{@code
 * Car car = new CarBuilder()
 *     .brand("Toyota")
 *     .model("Corolla")
 *     .year(2022)
 *     .miles(15000)
 *     .component(wheel)
 *     .build();
 * }</pre>
 *
 * @version 2.0.0
 * @since 2.0.0
 */
public class CarBuilder extends VehicleBuilder
{
    /**
     * An optional field that can be set to customize the car's brand.
     * Defaults to "Unknown" if not set.
     * @since 2.0.0
     */
    String brand = "Unknown";

    /**
     * An optional field that can be set to customize the car's model.
     * Defaults to "Unknown" if not set.
     * @since 2.0.0
     */
    String model = "Unknown";

    /**
     * An optional field that can be set to customize the car's model year.
     * Defaults to the current year if not set.
     * @since 2.0.0
     */
    int year = Car.currentYear;

    /**
     * An optional field that can be set to customize the car's mileage.
     * Defaults to 0 if not set.
     * @since 2.0.0
     */
    int miles = 0;

    /**
     * Creates a new CarBuilder for constructing a car.
     * The vehicle type defaults to "Car". All other attributes can be
     * customized via their setter methods.
     * Doesn't require any parameters since all attributes are optional.
     *
     * @since 2.0.0
     */
    public CarBuilder()
    {
        this.type = "Car";
    }

    /**
     * Sets the brand of the car. Defaults to "Unknown" if not called.
     *
     * @param brand The brand of the car (e.g., "Toyota", "Ford").
     * @return This builder for method chaining.
     * @since 2.0.0
     */
    public CarBuilder brand(String brand)
    {
        this.brand = brand;
        return this;
    }

    /**
     * Sets the model of the car. Defaults to "Unknown" if not called.
     *
     * @param model The model of the car (e.g., "Corolla", "Mustang").
     * @return This builder for method chaining.
     * @since 2.0.0
     */
    public CarBuilder model(String model)
    {
        this.model = model;
        return this;
    }

    /**
     * Sets the model year of the car. Defaults to the current year if not called.
     *
     * @param year The model year of the car.
     * @return This builder for method chaining.
     * @since 2.0.0
     */
    public CarBuilder year(int year)
    {
        this.year = year;
        return this;
    }

    /**
     * Sets the mileage of the car. Defaults to 0 if not called.
     *
     * @param miles The number of miles the car has been driven.
     * @return This builder for method chaining.
     * @since 2.0.0
     */
    public CarBuilder miles(int miles)
    {
        this.miles = miles;
        return this;
    }

    /**
     * Sets the type of the vehicle. Defaults to "Car" if not called.
     *
     * @param type The type of the vehicle.
     * @return This builder for method chaining.
     * @deprecated A car's type should always be "Car", so there is no need to set it.
     * @since 2.0.0
     */
    @Deprecated
    @Override
    public CarBuilder type(String type)
    {
        super.type(type);
        return this;
    }

    /**
     * Adds a single component to the car. Can be called multiple times to add multiple components.
     *
     * @param component The component to add to the car.
     * @return This builder for method chaining.
     * @since 2.0.0
     */
    @Override
    public CarBuilder component(Component component)
    {
        super.component(component);
        return this;
    }

    /**
     * Sets the full list of components the car is built from, replacing any previously added components.
     *
     * @param builtFrom The list of components that the car is built from.
     * @return This builder for method chaining.
     * @since 2.0.0
     */
    @Override
    public CarBuilder components(ArrayList<Component> builtFrom)
    {
        super.components(builtFrom);
        return this;
    }

    /**
     * Constructs and returns the Car.
     *
     * @return A new Car with the configured properties.
     * @since 2.0.0
     */
    @Override
    public Car build()
    {
        return new Car(this);
    }
}
