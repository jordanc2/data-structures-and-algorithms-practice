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
}
