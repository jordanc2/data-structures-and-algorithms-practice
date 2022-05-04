package blind_seventy_five.medium.arraysandhashing;

import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupTheAnagrams(String[] strs) {
        /*
        * Initialize a new HashMap to store the sorted String as a key and its value the list of Strings that are
        *       anagrams containing the same letters as the key
        * Iterate through the passed array of Strings
        *       - For each string, convert to char array
        *       - Sort that char array
        *       - Then, convert back to a String
        *           - If the HashMap contains the sorted String, add the current string to that key's list
        *           - Else, make a new List and add the current string to that key's list
        *
        * HashMap has a method that returns a Collection of all the values in a HashMap
        * Return that passed to a new ArrayList ** new ArrayList<>(map.values()) **
        */
        Map<String, List<String>> map = new HashMap<>();

        for (String originalString : strs) {
            char[] sortedChars = originalString.toCharArray();
            Arrays.sort(sortedChars);
            String sortedString = String.valueOf(sortedChars);

            if (map.containsKey(sortedString)) {
                map.get(sortedString).add(originalString);
            } else {
                map.put(sortedString, new ArrayList<>());
                map.get(sortedString).add(originalString);
            }
        }
        return new ArrayList<>(map.values());
    }
}
