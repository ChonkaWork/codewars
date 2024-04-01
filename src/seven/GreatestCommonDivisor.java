package seven;

/*
https://www.codewars.com/kata/5500d54c2ebe0a8e8a0003fd/java
 */
public class GreatestCommonDivisor {
    public static int compute(int x, int y) {
        int i = Math.min(x, y);
        while (i > 1) {
            if (x % i == 0 && y % i == 0) {
                return i;
            }
            i--;
        }
        return 1;
    }
}
