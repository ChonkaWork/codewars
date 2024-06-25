package seven;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        return Integer.parseInt(
                Arrays.stream(String.valueOf(num).split(""))
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.joining())
        );
    }
}