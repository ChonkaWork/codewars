package seven;

public class VAPORCODE {

    private static final String DOUBLE_SPACE = "  ";
    private static final String DEFAULT_SPLITTER = "";

    public static String vaporcode(String s) {
        return String.join(DOUBLE_SPACE, s.replaceAll(" ", "").toUpperCase().split(DEFAULT_SPLITTER));
    }
}
