package robot;


public class TerrainNonRepertorieException extends Exception {
    public TerrainNonRepertorieException()
    {
        super("Le terrain est de type inconnu");
    }
}
