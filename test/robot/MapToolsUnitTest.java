package robot;

import junit.framework.Assert;
import org.junit.Test;

public class MapToolsUnitTest
{
    @Test
    public void testNextForwardPositionNorth() {
        Coordinates posinitiale = new Coordinates(0, 0);
        Coordinates posfinale = MapTools.nextForwardPosition(posinitiale, Direction.NORTH);
        Assert.assertEquals(0, posfinale.getX());
        Assert.assertEquals(1, posfinale.getY());
    }

    @Test
    public void testNextForwardPositionSouth() {
        Coordinates posinitiale = new Coordinates(0, 0);
        Coordinates posfinale = MapTools.nextForwardPosition(posinitiale,Direction.SOUTH);
        Assert.assertEquals(0, posfinale.getX());
        Assert.assertEquals(-1, posfinale.getY());
    }

    @Test
    public void testNextForwardPositionEast() {
        Coordinates posinitiale = new Coordinates(0, 0);
        Coordinates posfinale = MapTools.nextForwardPosition(posinitiale,Direction.EAST);
        Assert.assertEquals(1, posfinale.getX());
        Assert.assertEquals(0, posfinale.getY());
    }

    @Test
    public void testNextForwardPositionWest() {
        Coordinates posinitiale = new Coordinates(0, 0);
        Coordinates posfinale = MapTools.nextForwardPosition(posinitiale,Direction.WEST);
        Assert.assertEquals(-1, posfinale.getX());
        Assert.assertEquals(0, posfinale.getY());
    }

    @Test
    public void testNextBackwardPositionNorth() {
        Coordinates posinitiale = new Coordinates(0, 0);
        Coordinates posfinale = MapTools.nextBackwardPosition(posinitiale, Direction.NORTH);
        Assert.assertEquals(0, posfinale.getX());
        Assert.assertEquals(-1, posfinale.getY());
    }

    @Test
    public void testNextBackwardPositionSouth() {
        Coordinates posinitiale = new Coordinates(0, 0);
        Coordinates posfinale = MapTools.nextBackwardPosition(posinitiale, Direction.SOUTH);
        Assert.assertEquals(0, posfinale.getX());
        Assert.assertEquals(1, posfinale.getY());
    }

    @Test
    public void testNextBackwardPositionWest() {
        Coordinates posinitiale = new Coordinates(0, 0);
        Coordinates posfinale = MapTools.nextBackwardPosition(posinitiale, Direction.WEST);
        Assert.assertEquals(1, posfinale.getX());
        Assert.assertEquals(0, posfinale.getY());
    }

    @Test
    public void testNextBackwardPositionEast() {
        Coordinates posinitiale = new Coordinates(0, 0);
        Coordinates posfinale = MapTools.nextBackwardPosition(posinitiale, Direction.EAST);
        Assert.assertEquals(-1, posfinale.getX());
        Assert.assertEquals(0, posfinale.getY());
    }


}
