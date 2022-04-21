package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdjacentElementsProductTest {

    private int[] testArray;

    @Test
    void findLargestProduct_whenGivenAnArrayOfIntegers_returnsTheLargestMultiplicatedSumOfTwoAdjacentNumbers() {
        // GIVEN
        testArray = new int[]{9, 5, 10, 2, 24, -1, -48};

        // WHEN
        AdjacentElementsProduct adjacentElementsProduct = new AdjacentElementsProduct();
        int result = adjacentElementsProduct.findLargestProduct(testArray);

        // THEN
        assertEquals(50, result);
    }
}