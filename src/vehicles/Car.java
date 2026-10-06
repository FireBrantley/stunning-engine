package src.vehicles;

/**
 * Represents a car, which is a specific type of vehicle.
 * This class extends the Vehicle class and adds attributes specific to cars,
 * such as brand, model, year, and mileage.
 * 
 * @author FireBrantley
 * @version 2.0.0
 * @since 1.3.0
 */
public class Car extends Vehicle
{
    /**
     * The current year, used as the default model year for new cars.
     * @since 1.3.0
     */
    static int currentYear = java.time.Year.now().getValue();

    /**
     * The brand of the car (e.g., "Toyota", "Ford").
     * @since 1.3.0
     */
    private String brand;

    /**
     * The model of the car (e.g., "Corolla", "Mustang").
     * @since 1.3.0
     */
    private String model;

    /**
     * The model year of the car.
     * @since 1.3.0
     */
    private int year;

    /**
     * The number of miles the car has been driven.
     * @since 1.3.0
     */
    private int miles;

    /**
     * Package-private constructor used by CarBuilder to create Car instances.
     * This constructor should not be called directly; use {@link CarBuilder}
     * to construct Car instances.
     *
     * @param builder The CarBuilder containing the car configuration.
     * @since 2.0.0
     */
    Car(CarBuilder builder)
    {
        super(builder);
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.miles = builder.miles;
    }

    /**
     * Returns a string representation of the car.
     * Including its brand, model, year, and mileage, along with
     * the type and components from the parent class.
     *
     * @return A string representation of the car.
     * @since 1.3.0
     */
    @Override
    public String toString()
    {
        return super.toString() + "\nBrand: " + brand + 
        "\nModel: " + model + "\nYear: " + year + "\nMiles: " + miles;
    }
}
