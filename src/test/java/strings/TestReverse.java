package strings;

import org.junit.Assert;
import org.junit.Assert;
import org.junit.jupiter.api  .Test;
import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestReverse {
    @org.junit.Test
    public void TestReverse()

    {
        Reverse r = new Reverse();
        String out =r.reverseEachWordOfString("Java J2EE Reverse Me");
        Assert.assertEquals("","avaJ EE2J esreveR eM","avaJ EE2J esreveR eM");
    }
    @org.junit.Test
    public void TestReverse1()

    {
        Reverse r1 = new Reverse();
        String out =r1.reverseEachWordOfString("Venky");
        Assert.assertNotEquals("","yineV","ykneV");
    }
}