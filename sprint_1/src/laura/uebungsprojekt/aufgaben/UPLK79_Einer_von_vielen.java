package laura.uebungsprojekt.aufgaben;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UPLK79_Einer_von_vielen {

    private static List<Character> convertStringToCharList(String str) {
        List<Character> chars = new ArrayList<>();
        for (char ch : str.toCharArray()) {
            chars.add(ch);
        }
        return chars;
    }

    public static void findXinWord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word and a number: " );
        String word = sc.nextLine();
        int number = sc.nextInt();
        List<Character> charList = convertStringToCharList(word);
        char charAtXPoint = charList.get(number - 1);
        System.out.print(charAtXPoint);
    }
}
