package ee.taltech.calculator.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxEven {
    public Integer maxEven(List<Integer> numbers) {
        if (numbers == null) {
            return null;
        }
        return numbers.stream().filter(e-> e%2 == 0).max(Integer::compare).orElse(null);
}
