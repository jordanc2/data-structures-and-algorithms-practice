package easy;

public class FindMaxConsecutiveOnes {

    public int findTheMaxConsecutiveOnes(int[] numbers) {
        int count = 0;
        int result = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                count = 0;
            } else {
                count++;
                result = Math.max(result, count);
            }
        }
        return result;
    }
}
