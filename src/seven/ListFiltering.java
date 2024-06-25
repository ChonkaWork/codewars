package seven;

import java.util.List;
import java.util.Objects;

/*
List Filtering
https://www.codewars.com/kata/53dbd5315a3c69eed20002dd/train/java
 */
public class ListFiltering {

    public static List<Object> filterList(final List<Object> list) {
        return list.stream().filter(o -> (o instanceof Integer)).toList();
    }
}
