package easy;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeralsToInteger {

    private Map<Character, Integer> roman;

    public RomanNumeralsToInteger() {
        this.roman = new HashMap<>();

        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
    }

    public int romanToInt(String string) {

        int result = 0;
        int n = string.length();

        for (int i = 0; i < n; i++) {
            // If current index is not the last element && the key of the current index is less than
            //      the key of the next index.
            //      -- Subtract the value of the next element from the value of the current element
            //              then add that to the result variable. Continue the iteration.
            //
            // Else, add the value of the current element to the result variable.
            //
            // Return the result.
            if (i != n - 1 && roman.get(string.charAt(i)) < roman.get(string.charAt(i + 1))) {
                result += roman.get(string.charAt(i + 1)) - roman.get(string.charAt(i));
                i++;
            } else {
                result += roman.get(string.charAt(i));
            }
        }
        return result;
    }
}
