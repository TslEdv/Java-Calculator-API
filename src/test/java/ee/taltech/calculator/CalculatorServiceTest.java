package ee.taltech.calculator;

import ee.taltech.calculator.service.CalculatorService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CalculatorServiceTest {

    CalculatorService calculatorService = new CalculatorService();

    @Test
    @DisplayName("Returns largest even number out of List")
    void maxEvenReturnsLargestEvenNumber() {
        assertEquals(6, calculatorService.maxEven(List.of(1,2,4,6)));
    }

    @Test
    @DisplayName("Returns null when array is null")
    void maxEvenNullArrayReturnsNull() {
        assertNull(calculatorService.maxEven(null));
    }

    @Test
    @DisplayName("Returns largest even negative number out of List")
    void maxEvenReturnsLargestEvenNegativeNumber() {
        assertEquals(-2, calculatorService.maxEven(List.of(-1,-2,-4,-6)));
    }

    @Test
    @DisplayName("Returns null if list is only odd numbers")
    void maxEvenReturnsNullIfListIsOnlyOddNumbers() {
        assertNull(calculatorService.maxEven(List.of(1,-3,-5,7)));
    }

    @Test
    void minOddReturnsSmallestOddNumber() {
        assertEquals(1, calculatorService.minOdd(List.of(1,2,4,6)));
    }

    @Test
    void minOddNullArrayReturnsNull() {
        assertNull(calculatorService.minOdd(null));
    }

    @Test
    void minOddReturnsSmallestOddNegativeNumber() {
        assertEquals(-7, calculatorService.minOdd(List.of(-1,-2,-4,-7)));
    }
}
