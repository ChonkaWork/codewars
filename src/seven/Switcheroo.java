package seven;

public class Switcheroo {
    public static String switcheroo(String x) {
        char[] letters = x.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 'a') {
                letters[i] = 'b';
            } else if (letters[i] == 'b') {
                letters[i] = 'a';
            }

        }
        return new String(letters);
    }
}
