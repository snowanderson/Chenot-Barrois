package robot;

import junit.framework.Assert;
import org.junit.Test;

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
    public void testNextBackwardPositionEast() {
        Coordinates posinitiale = new Coordinates(0, 0);
        Coordinates posfinale = MapTools.nextBackwardPosition(posinitiale, Direction.EAST);
        Assert.assertEquals(-1, posfinale.getX());
        Assert.assertEquals(0, posfinale.getY());
    }

    @Test
    public void testNextBackwardPositionWest() {
        Coordinates posinitiale = new Coordinates(0, 0);
        Coordinates posfinale = MapTools.nextBackwardPosition(posinitiale, Direction.WEST);
        Assert.assertEquals(1, posfinale.getX());
        Assert.assertEquals(0, posfinale.getY());
    }

    @Test
    public void testCounterclockwise1()
    {
        Direction direction = Direction.NORTH;
        Assert.assertEquals(Direction.WEST, MapTools.counterclockwise(direction));
    }


    @Test
    public void testCounterclockwise2()
    {
        Direction direction = Direction.WEST;
        Assert.assertEquals(Direction.SOUTH, MapTools.counterclockwise(direction));
    }

    @Test
    public void testCounterclockwise3()
    {
        Direction direction = Direction.SOUTH;
        Assert.assertEquals(Direction.EAST, MapTools.counterclockwise(direction));
    }

    @Test
    public void testCounterclockwise4()
    {
        Direction direction = Direction.EAST;
        Assert.assertEquals(Direction.NORTH, MapTools.counterclockwise(direction));
    }

    @Test
    public void testClockwise1()
    {
        Direction direction = Direction.NORTH;
        Assert.assertEquals(Direction.EAST, MapTools.clockwise(direction));
    }

    @Test
    public void testClockwise2()
    {
        Direction direction = Direction.EAST;
        Assert.assertEquals(Direction.SOUTH, MapTools.clockwise(direction));
    }

    @Test
    public void testClockwise3()
    {
        Direction direction = Direction.SOUTH;
        Assert.assertEquals(Direction.WEST, MapTools.clockwise(direction));
    }

    @Test
    public void testClockwise4()
    {
        Direction direction = Direction.WEST;
        Assert.assertEquals(Direction.NORTH, MapTools.clockwise(direction));
    }


}
