package laura.uebungsprojekt.aufgaben;

import java.util.Scanner;

public class UPLK82_Schaltjahrprüfung {
    public static void checkIfYearIsLeapYear() {
        Scanner sc = new Scanner(System.in);
        int jahreszahl = sc.nextInt();

        if (jahreszahl % 4 == 0) {
            System.out.println("Das ist ein Schaltjahr");
            if (jahreszahl % 100 == 0 && jahreszahl % 400 != 0) {
                System.out.println("Das ist kein Schaltjahr");
            }
        }
        else System.out.println("Das ist kein Schaltjahr");
    }
}
