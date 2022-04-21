import java.util.Arrays;

public class DivideAndConquer {

    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int start, int end) {
        int pivot = partition(array, start, end);

        if (start < pivot - 1) {
            quickSort(array, start, pivot - 1);
        }
        if (end > pivot) {
            quickSort(array, pivot, end);
        }
    }

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

    private static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
