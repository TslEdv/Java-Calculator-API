package ee.taltech.calculator;

import ee.taltech.calculator.util.AverageOfPositives;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class AverageOfPositivesTest {
    @Test
    @DisplayName("AverageOfPositives returns null on null input")
    void averageOfPositivesReturnsNullOnNullInput() {
        assertNull(AverageOfPositives.averageOfPositives(null));
    }

    @Test
    @DisplayName("AverageOfPositives returns integer of positive number input")
    void averageOfPositivesReturnsAverageOfPositives() {
        assertEquals(4, AverageOfPositives.averageOfPositives(List.of(2, 4, 6)));
    }

    @Test
    @DisplayName("AverageOfPositives does not take negatives into account")
    void averageOfPositivesOnlyCalculatesPositives() {
        assertEquals(4, AverageOfPositives.averageOfPositives(List.of(2, -6, 4, 6, -8)));
    }

    @Test
    @DisplayName("AverageOfPositives returns 0 on negative numbers")
    void averageOfPositivesReturnsZeroOnNegatives() {
        assertEquals(0, AverageOfPositives.averageOfPositives(List.of(-2, -4, -6)));
    }

    @Test
    @DisplayName("AverageOfPositives rounds correctly")
    void averageOfPositivesRoundsCorrectly() {
        assertEquals(1.67, AverageOfPositives.averageOfPositives(List.of(1, 2, 2)));
    }

    @Test
    @DisplayName("AverageOfPositives rounds down")
    void averageOfPositivesRoundsDown() {
        assertEquals(1.33, AverageOfPositives.averageOfPositives(List.of(1, 2, 1)));
    }
}
