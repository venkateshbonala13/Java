package additionalProgramsTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import additionalPrograms.Swapping;
import org.junit.Test;

public class SwappingTest {

    @Test
    public void testSwapWithoutTemp() {
        int a = 5;
        int b = 10;

        Swapping.swapWithoutTemp(a, b);

        assertEquals(10, 10);
        assertEquals(5, 5);

    }
}