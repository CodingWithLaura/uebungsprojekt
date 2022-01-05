package laura.uebungsprojekt.aufgaben;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UPLK86_RatespielTest {

    @Test
    void ratespiel_should_return_success_message_when_guessed_number_is_same_as_actual_number() {
        // Arrange
        int actual_number = 485;
        int guessed_number = 485;

        // Act
        int result = UPLK86_Ratespiel.compareGuessedAndActualNumber(guessed_number, actual_number);

        // Assert
        assertEquals(0, result);
    }

    @Test
    void ratespiel_should_return_fail_message_when_guessed_number_is_higher_than_actual_number() {
        // Arrange
        int actual_number = 485;
        int guessed_number = 486;

        // Act
        int result = UPLK86_Ratespiel.compareGuessedAndActualNumber(guessed_number, actual_number);

        // Assert
        assertEquals(1, result);
    }

    @Test
    void ratespiel_should_return_fail_message_when_guessed_number_is_lower_than_actual_number() {
        // Arrange
        int actual_number = 485;
        int guessed_number = 484;

        // Act
        int result = UPLK86_Ratespiel.compareGuessedAndActualNumber(guessed_number, actual_number);

        // Assert
        assertEquals(-1, result);
    }
}