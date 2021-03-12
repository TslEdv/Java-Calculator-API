package ee.taltech.calculator;

import ee.taltech.calculator.util.MinOdd;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MinOddTest {
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
}
