package ee.taltech.calculator.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class AverageOfPositives {
    public static Double averageOfPositives(List<Integer> numbers) {
        if (numbers == null) {
            return null;
        }
        Double average = numbers.stream().filter(e -> e > 0).mapToDouble(e -> e).average().orElse(0);
        BigDecimal bdAverage = new BigDecimal(Double.toString(average));
        bdAverage = bdAverage.setScale(2, RoundingMode.HALF_UP);
        return bdAverage.doubleValue();
    }
}
