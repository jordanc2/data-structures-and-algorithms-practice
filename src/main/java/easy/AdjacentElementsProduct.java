package easy;

public class AdjacentElementsProduct {

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
