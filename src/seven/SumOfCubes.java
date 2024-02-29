package seven;

public class SumOfCubes {
    public static long sumCubes(long n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (long) i * i * i;
        }
        return sum;
    }
}
