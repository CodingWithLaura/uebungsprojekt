package laura.uebungsprojekt.aufgaben;

import java.util.Scanner;

public class UPLK76_Taschenrechner {

    public static void sumTwoNumbers() {
        System.out.print("Enter two numbers which will be added up: ");
        Scanner input = new Scanner(System.in);
        int number_one = input.nextInt();
        int number_two = input.nextInt();
        System.out.print(number_one + number_two);
    }
}
