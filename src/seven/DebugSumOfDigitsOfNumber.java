package seven;

import java.util.stream.IntStream;

/*
https://www.codewars.com/kata/563d59dd8e47a5ed220000ba/train/java
 */
public class DebugSumOfDigitsOfNumber {

    public static int sumOfDigits(int n) {
        return IntStream.iterate(n, num -> num / 10)
                .map(num -> num % 10)
                .limit(String.valueOf(n).length())
                .sum();
    }
}
