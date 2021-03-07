package ee.taltech.calculator.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class CalculationResult {
    private Integer maxEven;
    private Integer minOdd;
    private List<Integer> even;
    private List<Integer> squared;
    private Float averageOfPositives;
}
