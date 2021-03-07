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
    @DisplayName("Returns smallest odd number out of the list")
    void minOddReturnsSmallestOddNumber() {
        assertEquals(1, calculatorService.minOdd(List.of(1,2,4,6)));
    }

    @Test
    @DisplayName("Returns Null if the array is null")
    void minOddNullArrayReturnsNull() {
        assertNull(calculatorService.minOdd(null));
    }

    @Test
    @DisplayName("Returns smallest odd negative number out of the list")
    void minOddReturnsSmallestOddNegativeNumber() {
        assertEquals(-7, calculatorService.minOdd(List.of(-1,-2,-4,-7)));
    }

    @Test
    @DisplayName("Returns null if the list is only even numbers")
    void minOddReturnsNullIfListIsOnlyEvenNumbers() {
        assertNull(calculatorService.minOdd(List.of(2,-4,-6,8)));
    }

    @Test
    @DisplayName("Returns even numbers out of the list")
    void evenReturnsEvenNumbers() {
        assertEquals(List.of(2,4,6), calculatorService.even(List.of(1,2,3,4,6)));
    }

    @Test
    @DisplayName("Returns null if the list is null")
    void evenNullArrayReturnsNull() {
        assertNull(calculatorService.minOdd(null));
    }

    @Test
    @DisplayName("Returns negative even numbers out of the list")
    void evenReturnsNegativeEvenNumbers() {
        assertEquals(List.of(-2,-4,-6),calculatorService.even(List.of(-1,-2,-3,-4,-5,-6)));
    }

    @Test
    @DisplayName("Returns null if there are only odd numbers")
    void evenReturnsNullIfOnlyOddNumbers() {
        assertNull(calculatorService.even(List.of(1,3,5,7)));
    }
}
