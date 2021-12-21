import java.util.Arrays;

public class RecursiveBinarySearch {

    public RecursiveBinarySearch() {}

    public boolean recursiveBinarySearch(int [] array, int target) {
        if (array == null || target > array.length) {
            System.out.printf("Target: %s not found!", target);
            return false;
        }

        int midIndex = (int) (array.length / Math.floor(2));

        if (array[midIndex] == target) {
            System.out.printf("Target: %s found!", target);
            return true;
        } else if (array[midIndex] < target) {
            array = Arrays.copyOfRange(array, midIndex, array.length);
            return recursiveBinarySearch(array, target);
        } else {
            array = Arrays.copyOfRange(array, array[0], midIndex);
            return recursiveBinarySearch(array, target);
        }


    }
}
