package streamsAndLambdasTest;

import org.junit.Test;
import streamsAndLambdas.VowelFinder;

import java.util.List;
import static org.junit.Assert.assertEquals;

public class VowelFinderTest {

    @Test
    public void testFindStringsWithVowels() {
        String[] strings = {"apple", "banana", "cat", "dog", "elephant"};

        List<String> result = VowelFinder.findStringsWithVowels(strings);

        assertEquals("apple", result.get(0));
        assertEquals("banana", result.get(1));
        assertEquals("cat", result.get(2));
        assertEquals("dog", result.get(3));
        assertEquals("elephant", result.get(4));
    }

    @Test
    public void testCountVowels() {
        assertEquals(2, VowelFinder.countVowels("hello"));
        assertEquals(3, VowelFinder.countVowels("programming"));
        assertEquals(1 , VowelFinder.countVowels("axyz"));
        assertEquals(0, VowelFinder.countVowels("wxyz"));
    }
}