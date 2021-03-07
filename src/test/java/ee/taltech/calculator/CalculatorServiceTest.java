package ee.taltech.calculator;

import ee.taltech.calculator.service.CalculatorService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CalculatorServiceTest {

    CalculatorService calculatorService = new CalculatorService();

    @Test
    void maxEvenReturnsLargestEvenNumber() {
        assertEquals(6, calculatorService.maxEven(List.of(1,2,4,6)));
    }

    @Test
    void maxEvenNullArrayReturnsNull() {
        assertNull(calculatorService.maxEven(null));
    }

    @Test
    void maxEvenReturnsLargestEvenNegativeNumber() {
        assertEquals(-2, calculatorService.maxEven(List.of(-1,-2,-4,-6)));
    }

    @Test
    void maxEvenReturnsNullIfListIsOnlyOddNumbers() {
        assertNull(calculatorService.maxEven(List.of(1,-3,-5,7)));
    }

}
