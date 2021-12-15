package laura.uebungsprojekt.aufgaben;

public class UPLK82_Schaltjahrprüfung {
    public static boolean checkIfYearIsLeapYear(int jahreszahl) {
        return jahreszahl % 4 == 0 && jahreszahl % 100 != 0 || jahreszahl % 400 == 0;
    }

    public static void showResultInConsole(boolean result) {
        if (result) {
            System.out.println("Das ist ein Schaltjahr");
        } else {
            System.out.println("Das ist kein Schaltjahr");
        }
    }
}
