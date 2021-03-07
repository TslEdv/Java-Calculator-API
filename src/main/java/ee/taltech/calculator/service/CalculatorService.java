package ee.taltech.calculator.service;

import ee.taltech.calculator.dto.CalculationResult;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class CalculatorService {
    public List<Integer> even(List<Integer> integers) {
        List<Integer> evens = new ArrayList<>();
        for (Integer integer : integers) {
            if (integer % 2 == 0) {
                evens.add(integer);
            }
        }
        return evens;
    }

    public Float averageOfPositives(List<Integer> numbers) {
        List<Integer> positives = new ArrayList<>();
        for (Integer number : numbers) {
            if (number > 0) {
                positives.add(number);
            }
        }
        float sum = 0;
        for (Integer positive : positives) {
            sum = positive + sum;
        }
        sum = sum / positives.size();
        return sum;
    }

    public Integer maxEven(List<Integer> numbers) {
        if (numbers == null) {
            return null;
        }
        List<Integer> evens = new ArrayList<>();
        for (Integer integer : numbers) {
            if (integer % 2 == 0) {
                evens.add(integer);
            }
        }
        Integer max;
        if (evens.isEmpty()) {
            max = null;
        } else {
            max = Collections.max(evens);
        }
        return max;
    }

    public Integer minOdd(List<Integer> numbers) {
        if (numbers == null) {
            return null;
        }
        return numbers.stream().filter(i -> i % 2 != 0).min(Integer::compare).orElse(null);
    }

    public List<Integer> squared(List<Integer> integers) {
        List<Integer> squared = new ArrayList<>();
        for (Integer integer : integers) {
            squared.add(integer * integer);
        }
        return squared;
    }

    public CalculationResult calculate1(List<Integer> numbers) {
        CalculationResult result = new CalculationResult();
        result.setMaxEven(maxEven(numbers));
        result.setMinOdd(minOdd(numbers));
        result.setEven(even(numbers));
        return result;
    }

    public CalculationResult calculate2(List<Integer> numbers) {
        CalculationResult result = new CalculationResult();
        result.setSquared(squared(numbers));
        result.setMaxEven(maxEven(numbers));
        result.setAverageOfPositives(averageOfPositives(numbers));
        return result;
    }
}
