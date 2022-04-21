import java.util.Arrays;

/**
 * Class for Divide and Conquer sort algorithms:
 *      - Quick Sort
 */
public class DivideAndConquer {

    /**
     * Main Quick Sort method to recursively sort a given array
     * @param array to be sorted
     */
    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    /**
     * Overloaded Quick Sort method that recursively sorts a given array
     * @param array to be sorted
     * @param start index of the first element in the array
     * @param end index of the last element in the array
     */
    private static void quickSort(int[] array, int start, int end) {
        int pivot = partition(array, start, end);

        if (start < pivot - 1) {
            quickSort(array, start, pivot - 1);
        }
        if (end > pivot) {
            quickSort(array, pivot, end);
        }
    }

    /**
     * Helper method that partitions of the array into sub arrays.
     * Divides array from the pivot
     * Left side contains elements less than the pivot
     * Right side contains elements greater than the pivot
     * @param array to be partitioned into sub arrays
     * @param start index of the first element in the array
     * @param end index of the last element in the array
     * @return the index of the first element in the array to be used as a pivot in the recursive call
     */
    private static int partition(int[] array, int start, int end) {
        int pivot = array[start];

        while (start <= end) {
            while (array[start] < pivot) {
                start++;
            }

            while (array[end] > pivot) {
                end--;
            }

            if (start <= end) {
                swap(array, start, end);
                start++;
                end--;
            }
        }
        return start;
    }

    /**
     * Helper method that takes the two elements of the provided sub array and swaps them
     * @param array sub array
     * @param left element that needs to be swapped with right
     * @param right element that needs to be swapped with left
     */
    private static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
