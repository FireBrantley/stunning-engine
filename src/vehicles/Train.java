package src.vehicles;

/**
 * Represents a train vehicle. 
 * This class extends the Vehicle class and adds specific attributes 
 * related to trains, such as its model.
 * 
 * @author FireBrantley
 * @version 2.0.0
 * @since 1.0.0
 */
public class Train extends Vehicle
{
    /**
     * The model of the train.
     * @since 1.0.0
     */
    private String model;

    /**
     * Package-private constructor used by TrainBuilder to create Train instances.
     * This constructor should not be called directly; use {@link TrainBuilder}
     * to construct Train instances.
     *
     * @param builder The TrainBuilder containing the train configuration.
     * @since 2.0.0
     */
    Train(TrainBuilder builder)
    {
        super(builder);
        this.model = builder.model;
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
    @Override
    public String toString()
    {
        return super.toString() + "\nModel: " + model;
    }
}