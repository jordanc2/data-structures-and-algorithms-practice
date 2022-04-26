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
    void isValidAnagram_givenTwoStringsThatAreDifferentLengths_returnsFalse() {
        // GIVEN
        test_String_One = "racecar";
        test_String_Two = "racercar";

        // WHEN
        ValidAnagram validAnagram = new ValidAnagram();
        boolean result = validAnagram.isValidAnagram(test_String_One, test_String_Two);

        // THEN
        assertFalse(result);
    }

    @Test
    void isValidAnagram_UsingOneHashMap_givenTwoValidStringsThatAreAnagrams_returnsTrue() {
        // GIVEN
        test_String_One = "sadder";
        test_String_Two = "dreads";

        // WHEN
        ValidAnagram validAnagram = new ValidAnagram();
        boolean result = validAnagram.isValidAnagram_UsingOneHashMap(test_String_One, test_String_Two);

        // THEN
        assertTrue(result);
    }

    @Test
    void isValidAnagram_UsingOneHashMap_givenTwoValidStringsThatAreNotAnagrams_returnsFalse() {
        // GIVEN
        test_String_One = "nightly";
        test_String_Two = "nightie";

        // WHEN
        ValidAnagram validAnagram = new ValidAnagram();
        boolean result = validAnagram.isValidAnagram_UsingOneHashMap(test_String_One, test_String_Two);

        // THEN
        assertFalse(result);
    }

    @Test
    void isValidAnagram_UsingOneHashMap_givenTwoStringsThatAreDifferentLengths_returnsFalse() {
        // GIVEN
        test_String_One = "cat";
        test_String_Two = "actor";

        // WHEN
        ValidAnagram validAnagram = new ValidAnagram();
        boolean result = validAnagram.isValidAnagram_UsingOneHashMap(test_String_One, test_String_Two);

        // THEN
        assertFalse(result);
    }
}