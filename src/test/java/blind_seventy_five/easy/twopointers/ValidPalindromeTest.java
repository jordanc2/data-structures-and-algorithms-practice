package blind_seventy_five.easy.twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    private String test;

    @Test
    void isPalindrome_givenAStringThatIsAPalindrome_returnsTrue() {
        // GIVEN
        test = "A man, a plan, a canal: Panama";

        // WHEN
        ValidPalindrome o = new ValidPalindrome();
        boolean result = o.isPalindrome(test);

        // THEN
        assertTrue(result);
    }

    @Test
    void isPalindrome_givenAStringThatIsNotAPalindrome_returnsFalse() {
        // GIVEN
        test = "race a car";

        // WHEN
        ValidPalindrome o = new ValidPalindrome();
        boolean result = o.isPalindrome(test);

        // THEN
        assertFalse(result);
    }

    @Test
    void isPalindrome_givenAnEmptyString_returnsTrue() {
        // GIVEN
        test = " ";

        // WHEN
        ValidPalindrome o = new ValidPalindrome();
        boolean result = o.isPalindrome(test);

        // THEN
        assertTrue(result);
    }

    @Test
    void isPalindromeStringBuilderSolution_givenAStringThatIsAPalindrome_returnsTrue() {
        // GIVEN
        test = "A man, a plan, a canal: Panama";

        // WHEN
        ValidPalindrome o = new ValidPalindrome();
        boolean result = o.isPalindromeStringBuilderSolution(test);

        // THEN
        assertTrue(result);
    }

    @Test
    void isPalindromeStringBuilderSolution_givenAStringThatIsNotAPalindrome_returnsFalse() {
        // GIVEN
        test = "race a car";

        // WHEN
        ValidPalindrome o = new ValidPalindrome();
        boolean result = o.isPalindromeStringBuilderSolution(test);

        // THEN
        assertFalse(result);
    }

    @Test
    void isPalindromeStringBuilderSolution_givenAnEmptyString_returnsTrue() {
        // GIVEN
        test = " ";

        // WHEN
        ValidPalindrome o = new ValidPalindrome();
        boolean result = o.isPalindromeStringBuilderSolution(test);

        // THEN
        assertTrue(result);
    }
}