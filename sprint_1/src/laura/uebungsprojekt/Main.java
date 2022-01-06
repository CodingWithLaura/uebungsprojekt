package laura.uebungsprojekt;

import laura.uebungsprojekt.aufgaben.Person;
import laura.uebungsprojekt.aufgaben.RandomPersonGenerator;

public class Main {

    public static void main(String[] args) {
        Person foo = RandomPersonGenerator.generate();
        System.out.println(foo);
    }
}
