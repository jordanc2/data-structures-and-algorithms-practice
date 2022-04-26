package blind_seventy_five.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    private int[] testArray;

    @Test
    void findTwoSum_givenValidArrayOfIntegers_returnsTwoIndexesWithIntegersThatAddUpToTarget() {
        // GIVEN
        testArray = new int[]{2,7,11,15};
        int target = 9;

        // WHEN
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.findTwoSum(testArray, target);

        // THEN
        int[] expected = new int[]{0,1};
        assertArrayEquals(expected, result);
    }
}