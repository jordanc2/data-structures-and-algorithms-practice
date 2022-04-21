package easy;

/**
 * Given an array of integers, find the pair of adjacent elements that has the largest product
 * and return that product.
 */
public class AdjacentElementsProduct {

    /**
     * Method that finds the largest multiplicative sum of two adjacent integers in an array
     * @param array of integers
     * @return integer sum
     */
    public int findLargestProduct(int[] array) {

        int result = Integer.MIN_VALUE;

        for (int i = 0; i < array.length - 1; i++) {
            int temp = array[i] * array[i + 1];
            if (result < temp) {
                result = temp;
            }
        }
        return result;
    }
}
