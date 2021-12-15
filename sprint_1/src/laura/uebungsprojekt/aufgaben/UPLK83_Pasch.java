package laura.uebungsprojekt.aufgaben;

import java.util.Random;

public class UPLK83_Pasch {
    public static boolean diceRoll(int dice_one, int dice_two, int dice_three) {
        System.out.println("dice 1: " + dice_one + " dice 2: " + dice_two + " dice 3: " + dice_three);
        if (dice_one == dice_two && dice_two == dice_three) {
            return true;
        } else return false;
    }

    public static void printResult(boolean result) {
        if (result) {
            System.out.println("Du hast einen Pasch gewürfelt");
        } else {
            System.out.println("Du hast keinen Pasch gewürfelt");
        }
    }
}
