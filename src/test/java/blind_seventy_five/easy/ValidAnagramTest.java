package blind_seventy_five.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    private String test_String_One;
    private String test_String_Two;

    @Test
    void isValidAnagram_givenTwoValidStringsThatAreAnagrams_returnsTrue() {
        // GIVEN
        test_String_One = "players";
        test_String_Two = "parsley";

        // WHEN
        ValidAnagram validAnagram = new ValidAnagram();
        boolean result = validAnagram.isValidAnagram(test_String_One, test_String_Two);

        // THEN
        assertTrue(result);
    }

    @Test
    void isValidAnagram_givenTwoValidStringsThatAreNotAnagrams_returnsFalse() {
        // GIVEN
        test_String_One = "rat";
        test_String_Two = "cat";

        // WHEN
        ValidAnagram validAnagram = new ValidAnagram();
        boolean result = validAnagram.isValidAnagram(test_String_One, test_String_Two);

        // THEN
        assertFalse(result);
    }

    @Test
    void isValidAnagram_givenTwoValidStringsThatAreDifferentLengths_returnsFalse() {
        // GIVEN
        test_String_One = "racecar";
        test_String_Two = "racercar";

        // WHEN
        ValidAnagram validAnagram = new ValidAnagram();
        boolean result = validAnagram.isValidAnagram(test_String_One, test_String_Two);

        // THEN
        assertFalse(result);
    }
}