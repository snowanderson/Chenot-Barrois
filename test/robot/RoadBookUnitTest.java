package robot;

import junit.framework.Assert;
import org.junit.Test;

import java.util.*;

public class RoadBookUnitTest {

    @Test
    public void testHasInstruction()
    {
        List<Instruction> liste = new ArrayList<Instruction>();
        liste.add(Instruction.FORWARD);
        RoadBook book = new RoadBook(liste);
        Assert.assertTrue(book.hasInstruction());
    }

    @Test
    public void testNext()
    {
        List<Instruction> liste = new ArrayList<Instruction>();
        liste.add(Instruction.FORWARD);
        RoadBook book = new RoadBook(liste);
        Assert.assertEquals(Instruction.FORWARD,book.next());
    }

}
