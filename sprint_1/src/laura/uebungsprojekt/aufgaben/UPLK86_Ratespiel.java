package laura.uebungsprojekt.aufgaben;

public class UPLK86_Ratespiel {
    public static String isGuessedNumberActualNumber(int guessedNumber, int actualNumber) {
        if (guessedNumber == actualNumber) {
            return "Your guessed number is correct!";
        } else if (guessedNumber > actualNumber) {
            return "Your guessed number is too high.";
        } else {
            return "Your guessed number is too low.";
        }
    }
}

