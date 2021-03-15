package ee.taltech.calculator;

import ee.taltech.calculator.util.MaxEven;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MaxEvenTest {
    @Test
    @DisplayName("MaxEven returns largest even number out of List")
    void maxEvenReturnsLargestEvenNumber() {
        assertEquals(6, MaxEven.maxEven(List.of(1, 2, 4, 6)));
    }

    @Test
    @DisplayName("MaxEven returns null when array is null")
    void maxEvenNullArrayReturnsNull() {
        assertNull(MaxEven.maxEven(null));
    }

    @Test
    @DisplayName("MaxEven returns largest even negative number out of List")
    void maxEvenReturnsLargestEvenNegativeNumber() {
        assertEquals(-2, MaxEven.maxEven(List.of(-1, -2, -4, -6)));
    }

    @Test
    @DisplayName("MaxEven returns null if list is only odd numbers")
    void maxEvenReturnsNullIfListIsOnlyOddNumbers() {
        assertNull(MaxEven.maxEven(List.of(1, -3, -5, 7)));
    }
}
