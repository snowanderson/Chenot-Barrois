package robot;

import junit.framework.Assert;
import org.junit.Test;

public class LandUnitTest {

    @Test
    public void testGetLandByOrdinal1() throws TerrainNonRepertorieException {
        int ordinal = 0;
        Assert.assertEquals(Land.Infranchissable, Land.getLandByOrdinal(ordinal));
    }

    @Test
    public void testGetLandByOrdinal2() throws TerrainNonRepertorieException {
        int ordinal = 1;
        Assert.assertEquals(Land.Terre, Land.getLandByOrdinal(ordinal));
    }

    @Test
    public void testGetLandByOrdinal3() throws TerrainNonRepertorieException {
        int ordinal = 2;
        Assert.assertEquals(Land.Roche, Land.getLandByOrdinal(ordinal));
    }

    @Test
    public void testGetLandByOrdinal4() throws TerrainNonRepertorieException {
        int ordinal = 3;
        Assert.assertEquals(Land.Boue, Land.getLandByOrdinal(ordinal));
    }

    @Test
    public void testGetLandByOrdinal5() throws TerrainNonRepertorieException {
        int ordinal = 4;
        Assert.assertEquals(Land.Sable, Land.getLandByOrdinal(ordinal));
    }

    @Test(expected = TerrainNonRepertorieException.class)
    public void testGetLandByOrdinal6() throws TerrainNonRepertorieException {
        int ordinal = 6;
        Land.getLandByOrdinal(ordinal);
    }

    @Test
    public void testCountLand()
    {
        Assert.assertEquals(5,Land.CountLand());
    }
}
