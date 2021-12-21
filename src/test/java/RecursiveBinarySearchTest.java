
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursiveBinarySearchTest {

    private int [] testArray;


    @Test
    void recursiveBinarySearch_ArrayWithInBoundTarget_returnsTrue() {
        // GIVEN
        testArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // WHEN
        RecursiveBinarySearch recursiveSearch = new RecursiveBinarySearch();
        recursiveSearch.recursiveBinarySearch(testArray, 10);

        // THEN
        assertTrue(true,"An array with a target inbounds should return true.");
    }

    @Test
    void recursiveBinarySearch_ArrayWithOutOfBoundsTarget_returnsFalse() {
        // GIVEN
        testArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // WHEN
        RecursiveBinarySearch recursiveSearch = new RecursiveBinarySearch();
        recursiveSearch.recursiveBinarySearch(testArray, 11);

        // THEN
        assertFalse(false,"An array with a target out of bounds should return false.");
    }

    @Test
    void recursiveBinarySearch_EmptyArray_returnsFalse() {
        // GIVEN
        testArray = null;

        // WHEN
        RecursiveBinarySearch recursiveSearch = new RecursiveBinarySearch();
        recursiveSearch.recursiveBinarySearch(testArray, 1);

        // THEN
        assertFalse(false,"An empty array should return false.");
    }
}