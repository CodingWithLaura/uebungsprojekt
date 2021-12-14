package laura.uebungsprojekt.aufgaben;

import java.util.Scanner;

public class UPLK85_LottoLaesstGruessen {
    public static void lotto(){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i,fact = 1;
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.print("The factorial of " + number + " is: " + fact);
    }
}
