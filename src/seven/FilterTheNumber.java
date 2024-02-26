package seven;

public class FilterTheNumber {
    public static long filterString(final String value) {
        return Long.parseLong(value.replaceAll("\\D", ""));
    }
}
