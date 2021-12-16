package laura.uebungsprojekt.aufgaben;

import java.util.ArrayList;
import java.util.stream.Collectors;

import static java.lang.StrictMath.abs;

public class UPLK80_Wetterstation {

    public static void calc_mean_temp(int[] temps) {
        float total = 0;
        float mean = 0;
        for (int i = 0; i < temps.length; i++) {
            total += temps[i];
        }
        mean = total / temps.length;
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
        System.out.println("The max value of your input is: " + min + " The min value of your input is: " + max);
    }

    public static void calc_temp_diff_of_two_days(int[] temps) {
        // Bestimme maximales delta von 2 Tagen
        int max_diff = 0;
        for (int i = 0; i < temps.length - 1; i++) {
            int new_diff = abs(temps[i] - temps[i + 1]);
            if (new_diff > max_diff) {
                max_diff = new_diff;
            }
        }
        System.out.println(max_diff);
        // Finde alle zwei Tage zwischen denen delta = max
        for (int i = 0; i < temps.length - 1; i++) {
            if (abs(temps[i] - temps[i + 1]) == max_diff) {
                System.out.println("Tag 1: " + (i + 1) + " Tag 2: " + (i + 2));
            }
        }
    }

    public static void calc_temp_diff_of_two_days_oo(int[] temps) {
        var deltas = new ArrayList<TemperaturDelta>();
        for (int i = 0; i < temps.length - 1; i++) {
            deltas.add(new TemperaturDelta(i, i + 1, temps[i], temps[i + 1]));
        }
        int max_diff = deltas.stream().mapToInt(x -> x.delta()).max().orElseThrow();
        var results = deltas.stream()
                .filter(x -> x.delta() == max_diff)
                .collect(Collectors.toList());
        for (var r : results) {
            System.out.println(r);
        }
    }
}
