package blind_seventy_five.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array of numbers, return true if any value appears at least twice in the array,
 *      and return false if every element is distinct.
 */
public class ContainsDuplicate {

    public boolean containsDuplicates(int[] nums) {
        /*
        * Create a Set to hold each element in the array
        * Iterate over the array
        * Check if element in the Set
        *       If so, return TRUE;
        *       If not, add element to the set
        * return False;
        */
        Set<Integer> set = new HashSet<>();

        for (Integer i : nums) {
            if (set.contains(i)) {
                return true;
            }
            set.add(i);
        }
        return false;
    }
}
