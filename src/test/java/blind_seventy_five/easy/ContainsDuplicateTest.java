package blind_seventy_five.easy;

import blind_seventy_five.easy.arraysandhashing.ContainsDuplicate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    private int[] testArray;

    @Test
    void containsDuplicates_givenAnArrayOfIntegersThatContainDuplicates_returnsTrue() {
        // GIVEN
        testArray = new int[]{1,1,1,3,3,4,3,2,4,2};

        // WHEN
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        boolean result = containsDuplicate.containsDuplicates(testArray);

        // THEN
        assertTrue(result);
    }

    @Test
    void containsDuplicates_givenAnArrayOfIntegersThatDoesNotContainDuplicates_returnsFalse() {
        // GIVEN
        testArray = new int[]{1,2,3,4};

        // WHEN
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        boolean result = containsDuplicate.containsDuplicates(testArray);

        // THEN
        assertFalse(result);
    }
}