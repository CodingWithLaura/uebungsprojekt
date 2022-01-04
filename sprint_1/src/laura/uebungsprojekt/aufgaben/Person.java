package laura.uebungsprojekt.aufgaben;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

public class Person {
    private String test;
    public Person() {
        name = namen.get(randomNum);
        alter = altersklassen.get(randomNum);
        geschlecht = geschlechter.get(randomNum);
        augenfarbe = augenfarben.get(randomNum);
    }

    private int randomNum = ThreadLocalRandom.current().nextInt(1, 3);
    //TODO getter und setter angucken und ändern
    //TODO Welche Reihenfolge der Attribute usw in einer Klasse in Java

    public String name;
    public int alter;
    public String geschlecht;
    public String augenfarbe;

    private ArrayList<String> namen = new ArrayList<>(Arrays.asList("Klaus", "Hans", "Petra"));
    private ArrayList<Integer> altersklassen = new ArrayList<>(Arrays.asList(23, 45, 56));
    private ArrayList<String> geschlechter = new ArrayList<>(Arrays.asList("männlich", "weiblich", "divers"));
    private ArrayList<String> augenfarben = new ArrayList<>(Arrays.asList("blau", "grün", "braun"));

    public int personAlternLassen(Optional<Integer> altern) {
        //TODO Methode Überladen (2 Methoden mit versch Parametern)
        if (altern.isPresent()) {
            int number = Integer.parseInt(altern.toString());
            this.alter = alter + number;
        } else {
            this.alter += 1;
        }
        return this.alter;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}

