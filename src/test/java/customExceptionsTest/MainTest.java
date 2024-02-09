package customExceptionsTest;

import customExceptions.Main;
import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    Main m = new Main();
    @Test
    public   void succesFullTestCase()
    {
        Assert.assertTrue(m.withDrawlStatus(100.05));
        Assert.assertEquals(4899.95,m.getCurrentBalance(), 0.001);
    }

    @Test
    public void testExceptionInvalidWithDrawl()
    {
        Exception e = Assert.assertThrows(RuntimeException.class,
                () -> m.withDrawlStatus(-100.23));
        Assert.assertEquals("Attempting to withdraw a negative amount.",e.getCause().getMessage());
    }
    @Test
    public void testExceptionInsufficientWithDrawl()
    {
        Exception e = Assert.assertThrows(RuntimeException.class,
                () -> m.withDrawlStatus(6000000));
        Assert.assertEquals("Attempting to withdraw more money than the account balance.",e.getCause().getMessage());
    }

}
