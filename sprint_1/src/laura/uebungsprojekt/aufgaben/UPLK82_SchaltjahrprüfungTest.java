package laura.uebungsprojekt.aufgaben;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UPLK82_SchaltjahrprüfungTest {

    @Test
    void checkIfYearIsLeapYear() {
        // Arrange
        int jahr = 1804;

        // Act
        boolean isSchaltjahr = UPLK82_Schaltjahrprüfung.checkIfYearIsLeapYear(jahr);

        // Assert
        assertTrue(isSchaltjahr);
    }
    @Test
    void checkIfYearIsNotLeapYear() {
        // Arrange
        int jahr = 1805;

        // Act
        boolean isSchaltjahr = UPLK82_Schaltjahrprüfung.checkIfYearIsLeapYear(jahr);

        // Assert
        assertFalse(isSchaltjahr);
    }
    @Test
    void checkIfYearIsNotLeapYearWhenDivisibleBy100ButNotBy400() {
        // Arrange
        int jahr = 2100;

        // Act
        boolean isSchaltjahr = UPLK82_Schaltjahrprüfung.checkIfYearIsLeapYear(jahr);

        // Assert
        assertFalse(isSchaltjahr);
    }

    @Test
    void checkIfYearIsLeapYearWhenDivisibleBy400() {
        // Arrange
        int jahr = 1992;

        // Act
        boolean isSchaltjahr = UPLK82_Schaltjahrprüfung.checkIfYearIsLeapYear(jahr);

        // Assert
        assertFalse(isSchaltjahr);
    }
}