package laura.uebungsprojekt.aufgaben;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void age_of_person_should_increase_by_one_when_no_parameter_is_given_in_personAlternlassen() {
        // Arrange
        Person mensch = new Person("Hans", 23, "männlich", "blau");

        // Act
        mensch.personAlternLassen();

        // Assert
        assertEquals(24, mensch.getAlter());
    }

    @Test
    void age_of_person_should_increase_by_given_parameter_in_personAlternlassen() {
        // Arrange
        Person mensch = new Person("Hans", 23, "männlich", "blau");

        // Act
        mensch.personAlternLassen(3);

        // Assert
        assertEquals(26, mensch.getAlter());
    }
}