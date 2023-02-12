package laura.uebungsprojekt.aufgaben;

import java.util.Scanner;

public class UPLK86_Ratespiel {
    public static int compareGuessedAndActualNumber(int guessedNumber, int actualNumber) {
        return Integer.compare(guessedNumber, actualNumber);
    }

    public static void showResultInConsole(int result) {
        if (result > 0) {
            System.out.println("Your guessed number is too high. Try again: ");
        } else if (result < 0) {
            System.out.println("Your guessed number is too low. Try again: ");
        } else {
            System.out.println("You guessed correctly!");
        }
    }

    public static void playGuessingGame(int actualNumber) {
        System.out.print("Guess a number between 1 and 1000!");
        Scanner console = new Scanner(System.in);
        int compareResult;
        do {
            int userInput = console.nextInt();
            compareResult = compareGuessedAndActualNumber(userInput, actualNumber);
            showResultInConsole(compareResult);
        } while (compareResult != 0);
    }
}

