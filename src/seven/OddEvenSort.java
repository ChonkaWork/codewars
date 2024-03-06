package seven;

public class OddEvenSort {
    public static String sortMyString(String s) {
        char[] charArray = s.toCharArray();
        StringBuilder firstWord = new StringBuilder();
        StringBuilder secondWord = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            if (i % 2 == 0) {
                firstWord.append(charArray[i]);
            } else {
                secondWord.append(charArray[i]);
            }
        }
        return firstWord.append(" ").append(secondWord).toString();
    }
}
