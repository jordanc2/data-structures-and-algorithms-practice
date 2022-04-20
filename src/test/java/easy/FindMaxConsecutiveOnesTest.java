package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMaxConsecutiveOnesTest {

    private int[] testArray;

    @Test
    void findTheMaxConsecutiveOnes_givenABinaryArray_returnsTheMaxConsecutiveOnesAsAnInteger() {
        // GIVEN
        testArray = new int[]{1,1,0,1,1,1};

        // WHEN
        FindMaxConsecutiveOnes findMaxConsecutiveOnes = new FindMaxConsecutiveOnes();
        int result = findMaxConsecutiveOnes.findTheMaxConsecutiveOnes(testArray);

        // THEN
        assertEquals(3, result);
    }
}