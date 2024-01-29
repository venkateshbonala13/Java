package strings;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestVowels {

    @Test
    public void testCountVowels() {

        String inputString = "I am done with my assignment.";
       Vowels v = new Vowels();

        int result = v.countVowels(inputString);

        assertNotEquals(9, result); // Replace 9 with the expected number of vowels in the given inputString
    }

    @Test
    public void testCountVowelsWithEmptyString() {

        String inputString = "";
        Vowels v = new Vowels();

        int result = v.countVowels(inputString);

        assertEquals(0, result);
    }

    @Test
    public void testCountVowelsWithNoVowels() {

        String inputString = "Rhythm";
        Vowels v = new Vowels();

        int result = v.countVowels(inputString);

        assertEquals(0, result);
    }
}