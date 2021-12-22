
public class LinearSearch {

    public LinearSearch() {}

    public int linearSearch(int[] array, int target) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.printf("Target: %s found at index: %s%n", target, i);
                return i;
            }
        }
        System.out.printf("Target value: %s, not found!", target);
        return 0;
    }

}
