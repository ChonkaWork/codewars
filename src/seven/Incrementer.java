package seven;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
https://www.codewars.com/kata/590e03aef55cab099a0002e8/train/java
 */
public class Incrementer {

    public static int[] incrementer(int[] numbers) {
        return IntStream.rangeClosed(1, numbers.length)
                .map(i -> (i + numbers[i - 1]) % 10)
                .toArray();
    }
}
