package laura.uebungsprojekt.aufgaben;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UPLK79_EinerVonVielen {

    private static List<Character> convertStringToCharList(String str) {
        List<Character> chars = new ArrayList<>();
        for (char ch : str.toCharArray()) {
            chars.add(ch);
        }
        return chars;
    }

    public static void findXinWord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word and a number: ");
        String word = sc.nextLine();
        int number = sc.nextInt();
        char charAtXPoint = word.charAt(number - 1);
        System.out.print(charAtXPoint);
    }
}

