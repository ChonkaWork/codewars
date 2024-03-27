package seven;

import java.util.Arrays;
/*
https://www.codewars.com/kata/5a63948acadebff56f000018/java
 */
public class ProductOfMaximusOfArray {

    public static long maxProduct(int[] numbers, int sub_size) {
        int length = numbers.length;
        if (length < 1 || sub_size == 0 || sub_size > length) {
            return 0;
        }
        return Arrays.stream(numbers)
                .sorted()
                .skip(length - sub_size)
                .mapToLong(i -> i)
                .reduce((n1, n2) -> n1 * n2)
                .orElse(0);
    }
}
