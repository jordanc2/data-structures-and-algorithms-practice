import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTest {

    private int [] testArray;

    @Test
    void binarySearch_arrayWithInBoundTarget_returnsIndexOfTarget() {
        // GIVEN
        testArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // WHEN
        BinarySearch binarySearch = new BinarySearch();
        int result = binarySearch.binarySearch(testArray, 10);

        // THEN
        assertEquals(9, result,
                "A sorted array with a given target should return the index of target, if inbounds.");
    }

    @Test
    void binarySearch_arrayWithOutOfBoundTarget_returnsZero() {
        // GIVEN
        testArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // WHEN
        BinarySearch binarySearch = new BinarySearch();
        int result = binarySearch.binarySearch(testArray, 11);

        // THEN
        assertEquals(0, result,
                "A sorted array with a given target should return the index of target, if inbounds.");
    }
}
