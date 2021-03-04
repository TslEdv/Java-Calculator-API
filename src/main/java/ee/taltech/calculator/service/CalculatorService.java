package ee.taltech.calculator.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
}
