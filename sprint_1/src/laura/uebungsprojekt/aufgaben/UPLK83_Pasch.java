package laura.uebungsprojekt.aufgaben;

import java.util.Random;

public class UPLK83_Pasch {
    public static void diceRoll() {
        Random dice = new Random();
        int dice_one = dice.nextInt(7);
        int dice_two = dice.nextInt(7);
        int dice_three = dice.nextInt(7);
        System.out.println("dice 1: " + dice_one + " dice 2: " + dice_two + " dice 3: " + dice_three);
        if (dice_one == dice_two && dice_two == dice_three) {
            System.out.println("Du hast einen Pasch gewürfelt!");
        } else System.out.println("Du hast keinen Pasch gewürfelt!");
    }
}
