package additionalProgramsTest;

import additionalPrograms.UniqueWords;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;



public class UniqueWordsTest {
    @Test
    public void isUniqueWordsTest()
    {

        Assert.assertEquals(6, UniqueWords.isUniqueWords("This is a sample string and string have characters"));
        //Failure
        Assert.assertNotEquals(3, UniqueWords.isUniqueWords("shiva"));
        //Edge case
        Assert.assertEquals(0,UniqueWords.isUniqueWords(""));

    }
}