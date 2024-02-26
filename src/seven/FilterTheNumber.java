package seven;

public class FilterTheNumber {
    public static long filterString(final String value) {
        String replaced = value.replaceAll("[a-z, A-Z]", "");
        return Long.parseLong(replaced);
    }
}
