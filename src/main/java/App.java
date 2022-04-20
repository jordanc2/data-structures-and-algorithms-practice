import java.util.Arrays;

public class App {

    private static int [] array;

    public static void main(String[] args) {

        addToArray();

        System.out.println("\n ---- Linear Search ------\n");

        LinearSearch linearSearch1 = new LinearSearch();
        linearSearch1.linearSearch(array, 99);
        LinearSearch linearSearch2 = new LinearSearch();
        linearSearch2.linearSearch(array, 101);

        System.out.println("\n ---- Binary Search ------\n");

        BinarySearch binarySearch1 = new BinarySearch();
        binarySearch1.binarySearch(array, 78);
        BinarySearch binarySearch2 = new BinarySearch();
        binarySearch2.binarySearch(array, 500);

        System.out.println("\n ---- Recursive Binary Search ------\n");
        RecursiveBinarySearch recursiveSearch1 = new RecursiveBinarySearch();
        recursiveSearch1.recursiveBinarySearch(array, 99);
        RecursiveBinarySearch recursiveBinary2 = new RecursiveBinarySearch();
        recursiveBinary2.recursiveBinarySearch(array, 102);
    }

    public static void addToArray() {

        array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }
}
