package ee.taltech.calculator.util;

import java.util.ArrayList;
import java.util.List;

public class AverageOfPositives {
    public static Double averageOfPositives(List<Integer> numbers) {
        if(numbers == null){
            return null;
        }
        Double average = numbers.stream().filter(e-> e>0).mapToDouble(e->e).average().orElse(0);
        return ((double)(Math.round(average*100)))/100;
    }
}
