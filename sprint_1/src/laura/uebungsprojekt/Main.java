package laura.uebungsprojekt;

import laura.uebungsprojekt.aufgaben.UPLK82_Schaltjahrprüfung;
import laura.uebungsprojekt.aufgaben.UPLK83_Pasch;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //int[] temps = {12, 14, 9, 12, 15, 16, 15, 15, 11, 8, 13, 13, 15, 12};
        //UPLK80_Wetterstation.calc_mean_temp(temps);
        //UPLK80_Wetterstation.calc_min_and_max_temp(temps);
        //UPLK80_Wetterstation.calc_temp_diff_of_two_days(temps);
        //UPLK80_Wetterstation.calc_temp_diff_of_two_days_oo(temps);

        //UPLK82_Schaltjahrprüfung.checkIfYearIsLeapYear();
        Random dice = new Random();
        int dice_one = dice.nextInt(7);
        int dice_two = dice.nextInt(7);
        int dice_three = dice.nextInt(7);
        boolean result = UPLK83_Pasch.diceRoll(dice_one, dice_two, dice_three);
        UPLK83_Pasch.printResult(result);

    }
}
