package laura.uebungsprojekt.aufgaben;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Person {
    public Person() {
        name = namen.get(randomNum);
        alter = altersklassen.get(randomNum);
        geschlecht = geschlechter.get(randomNum);
        augenfarbe = augenfarben.get(randomNum);
    }

    private int randomNum = ThreadLocalRandom.current().nextInt(1, 3);

    public String name;
    public int alter;
    public String geschlecht;
    public String augenfarbe;

    private ArrayList<String> namen = new ArrayList<>(Arrays.asList("Klaus", "Hans", "Petra"));
    private ArrayList<Integer> altersklassen = new ArrayList<>(Arrays.asList(23, 45, 56));
    private ArrayList<String> geschlechter = new ArrayList<>(Arrays.asList("männlich", "weiblich", "divers"));
    private ArrayList<String> augenfarben = new ArrayList<>(Arrays.asList("blau", "grün", "braun"));
}
