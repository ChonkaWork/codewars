package seven;
/*
https://www.codewars.com/kata/546e2562b03326a88e000020/java
 */
public class SquareEveryDigit {

    public int squareDigits(int n) {
        if (n == 0) {
            return 0;
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            stringBuilder.insert(0, digit * digit);
        }

        return Integer.parseInt(String.valueOf(stringBuilder));
    }
}
