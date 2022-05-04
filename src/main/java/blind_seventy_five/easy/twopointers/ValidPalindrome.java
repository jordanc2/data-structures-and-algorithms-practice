package blind_seventy_five.easy.twopointers;

/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all
 *      non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters
 *      and numbers.
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 */
public class ValidPalindrome {

    public boolean isPalindrome(String s) {
         /*
            convert string to lowercase ** s.toLowerCase() **
            remove all non-alphanumeric chars
            check if string is empty, return true
            create two variables, one for the start of the string
                one for the end of the string
            while start is less than end compare the two chars
                if the two chars are not equal return false.
                else increment start++ and decrement end--
            return true;
        */
        String copy = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        if (copy.isBlank()) {
            return true;
        }

        int start = 0;
        int end = copy.length() - 1;

        while(start < end) {
            if (copy.charAt(start) != copy.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public boolean isPalindromeStringBuilderSolution(String s) {
        /*
        * Solution uses a StringBuilder
        * Instantiate a new StringBuilder object
        * Iterate over the string
        * If the current index is letter or digit ** Character.isLetterOrDigit(i) **
        *       append the char at the index to the StringBuilder object
        * Set the StringBuilder object to a new StringBuilder object - replacing the spaces and convert to lowercase
        * Create a new String variable and assign it the second StringBuilder object
        * Return the comparison of the new String variable to StringBuilder object(reversed)
        */
        StringBuilder content = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                content.append(s.charAt(i));
            }
        }
        content = new StringBuilder(content.toString().replace(" ", "").toLowerCase());
        String value = content.toString();
        return value.equals(content.reverse().toString());
    }
}
