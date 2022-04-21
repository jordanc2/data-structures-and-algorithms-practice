import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class DivideAndConquerTest {

    int[] testArray;

    @Test
    void quickSort_givenAnUnsortedArray_returnsTheArraySorted() {
        // GIVEN
        testArray = new int[]{23, 31, 1, 21, 36, 72};

        // WHEN
        DivideAndConquer.quickSort(testArray);
        int[] sortedArray = new int[]{1, 21, 23, 31, 36, 72};

        // THEN
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void quickSort_givenAnUnsortedArrayWithDuplicates_returnsTheArraySortedDuplicatesIncluded() {
        // GIVEN
        testArray = new int[]{11, 14, 16, 12, 11, 15};

        // WHEN
        DivideAndConquer.quickSort(testArray);
        int[] sortedArray = new int[]{11, 11, 12, 14, 15, 16};

        // THEN
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void quickSort_givenASortedArray_returnsTheArraySorted() {
        // GIVEN
        testArray = new int[]{1,2,3,4,5,6,7,8};

        // WHEN
        DivideAndConquer.quickSort(testArray);
        int[] sortedArray = new int[]{1,2,3,4,5,6,7,8};

        // THEN
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void quickSort_givenAnUnsortedArrayWithRandomIntegers_letsHaveSomeFun() {
        // GIVEN
        testArray = IntStream.generate(() -> new Random().nextInt(1000)).limit(100).toArray();
        IntStream.range(0, testArray.length)
                .forEach(i -> System.out.println("Index: " + i + " = " + testArray[i]));
        // WHEN
        DivideAndConquer.quickSort(testArray);

        // THEN
        System.out.println();
        IntStream.range(0, 35).forEach(i -> System.out.print("-*-"));
        System.out.println("\n");
        IntStream.range(0, testArray.length)
                .forEach(i -> System.out.println("Index: " + i + " = " + testArray[i]));
    }
}