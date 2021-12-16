package laura.uebungsprojekt.aufgaben;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UPLK85_LottoLaesstGruessenTest {

    @Test
    void lotto_should_return_faculty_of_given_number() {
        // Arrange
        int number = 4;

        // Act
        int result = UPLK85_LottoLaesstGruessen.lotto(number);

        // Assert
        assertEquals(24, result);
    }
}