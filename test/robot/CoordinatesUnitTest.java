package robot;

import junit.framework.Assert;
import org.junit.Test;

public class CoordinatesUnitTest
{
    Coordinates coordonnees;

    @Test
    public void testGetX()
    {
        coordonnees = new Coordinates(0,0);
        Assert.assertEquals(0,coordonnees.getX());
    }

    @Test
    public void testGetY()
    {
        coordonnees = new Coordinates(0,0);
        Assert.assertEquals(0,coordonnees.getY());
    }

}
