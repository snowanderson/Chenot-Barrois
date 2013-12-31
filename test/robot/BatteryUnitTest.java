package robot;

import junit.framework.Assert;
import org.junit.Test;

public class BatteryUnitTest
{
    @Test
    public void testCharge()
    {
        Battery battery = new Battery();
        battery.charge();
        Assert.assertEquals((float)110,battery.getChargeLevel());
    }

    @Test
    public void testGetChargeLevel()
    {
        Battery battery = new Battery();
        Assert.assertEquals((float)100,battery.getChargeLevel());
    }

    @Test
    public void testUse1() throws InsufficientChargeException {
        Battery battery = new Battery();
        double energy = 20;
        battery.use(energy);
        Assert.assertEquals((float)80,battery.getChargeLevel());

    }

    @Test (expected = InsufficientChargeException.class)
    public void testUse2() throws InsufficientChargeException {
        Battery battery = new Battery();
        double energy = 110;
        battery.use(energy);
    }

    @Test
    public void testTimeToSufficientCharge()
    {
        Battery battery = new Battery();
        double energy = 120;
        Assert.assertEquals(2000,battery.timeToSufficientCharge(energy));
    }

    @Test
    public void testCanDeliver()
    {
        Battery battery = new Battery();
        double energy = 120;
        Assert.assertFalse(battery.canDeliver(energy));
    }




}
