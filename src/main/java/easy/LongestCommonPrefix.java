package easy;

/**
 * When given an array of Strings, find the longest common prefix
 */
public class LongestCommonPrefix {

    /**
     * A function to find the longest common prefix string amongst an array of strings.
     * @param array of Strings
     * @return the String of the longest common prefix, if none exists return ""
     */
    public String findLongestCommonPrefix(String[] array) {

        if (array.length == 0) { /* Null array check, if true, return an empty string */
            return "";
        }

        /* Instantiates the String result and initializes it to the first element of the array */
        String result = array[0];

        /*
        * Imperative for loop to iterate through the 'array' parameter
        *       while the current index does NOT begin with the element stored in result
        *           result is set to a substring ranging from the first char to last checked char
        */
        for (String s : array) {
            while (!s.startsWith(result)) {
                result = result.substring(0, result.length() - 1);
            }
        }
        return result;
    }
}
