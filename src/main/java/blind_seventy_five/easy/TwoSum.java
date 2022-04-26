package blind_seventy_five.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target,
 *      return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 */
public class TwoSum {

    public int[] findTwoSum(int[] nums, int target) {
      /*
      * Make a Map to hold the resulting index(es) and values that add up to the target
      * Iterate through the array
      * Hold a complement variable called ** int complement = target - current[i] **
      * Check to see if the complement is already in the Map
      *     - if so, return those two indexes
      *     - if not, put that index in the Map and continue iterating
      * If no match, return null
      */
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
          int complement = target - nums[i];
          if (map.containsKey(complement)) {
              return new int[]{map.get(complement), i};
          }
          map.put(nums[i], i);
        }
        return null;
    }
}
