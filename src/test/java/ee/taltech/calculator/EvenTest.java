package ee.taltech.calculator;

import ee.taltech.calculator.util.Even;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class EvenTest {
    @Test
    @DisplayName("Even returns even numbers out of the list")
    void evenReturnsEvenNumbers() {
        assertEquals(List.of(2, 4, 6), Even.even(List.of(1, 2, 3, 4, 6)));
    }

    @Test
    @DisplayName("Even returns null if the list is null")
    void evenNullArrayReturnsNull() {
        assertNull(Even.even(null));
    }

    @Test
    @DisplayName("Even returns negative even numbers out of the list")
    void evenReturnsNegativeEvenNumbers() {
        assertEquals(List.of(-2, -4, -6), Even.even(List.of(-1, -2, -3, -4, -5, -6)));
    }

    @Test
    @DisplayName("Even returns empty list if there are only odd numbers")
    void evenReturnsEmptyListIfOnlyOddNumbers() {
        assertEquals(List.of(), Even.even(List.of(1, 3, 5, 7)));
    }
}
