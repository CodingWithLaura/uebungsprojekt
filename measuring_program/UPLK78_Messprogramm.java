package laura.uebungsprojekt.aufgaben;

import java.util.Scanner;

public class UPLK78_Messprogramm {
    public static void calcMeanOfValues(int numberOfValues) {
        System.out.println("Enter " + numberOfValues + " numbers: ");
        float average = readAndSumUpValues(numberOfValues) / numberOfValues;
        System.out.println("The mean value of your input is: " + average);
    }

    private static float readAndSumUpValues(int arrayLength) {
        Scanner in = new Scanner(System.in);
        float total = 0;
        int[] vars = new int[arrayLength];
        for (int i = 0; i < vars.length; i++) {
            vars[i] = in.nextInt();
            total += vars[i];
        }
        return total;
    }
}
