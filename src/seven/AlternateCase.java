package seven;

public class AlternateCase {
    static String alternateCase(final String string) {
        if (string.isBlank()) {
            return string;
        }
        char[] charArray = string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isWhitespace(charArray[i])) {
                continue;
            }
            if (Character.isLowerCase(charArray[i])) {
                charArray[i] = Character.toUpperCase(charArray[i]);
            } else {
                charArray[i] = Character.toLowerCase(charArray[i]);
            }
        }
        return new String(charArray);
    }
}
