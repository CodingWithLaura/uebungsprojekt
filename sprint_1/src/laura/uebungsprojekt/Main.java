package laura.uebungsprojekt;

import laura.uebungsprojekt.aufgaben.UPLK83_Pasch;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<Integer> dices = UPLK83_Pasch.rollDice(3);
        System.out.println(dices);
        boolean result = UPLK83_Pasch.isPasch(dices);
        System.out.println(result);

        var pasch = Arrays.asList(5, 5, 5, 5, 5, 5);
        System.out.println(UPLK83_Pasch.isPasch(pasch));
    }
}
