package ee.taltech.calculator;

import ee.taltech.calculator.service.CalculatorService;
import ee.taltech.calculator.util.Even;
import ee.taltech.calculator.util.MaxEven;
import ee.taltech.calculator.util.MinOdd;
import ee.taltech.calculator.util.Squared;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CalculatorServiceTest {

    @Test
    @DisplayName("MaxEven returns largest even number out of List")
    void maxEvenReturnsLargestEvenNumber() {
        assertEquals(6, MaxEven.maxEven(List.of(1,2,4,6)));
    }

    @Test
    @DisplayName("MaxEven returns null when array is null")
    void maxEvenNullArrayReturnsNull() {
        assertNull(MaxEven.maxEven(null));
    }

    @Test
    @DisplayName("MaxEven returns largest even negative number out of List")
    void maxEvenReturnsLargestEvenNegativeNumber() {
        assertEquals(-2, MaxEven.maxEven(List.of(-1,-2,-4,-6)));
    }

    @Test
    @DisplayName("MaxEven returns null if list is only odd numbers")
    void maxEvenReturnsNullIfListIsOnlyOddNumbers() {
        assertNull(MaxEven.maxEven(List.of(1,-3,-5,7)));
    }

    @Test
    @DisplayName("MinOdd returns smallest odd number out of the list")
    void minOddReturnsSmallestOddNumber() {
        assertEquals(1, MinOdd.minOdd(List.of(1,2,4,6)));
    }

    @Test
    @DisplayName("MinOddd returns Null if the array is null")
    void minOddNullArrayReturnsNull() {
        assertNull(MinOdd.minOdd(null));
    }

    @Test
    @DisplayName("MinOdd returns smallest odd negative number out of the list")
    void minOddReturnsSmallestOddNegativeNumber() {
        assertEquals(-7, MinOdd.minOdd(List.of(-1,-2,-4,-7)));
    }

    @Test
    @DisplayName("MinOdd returns null if the list is only even numbers")
    void minOddReturnsNullIfListIsOnlyEvenNumbers() {
        assertNull(MinOdd.minOdd(List.of(2,-4,-6,8)));
    }

    @Test
    @DisplayName("Even returns even numbers out of the list")
    void evenReturnsEvenNumbers() {
        assertEquals(List.of(2,4,6), Even.even(List.of(1,2,3,4,6)));
    }

    @Test
    @DisplayName("Even returns null if the list is null")
    void evenNullArrayReturnsNull() {
        assertNull(Even.even(null));
    }

    @Test
    @DisplayName("Even returns negative even numbers out of the list")
    void evenReturnsNegativeEvenNumbers() {
        assertEquals(List.of(-2,-4,-6),Even.even(List.of(-1,-2,-3,-4,-5,-6)));
    }

    @Test
    @DisplayName("Even returns empty list if there are only odd numbers")
    void evenReturnsEmptyListIfOnlyOddNumbers() {
        assertEquals(List.of(), Even.even(List.of(1,3,5,7)));
    }
    //TODO: tests for squared, average of positives


    @Test
    @DisplayName("Squared returns null on null input")
    void squaredNullInputReturnsNull() {
        assertNull(Squared.squared(null));
    }
}
