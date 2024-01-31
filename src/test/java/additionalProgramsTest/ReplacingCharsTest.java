package additionalProgramsTest;

import additionalPrograms.ReplacingChars;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ReplacingCharsTest {

    @Test
    public void testReplaceCase() {
        assertEquals("HeLlO WoRlD", ReplacingChars.replaceCase("hElLo wOrLd"));
        assertEquals("123!@#", ReplacingChars.replaceCase("123!@#"));
        assertEquals("aBcDeF", ReplacingChars.replaceCase("AbCdEf"));
        assertEquals("g", ReplacingChars.replaceCase("G"));
        assertNotEquals("h", ReplacingChars.replaceCase("h"));
        assertEquals("", ReplacingChars.replaceCase(""));
        assertNotEquals("MavEN", ReplacingChars.replaceCase("MAVEN"));
    }
}