package ee.taltech.calculator.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class CalculatorService {
    public List<Integer> even(List<Integer> integers){
        List<Integer> evens = new ArrayList<>();
        for (Integer integer : integers){
            if(integer %2 == 0) {
                evens.add(integer);
            }
        }
        return evens;
    }
    public Float averageOfPositives(List<Integer> numbers){
        List<Integer> positives = new ArrayList<>();
        for (Integer number : numbers) {
            if(number > 0){
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
    public Integer maxEven(List<Integer> numbers){
        List<Integer> evens = new ArrayList<>();
        for (Integer integer : numbers) {
            if(integer %2 == 0) {
                evens.add(integer);
            }
        }
        int max = Collections.max(evens);
        return max;
    }
    public Integer minOdd(List<Integer> numbers){
        List<Integer> odds = new ArrayList<>();
        for (Integer integer : numbers) {
            if(integer %2 == 1) {
                odds.add(integer);
            }
        }
        int min = Collections.min(odds);
        return min;
    }
    public List<Integer> squared(List<Integer> integers){
        List<Integer> squared = new ArrayList<>();
        for (Integer integer : integers) {
            squared.add(integer*integer);
        }
        return squared;
    }
}