package robot;

public class LandSensorDefaillance extends Exception
{
    public LandSensorDefaillance()
    {
        super("Impossible de détecter le type de terrain à ces coordonnées.");
    }

}
