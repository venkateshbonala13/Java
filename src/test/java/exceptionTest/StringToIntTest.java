package exceptionTest;
import static org.junit.Assert.assertEquals;

import exceptions.StringToInt;
import org.junit.Test;

public class StringToIntTest {


    @Test
    public void testConvertToIntValidInput() {
        assertEquals(23, StringToInt.convertToInt("23"));
    }

    @Test(expected = NumberFormatException.class)
    public void testConvertToIntInvalidInput() {
        StringToInt.convertToInt("45.67");
    }

    @Test(expected = NumberFormatException.class)
    public void testConvertToIntNonNumericInput() {
        StringToInt.convertToInt("test");
    }

    @Test(expected = NumberFormatException.class)
    public void testConvertToIntAlphaNumericInput() {
        StringToInt.convertToInt("123f");
    }
}