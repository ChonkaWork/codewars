package seven;

public class SimpleStingCharacters {

    public static int[] solve(String word) {
        int[] ints = new int[4];
        char[] charArray = word.toCharArray();
        for (char c : charArray) {
            if (Character.isUpperCase(c)) {
                ints[0] += 1;
            } else if (Character.isLowerCase(c)) {
                ints[1] += 1;
            } else if (Character.isDigit(c)) {
                ints[2] += 1;
            } else {
                ints[3] += 1;
            }
        }
        return ints;
    }
}
