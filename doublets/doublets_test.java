import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DoubletsTest {

    @Test
    void diceRoll_method_should_return_true_if_rolled_a_triple() {
        // Arrange
        int dice_one = 4;
        int dice_two = 4;
        int dice_three = 4;

        // Act
        boolean result = Doublets.isDoublet(dice_one, dice_two, dice_three);

        // Assert
        assertTrue(result);
    }
    @Test
    void diceRoll_method_should_return_false_if_not_rolled_a_triple() {
        // Arrange
        int dice_one = 2;
        int dice_two = 4;
        int dice_three = 4;

        // Act
        boolean result = Doublets.isDoublet(dice_one, dice_two, dice_three);

        // Assert
        assertFalse(result);
    }
}
