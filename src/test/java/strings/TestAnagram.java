package strings;

import org.junit.Assert;
import org.junit.jupiter.api  .Test;
import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestAnagram{
    //anagramStrings anagramStrings=new anagramStrings();

    @Test
    public void testAreAnagrams() {
        Anagram a= new Anagram();
        Assert.assertTrue(a.areAnagrams("listen", "silent"));
        Assert.assertTrue(a.areAnagrams("triangle", "integral"));
        Assert.assertTrue(a.areAnagrams("Dormitory", "Dirty Room"));
    }

    @Test
    public void testNotAnagrams() {
        assertFalse(Anagram.areAnagrams("hello", "world"));
        assertFalse(Anagram.areAnagrams("abc", "def"));
        assertFalse(Anagram.areAnagrams("Anagram", "NotAnagram"));
    }

    @Test
    public void testAnagramsIgnoreCase() {
        Assert.assertTrue(Anagram.areAnagrams("State", "Taste"));
        Assert.assertTrue(Anagram.areAnagrams("Car", "Rac"));
        Assert.assertTrue(Anagram.areAnagrams("Eleven plus two", "Twelve plus one"));
    }

    @Test
    public void testEmptyStrings() {
        Assert.assertTrue(Anagram.areAnagrams("", ""));
    }

    @Test
    public void testSpacesOnly() {
        Assert.assertTrue(Anagram.areAnagrams("   ", "   "));
    }

}