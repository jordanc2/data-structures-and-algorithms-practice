
public class BinarySearch {

    public BinarySearch() {}

    public int binarySearch(int [] array, int target) {

        int firstIndex = 0;
        int lastIndex = array.length - 1;

        while (firstIndex <= lastIndex) {

            int midpointIndex = (int) ((firstIndex + lastIndex) / Math.floor(2.00));

            if (array[midpointIndex] == target) {
                System.out.printf("Target: %s found at index: %s%n", target, midpointIndex);
                return midpointIndex;
            } else if (array[midpointIndex] < target) {
                firstIndex = midpointIndex + 1;
            } else {
                lastIndex = midpointIndex - 1;
            }
        }
        System.out.printf("Target value: %s, not found!", target);
        return 0;
    }

}
