package blind_seventy_five.easy.arraysandhashing;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 *      typically using all the original letters exactly once.
 */
public class ValidAnagram {

    public boolean isValidAnagram(String s, String t){
        /*
        * Check if both strings are the same size, if not return false
        * Create two Maps, one for each String, to hold each Character and its count ** Map<Character, Integer> **
        * Iterate over String s, adding each character to it's respective Map, increment the count
        * Compare the keyset of mapS with the keyset of mapT, return result
        */
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        // Must be imperative for loop, tried for each loop and failed - 🤷
        for (int i = 0; i < s.length(); i++) {
            mapS.merge(s.charAt(i), 1, Integer::sum);
            mapT.merge(t.charAt(i), 1, Integer::sum);
        }

        for (Character c : mapS.keySet()) {
            if (!mapS.get(c).equals(mapT.get(c))) {
                return false;
            }
        }

        return true;
    }

    public boolean isValidAnagram_UsingOneHashMap(String s, String t) {
        /*
        * Check if both strings are the same length, if not return false
        * Create a Map, to hold the Characters from string s and their count ** Map<Character, Integer> **
        * Iterate over String s, adding each character to the Map and increment the count
        * Iterate over String t, adding each character to the Map and decrementing the count
        * If any value in the keyset is NOT 0, it is not an anagram
        */
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.merge(s.charAt(i), 1, Integer::sum);
            map.merge(t.charAt(i), -1, Integer::sum);
        }

        for (Character c : map.keySet()) {
            if (map.get(c) != 0) {
                return false;
            }
        }
        return true;
    }
}
