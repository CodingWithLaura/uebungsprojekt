package laura.uebungsprojekt;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter two numbers which will be added up: ");
        Scanner input = new Scanner(System.in);
        int number_one = input.nextInt();
        int number_two = input.nextInt();
        System.out.print(number_one + number_two);
    }
}
