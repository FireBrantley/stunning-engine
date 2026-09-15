public class Engine extends Parts
{
    String variant;
    boolean electric;
    
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
}
