package laura.uebungsprojekt.aufgaben;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UPLK85_LottoLaesstGruessenTest {

    @Test
    void lotto_should_return_faculty_of_given_number() {
        // Arrange
        int number = 4;

        // Act
        int result = UPLK85_LottoLaesstGruessen.calcFaculty(number);

        // Assert
        assertEquals(24, result);
    }

    @Test
    void lotto_should_return_faculty_of_one_by_given_zero_as_input() {
        // Arrange
        int number = 0;

        // Act
        int result = UPLK85_LottoLaesstGruessen.calcFaculty(number);

        // Assert
        assertEquals(1, result);
    }

    @Test
    void lotto_should_throws_exception_when_given_a_negative_number() {
        // Arrange
        int number = -1;

        // Act and Assert
        assertThrows(ArithmeticException.class, () -> {
            UPLK85_LottoLaesstGruessen.calcFaculty(number);
        });
    }

    @Test
    void binominal_coefficient_should_return_should_return_n_at_k() {
        // Arrange
        int n = 8;
        int k = 3;

        // Act
        int result = UPLK85_LottoLaesstGruessen.calcBionominalCoefficient(n, k);

        //Assert
        assertEquals(result,56);
    }
}