import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinearSearchTest {

    private int [] testArray;

    @Test
    void linearSearch_arrayWithInBoundTarget_returnsIndexOfTarget() {
        // GIVEN
        testArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // WHEN
        LinearSearch linearSearch = new LinearSearch();
        int result = linearSearch.linearSearch(testArray, 10);

        // THEN
        assertEquals(9, result,
                "A sorted array with a given target should return the index of target, if inbounds.");
    }

    @Test
    void linearSearch_arrayWithOutOfBoundTarget_returnsZero() {
        // GIVEN
        testArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // WHEN
        LinearSearch linearSearch = new LinearSearch();
        int result = linearSearch.linearSearch(testArray, 11);

        // THEN
        assertEquals(0, result,
                "A sorted array with a given target should return the index of target, if inbounds.");
    }
}
