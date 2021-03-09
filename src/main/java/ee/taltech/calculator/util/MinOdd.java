package ee.taltech.calculator.util;

import java.util.List;

public class MinOdd {
        public static Integer minOdd(List<Integer> numbers) {
            if (numbers == null) {
                return null;
            }
            return numbers.stream().filter(e -> e % 2 != 0).min(Integer::compare).orElse(null);
        }
}
