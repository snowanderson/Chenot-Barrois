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

public class RobotUnitTest {
    private UnlandedRobotException obj;
    Robot robot;
    LandSensor ls;
    Random rand;

//    @Before
//    public void init(){
//
//        rand = Mockito.mock(Random.class);
//        Mockito.when(rand.nextInt(Land.CountLand())).thenReturn(0);
//        ls = new LandSensor(rand);
//    }

    @Test (expected = UnlandedRobotException.class)
    public void testgetXposition() throws UnlandedRobotException {
        robot = new Robot(0.0,new Battery());
        robot.getXposition();
    }

    @Test (expected = UnlandedRobotException.class)
    public void testgetYposition() throws UnlandedRobotException {
        robot = new Robot(0.0,new Battery());
        robot.getYposition();
    }

}
