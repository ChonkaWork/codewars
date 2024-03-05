package seven;

import java.util.HashSet;

public class AllUnique {
    public static boolean hasUniqueChars(String str) {
        var uniqChars = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (!uniqChars.add(c)) {
                return false;
            }
        }
        return true;
    }
}
