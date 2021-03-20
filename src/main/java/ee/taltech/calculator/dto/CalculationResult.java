package ee.taltech.calculator.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class CalculationResult {
    private Integer maxEven;
    private Integer minOdd;
    private List<Integer> even;
    private List<Integer> squared;
    private Double averageOfPositives;
}
