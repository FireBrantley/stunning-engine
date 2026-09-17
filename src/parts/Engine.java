package src.parts;

public class Engine extends Parts
{
    private String variant;
    private boolean electric;
    
    public Engine(boolean electric, String variant)
    {
        super("Engine");
        this.variant = variant;
        this.electric = electric;
    }

    public String toString()
    {
        return super.toString() + "\nVariant: " + variant + "\nElectric? " + electric;
    }

    public String summary()
    {
        return variant + " engine";
    }

}
