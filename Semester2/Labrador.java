public class Labrador extends Dog
{
    private String color; //black, yellow, or chocolate?
    private static int breedWeight = 75;

    public Labrador(String name, String color)
    {
        super(name);
        this.color = color;
    }

    // ------------------------------------------------------------
    // Big bark -- overrides speak method in Dog
    // ------------------------------------------------------------
    public String speak()
    {
    return "WOOF";
    }

    // ------------------------------------------------------------
    // Returns weight
    // ------------------------------------------------------------
    public int avgBreedWeight()
    {
    return breedWeight;
    }
}
