package ee.taltech.calculator.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Squared {
    public List<Integer> squared(List<Integer> integers) {
        if (integers == null) {
            return null;
        }
        return integers.stream().map(e->e*e).collect(Collectors.toList());
    }
}