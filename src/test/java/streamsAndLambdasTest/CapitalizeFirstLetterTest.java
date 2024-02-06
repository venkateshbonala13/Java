package streamsAndLambdasTest;

import org.junit.Test;
import streamsAndLambdas.CapitalizeFirstLetter;

import java.util.List;
import static org.junit.Assert.assertEquals;

public class CapitalizeFirstLetterTest {

    @Test
    public void testCapitalizeAndSort() {
        String[] strings = {"ford", "audi", "bmw", "toyota", "honda"};
        List<String> result = CapitalizeFirstLetter.capitalizeAndSort(strings);

        List<String> expected = List.of("Audi", "Bmw", "Ford", "Honda", "Toyota");

        assertEquals(expected, result);
    }
}