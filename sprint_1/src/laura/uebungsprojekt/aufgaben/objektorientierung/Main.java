package laura.uebungsprojekt.aufgaben.objektorientierung;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Schüler michael = new Schüler("Michael", 16, "", "", "Mathe");
        Schüler daniel = new Schüler("Daniel", 13, "", "", "Bio");
        Schüler lisa = new Schüler("Lisa", 10, "", "", "Musik");

        System.out.println(michael.compareTo(daniel));

        Elternteil papa = new Elternteil("Heinz", 58, "", "");
        Elternteil mama = new Elternteil("Henriette", 54, "", "");

        Person[] personen = {michael, daniel, lisa, papa, mama};
        var sortiertePersonen = Arrays.stream(personen).sorted().collect(Collectors.toList());
        for (Person person : sortiertePersonen) {
            System.out.println(person.name);
        }

        Arrays.sort(personen);
        for (Person person : personen) {
            System.out.println(person.name);
        }

        ComputerTimeProvider foo = new ComputerTimeProvider();
        foo.showSystemTime();
        foo.showUTCTime();
    }
}
