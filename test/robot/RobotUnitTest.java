package robot;

import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static robot.Direction.*;
import static robot.Instruction.*;
import static robot.RoadBookCalculator.calculateRoadBook;

public class RobotUnitTest {
    private UnlandedRobotException obj;

    @Test
    public void testgetXposition()
    {
        boolean isLanded = true;
        Assert.assertFalse(""+obj,isLanded);
    }



}
