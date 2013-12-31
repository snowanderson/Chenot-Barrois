package robot;

import junit.framework.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class LandSensorUnitTest {

    @Test
    public void testGetPointToPointEnergyCoefficient1() throws TerrainNonRepertorieException {
        Random random = new Random();
        Map<Coordinates, Land> carte = new HashMap<Coordinates, Land>();
        Coordinates coordinates1 = new Coordinates(0,1);
        carte.get(coordinates1);
        carte.put(coordinates1,Land.getLandByOrdinal(random.nextInt(Land.CountLand())));
    }

    @Ignore
    @Test(expected = InaccessibleCoordinate.class)
    public void testGetPointToPointEnergyCoefficient2() throws InaccessibleCoordinate, LandSensorDefaillance {
        Random random = new Random();
        Map<Coordinates, Land> carte = new HashMap<Coordinates, Land>();
        Coordinates coordinates1 = new Coordinates(0,1);
        Coordinates coordinates2 = new Coordinates(1,2);
        carte.put(coordinates1,null);
        carte.put(coordinates2,Land.Infranchissable);
        Land terrain1 = carte.get(coordinates1);
        Land terrain2 = Land.Infranchissable;
        LandSensor sensor = new LandSensor(random);
        sensor.getPointToPointEnergyCoefficient(coordinates1,coordinates2);
    }

    @Ignore
    @Test
    public void testGetPointToPointEnergyCoefficient3() throws TerrainNonRepertorieException, InaccessibleCoordinate, LandSensorDefaillance {
        Random random = new Random();
        Map<Coordinates, Land> carte = new HashMap<Coordinates, Land>();
        Coordinates coordinate1 = new Coordinates(0,1);
        Coordinates coordinate2 = new Coordinates(1,2);
        carte.get(coordinate1);
        carte.put(coordinate1,Land.Boue);
        carte.get(coordinate2);
        carte.put(coordinate2,Land.Terre);
        Land terrain1 = carte.get(coordinate1);
        Land terrain2 = carte.get(coordinate2);
        LandSensor sensor = new LandSensor(random);
        Assert.assertEquals(2.5,sensor.getPointToPointEnergyCoefficient(coordinate1,coordinate2));

    }
}
