package seven;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(long n) {
        if (n == 0) {
            return false;
        }
        if (n <= 2) {
            return true;
        }
        double exp = 1;
        double value = Math.pow(2, exp);
        while (n >= value) {
            if (value == n) {
                return true;
            }
            exp++;
            value = Math.pow(2, exp);
        }
        return value == n;
    }
}