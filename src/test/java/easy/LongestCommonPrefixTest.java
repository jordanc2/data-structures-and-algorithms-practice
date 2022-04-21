package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    String[] testArray;

    @Test
    void findLongestCommonPrefix_whenGivenAnArrayOfStrings_returnsTheLongestCommonPrefixOfTheArray() {
        // GIVEN
        testArray = new String[]{"flower","flow","flight"};

        // WHEN
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String result = lcp.findLongestCommonPrefix(testArray);

        // THEN
        assertEquals(result, "fl");
    }

    @Test
    void findLongestCommonPrefix_whenGivenAnArrayOfStrings_returnsAnEmptyStringIfNoLongestCommonPrefixIsFound() {
        // GIVEN
        testArray = new String[]{"dog","racecar","car"};

        // WHEN
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String result = lcp.findLongestCommonPrefix(testArray);

        // THEN
        assertEquals(result, "");
    }

    @Test
    void findLongestCommonPrefix_whenGivenAnEmptyArray_returnsAnEmptyString() {
        // GIVEN
        testArray = new String[0];

        // WHEN
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String result = lcp.findLongestCommonPrefix(testArray);

        // THEN
        assertEquals(result, "");
    }
}