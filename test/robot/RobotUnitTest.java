package robot;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.Before;
import org.mockito.Mockito;
import java.util.Random;

import java.util.ArrayList;

import static junit.framework.Assert.*;
import static robot.Direction.*;
import static robot.Instruction.*;
import static robot.RoadBookCalculator.calculateRoadBook;
import robot.UnlandedRobotException;

public class RobotUnitTest
{
    Robot robot;

    @Test
    public void testGetPosition() throws UnlandedRobotException {
        robot = new Robot(0.0,new Battery());
        robot.land(new Coordinates(0, 0), new LandSensor(new Random()));
        Assert.assertEquals(0, robot.getXposition());
        Assert.assertEquals(0, robot.getYposition());

    }

    @Test
    public void testGetDirection() throws UnlandedRobotException
    {
        robot = new Robot(0.0,new Battery());
        robot.land(new Coordinates(0, 0), new LandSensor(new Random()));
        Assert.assertTrue(robot.getDirection()==NORTH);
    }


    @Test
    public void testMoveForward() throws Exception {
        robot = new Robot(0.0,new Battery());
        robot.land(new Coordinates(0,0),new LandSensor(new Random()));
        robot.moveForward();
        Assert.assertEquals(0,robot.getXposition());
        Assert.assertEquals(1,robot.getYposition());
    }

    @Test
    public void testMoveBackward() throws LandSensorDefaillance, UnlandedRobotException, InsufficientChargeException, InaccessibleCoordinate {
        robot = new Robot(0.0,new Battery());
        robot.land(new Coordinates(0,0),new LandSensor(new Random()));
        robot.moveBackward();
        Assert.assertEquals(0,robot.getXposition());
        Assert.assertEquals(-1,robot.getYposition());

    }

    @Test
    public void testTurnLeft() throws Exception {
        robot = new Robot(0.0,new Battery());
        robot.land(new Coordinates(0,0),new LandSensor(new Random()));
        Assert.assertEquals(Direction.NORTH,robot.getDirection());
        robot.turnLeft();
        Assert.assertEquals(Direction.WEST,robot.getDirection());
        robot.turnLeft();
        Assert.assertEquals(Direction.SOUTH,robot.getDirection());
        robot.turnLeft();
        Assert.assertEquals(Direction.EAST,robot.getDirection());
        robot.turnLeft();
        Assert.assertEquals(Direction.NORTH,robot.getDirection());
    }

    @Test
    public void testTurnRight() throws Exception {
        robot = new Robot(0.0,new Battery());
        robot.land(new Coordinates(0,0),new LandSensor(new Random()));
        Assert.assertEquals(Direction.NORTH, robot.getDirection());
        robot.turnRight();
        Assert.assertEquals(Direction.EAST, robot.getDirection());
        robot.turnRight();
        Assert.assertEquals(Direction.SOUTH, robot.getDirection());
        robot.turnRight();
        Assert.assertEquals(Direction.WEST, robot.getDirection());
        robot.turnRight();
        Assert.assertEquals(Direction.NORTH,robot.getDirection());
    }

    @Test
    public void testComputedTo() throws Exception
    {
        robot = new Robot(0.0,new Battery());
        robot.land(new Coordinates(0,0),new LandSensor(new Random()));
        robot.computeRoadTo(new Coordinates(0,2));
        robot.letsGo();
        Assert.assertEquals(0,robot.getXposition());
        Assert.assertEquals(2,robot.getYposition());
    }

}

