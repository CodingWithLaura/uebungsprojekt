package laura.uebungsprojekt;

import laura.uebungsprojekt.aufgaben.UPLK80_Wetterstation;
import laura.uebungsprojekt.aufgaben.UPLK82_Schaltjahrprüfung;

public class Main {

    public static void main(String[] args) {
        //int[] temps = {12, 14, 9, 12, 15, 16, 15, 15, 11, 8, 13, 13, 15, 12};
        //UPLK80_Wetterstation.calc_mean_temp(temps);
        //UPLK80_Wetterstation.calc_min_and_max_temp(temps);
        //UPLK80_Wetterstation.calc_temp_diff_of_two_days(temps);
        //UPLK80_Wetterstation.calc_temp_diff_of_two_days_oo(temps);
        int jahr = 2100;

        boolean isSchaltjahr = UPLK82_Schaltjahrprüfung.checkIfYearIsLeapYear(jahr);
        UPLK82_Schaltjahrprüfung.showResultInConsole(isSchaltjahr);
    }
}
