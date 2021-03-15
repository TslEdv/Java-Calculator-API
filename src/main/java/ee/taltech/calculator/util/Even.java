package ee.taltech.calculator.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Even {
    public static List<Integer> even(List<Integer> integers) {
        if (integers == null) {
            return null;
        }
        return integers.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
    }
}
