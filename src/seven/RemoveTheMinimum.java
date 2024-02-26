package seven;

public class RemoveTheMinimum {

    public static int[] removeSmallest(int[] numbers) {
        if (numbers.length <= 1) {
            return new int[0];
        }
        int min = numbers[0];
        int minIndex = 0;
        int newSize = numbers.length - 1;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i;
            }
        }
        int[] result = new int[newSize];
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i == minIndex) continue;
            result[j++] = numbers[i];
        }
        return result;
    }
}
