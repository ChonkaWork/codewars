package seven;

public class MinimizeSumOfArray {
    public static int minSum(int[] passed) {
        insertionSort(passed);
        int result = 0;
        for (int i = 0; i < passed.length / 2; i++) {
            result += passed[i] * passed[passed.length - i - 1];
        }
        return result;
    }

    private static void insertionSort(int[] ints) {
        for (int i = 1; i < ints.length; i++) {
            int j = i - 1;
            int current = ints[i];
            while (j >= 0 && current < ints[j]) {
                ints[j + 1] = ints[j];
                j--;
            }
            ints[j + 1] = current;
        }
    }
}
