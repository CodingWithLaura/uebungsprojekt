package laura.uebungsprojekt;

import laura.uebungsprojekt.aufgaben.UPLK78_Messprogramm;
import laura.uebungsprojekt.aufgaben.UPLK80_Wetterstation;

public class Main {

    public static void main(String[] args) {
        int[] temps = {12, 14, 9, 12, 15, 16, 15, 15, 11, 8, 13, 13, 15, 12};
        UPLK80_Wetterstation.calc_mean_temp(temps);
    }
}
