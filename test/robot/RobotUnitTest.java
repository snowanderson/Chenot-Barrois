package robot;

import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.*;
import static robot.Direction.*;
import static robot.Instruction.*;
import static robot.RoadBookCalculator.calculateRoadBook;
import robot.UnlandedRobotException;

public class RobotUnitTest {
    private UnlandedRobotException obj;
    //Robot r;

    @Test//(expected = UnlandedRobotException.class)
    public void testgetXposition()
    {
        boolean isLanded = false;
        Assert.assertFalse(isLanded);

    }

    @Test ()
    public void testgetYposition()
    {
        boolean isLanded = false;
        assertTrue("" + obj, isLanded);
    }

}
