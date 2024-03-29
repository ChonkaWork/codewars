package seven;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DigitExplosion {
    public static String explode(String digits) {
        return Arrays.stream(digits.split(""))
                .map(s -> s.repeat(Integer.parseInt(s)))
                .collect(Collectors.joining());
    }
}
