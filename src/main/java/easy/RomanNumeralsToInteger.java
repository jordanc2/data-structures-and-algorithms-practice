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
            if (i != n -1 && roman.get(string.charAt(i)) < roman.get(string.charAt(i + 1))) {
                result += roman.get(string.charAt(i + 1)) - roman.get(string.charAt(i));
                i++;
            } else {
                result += roman.get(string.charAt(i));
            }
        }
        return result;
    }
}
