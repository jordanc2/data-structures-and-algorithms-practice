package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckForPalindromeTest {

    private String test;

    @Test
    void isAPalindrome_palindromeString_returnsTrue() {
        //  GIVEN
        test = "reviver";

        //  WHEN
        CheckForPalindrome palindrome = new CheckForPalindrome();
        boolean result = palindrome.isAPalindrome(test);

        //  THEN
        assertTrue(result, "When provided a palindrome, a true result is expected");
    }

    @Test
    void isAPalindrome_oneCharacterString_returnsTrue() {
        //  GIVEN
        test = "a";

        //  WHEN
        CheckForPalindrome palindrome = new CheckForPalindrome();
        boolean result = palindrome.isAPalindrome(test);

        //  THEN
        assertTrue(result, "When provided a single character, a true result is expected");
    }

    @Test
    void isAPalindrome_nonPalindromeString_returnsFalse() {
        //  GIVEN
        test = "ironman";

        //  WHEN
        CheckForPalindrome palindrome = new CheckForPalindrome();
        boolean result = palindrome.isAPalindrome(test);

        //  THEN
        assertFalse(result, "When given a non palindrome string, a false result is expected.");
    }
}