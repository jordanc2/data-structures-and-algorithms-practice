package easy;

public class CheckForPalindrome {

    public boolean isAPalindrome(String string) {
        int start = 0;
        int end = string.length() - 1;

        if (string.length() == 1) {
            return true;
        }

        while (start < end) {
            if (string.charAt(start) != string.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public boolean isAPalindrome_Recursive(String string) {
        int start = 0;
        int end = string.length() - 1;

        if (string.length() == 1) {
            return true;
        }

        while (start < end) {
            if (string.charAt(start) != string.charAt(end)) {
                return false;
            }
            return isAPalindrome_Recursive(string.substring(start + 1, end));
        }
        return true;
    }
}
