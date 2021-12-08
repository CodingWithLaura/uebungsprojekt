package laura.uebungsprojekt.aufgaben;

import java.util.Scanner;

public class UPLK80_Wetterstation {

    public static void calc_mean_temp(int[] temps) {
        float total = 0;
        float mean = 0;
        for (int i = 0; i < temps.length; i++) {
            total += temps[i];
            mean = total / temps.length;
        }
        System.out.println("The mean value of your input is: " + mean);
    }

    public static void calc_min_and_max_temp(int[] temps) {
        int min = temps[0];
        int max = 0;
        for (int temp : temps) {
            if (min > temp) {
                min = temp;
            }
            if (max < temp) {
                max = temp;
            }
        }
        System.out.println("The max value of your input is: " +  min + " " + "The min value of your input is: " + max);
    }

}
