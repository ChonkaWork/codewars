package six;

/*
https://www.codewars.com/kata/5262119038c0985a5b00029f/java
 */
public class Prime {

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}