package laura.uebungsprojekt.aufgaben;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UPLK83_Pasch {
    public static List<Integer> rollDice(int diceCount){
        Random dice = new Random();
        List<Integer> dices = new ArrayList<>();
        for (int i = 0; i < diceCount; i++) {
            dices.add(dice.nextInt(1,7));
        }
        return dices;
    }

    public static boolean isPasch(List<Integer> numbers) {
        if (numbers.size() < 2) {
            return false;
        }
        var first_element = numbers.get(0);
        for (var number : numbers) {
            if (number != first_element) {
                return false;
            }
        }
        return true;
    }

    public static void printResult(boolean result) {
        if (result) {
            System.out.println("Du hast einen Pasch gewürfelt");
        } else {
            System.out.println("Du hast keinen Pasch gewürfelt");
        }
    }
}
