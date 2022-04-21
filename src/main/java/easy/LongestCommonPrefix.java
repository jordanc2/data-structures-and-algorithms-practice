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

        if (array.length == 0) {
            return "";
        }

        String result = array[0];

        for (int i = 0; i < array.length; i++) {
            while (!array[i].startsWith(result)) {
                result = result.substring(0, result.length() - 1);
            }
        }
        return result;
    }
}
