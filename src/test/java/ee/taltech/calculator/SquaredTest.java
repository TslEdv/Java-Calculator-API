package ee.taltech.calculator;

import ee.taltech.calculator.util.Squared;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SquaredTest {
    @Test
    @DisplayName("Squared returns null on null input")
    void squaredNullInputReturnsNull() {
        assertNull(Squared.squared(null));
    }

    @Test
    @DisplayName("Squared returns squares of positive numbers")
    void squaredReturnsSquaresOnPositives() {
        assertEquals(List.of(1, 4, 9), Squared.squared(List.of(1, 2, 3)));
    }

    @Test
    @DisplayName("Squared returns squares of negative numbers")
    void squaredReturnsSquaresOnNegatives() {
        assertEquals(List.of(1, 4, 9), Squared.squared(List.of(-1, -2, -3)));
    }

    @Test
    @DisplayName("Squared returns squares of positive and negative numbers")
    void squaredReturnsSquaresOnPositivesAndNegatives() {
        assertEquals(List.of(1, 4, 9, 16), Squared.squared(List.of(1, -2, 3, -4)));
    }
}
