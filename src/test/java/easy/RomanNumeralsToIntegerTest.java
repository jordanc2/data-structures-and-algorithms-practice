package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsToIntegerTest {

    private String testString;

    @Test
    void romanToInt_romanNumeralsIII_returnsInt3() {
        //  GIVEN
        testString = "III";

        //  WHEN
        RomanNumeralsToInteger romanNumeralsToInteger = new RomanNumeralsToInteger();
        int result = romanNumeralsToInteger.romanToInt(testString);

        //  THEN
        assertEquals(3, result, "An Integer with value 3 was expected.");
    }

    @Test
    void romanToInt_romanNumeralsLVIII_returnsInt58() {
        //  GIVEN
        testString = "LVIII";

        //  WHEN
        RomanNumeralsToInteger romanNumeralsToInteger = new RomanNumeralsToInteger();
        int result = romanNumeralsToInteger.romanToInt(testString);

        //  THEN
        assertEquals(58, result, "An Integer with value 58 was expected.");
    }

    @Test
    void romanToInt_romanNumeralsMCMXCIV_returnsInt1994() {
        //  GIVEN
        testString = "MCMXCIV";

        //  WHEN
        RomanNumeralsToInteger romanNumeralsToInteger = new RomanNumeralsToInteger();
        int result = romanNumeralsToInteger.romanToInt(testString);

        //  THEN
        assertEquals(1994, result, "An Integer with value 3 was expected.");
    }
}