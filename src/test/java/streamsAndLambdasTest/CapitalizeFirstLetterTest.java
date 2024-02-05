package streamsAndLambdasTest;

import org.junit.jupiter.api.Test;
import streamsAndLambdas.CapitalizeFirstLetter;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

 public class CapitalizeFirstLetterTest {

    @Test
    public void testCapitalizeAndSort() {
        String[] strings = {"mazda", "toyota", "honda", "chevy", "dodge"};
        List<String> expected = Arrays.asList("Chevy", "Dodge", "Honda", "Mazda", "Toyota");

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        CapitalizeFirstLetter.main(new String[]{});

        List<String> result = Arrays.stream(outContent.toString().split(System.lineSeparator()))
                .collect(Collectors.toList());


        expected = expected.stream().sorted().collect(Collectors.toList());
        result = result.stream().sorted().collect(Collectors.toList());

        assertEquals(expected, result);
    }
}