package ee.taltech.calculator.service;

import ee.taltech.calculator.dto.CalculationResult;
import ee.taltech.calculator.util.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class CalculatorService {
    public CalculationResult calculate1(List<Integer> numbers) {
        if(numbers.isEmpty()){
            return null;
        }
        CalculationResult result = new CalculationResult();
        result.setMaxEven(MaxEven.maxEven(numbers));
        result.setMinOdd(MinOdd.minOdd(numbers));
        result.setEven(Even.even(numbers));
        return result;
    }

    public CalculationResult calculate2(List<Integer> numbers) {
        if(numbers.isEmpty()){
            return null;
        }
        CalculationResult result = new CalculationResult();
        result.setSquared(Squared.squared(numbers));
        result.setMaxEven(MaxEven.maxEven(numbers));
        result.setAverageOfPositives(AverageOfPositives.averageOfPositives(numbers));
        return result;
    }
}
