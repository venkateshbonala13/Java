package additionalProgramsTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import additionalPrograms.Factorial;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void testCalculateFactorial() {
        assertEquals(1, Factorial.calculateFactorial(0));
        assertEquals(1, Factorial.calculateFactorial(1));
        assertEquals(2, Factorial.calculateFactorial(2));
        assertEquals(6, Factorial.calculateFactorial(3));
        assertEquals(24, Factorial.calculateFactorial(4));
        assertNotEquals(124, Factorial.calculateFactorial(5));
        assertNotEquals(726, Factorial.calculateFactorial(6));
    }
}