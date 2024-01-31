package additionalProgramsTest;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import additionalPrograms.Palindrome;
import org.junit.Test;

public class PalindromeTest {

    @Test
    public void testPalindrome() {
        assertFalse(Palindrome.isPalindrome(-121));
        assertTrue(Palindrome.isPalindrome(55555));
        assertTrue(Palindrome.isPalindrome(1001));
        assertFalse(Palindrome.isPalindrome(0));
        assertFalse(Palindrome.isPalindrome(123));
        assertTrue(Palindrome.isPalindrome(123454321));
        assertFalse(Palindrome.isPalindrome(123210));
    }
}