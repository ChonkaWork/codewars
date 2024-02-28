package seven;

public class SumOfTriangularNumbers {
    /*
[01]
02 [03]
04 05 [06]
07 08 09 [10]
11 12 13 14 [15]
16 17 18 19 20 [21]
e.g. If 4 is given: 1 + 3 + 6 + 10 = 20.
     */
    public static int sumTriangularNumbers(int n) {
        int result = 0;
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
            result += sum;
        }
        return result;
    }
}
