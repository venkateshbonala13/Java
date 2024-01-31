package additionalProgramsTest;

import additionalPrograms.ArraySum;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ArraySumTest {

    @Test
    public void testCalculateSum() {
        int[] array = {1, 2, 3, 4, 5};
        int expectedSum = 15;
        assertEquals(expectedSum, ArraySum.calculateSum(array));
    }

    @Test
    public void testEmptyArray() {
        int[] array = {};
        int expectedSum = 0;
        assertEquals(expectedSum, ArraySum.calculateSum(array));
    }

    @Test
    public void testSingleElementArray() {
        int[] array = {7};
        int expectedSum = 7;
        assertEquals(expectedSum, ArraySum.calculateSum(array));
    }

    @Test
    public void testNegativeNumbers() {
        int[] array = {-1, -2, -3, -4, -5};
        int expectedSum = -10;
        assertNotEquals(expectedSum, ArraySum.calculateSum(array));
    }
}
