package seven;

public class FindOddCubes {
    public static int cubeOdd(int[] arr) {
        int sum = 0;
        for (int current : arr) {
            if (current % 2 != 0) {
                sum += current * current * current;
            }
        }
        return sum;
    }
}
