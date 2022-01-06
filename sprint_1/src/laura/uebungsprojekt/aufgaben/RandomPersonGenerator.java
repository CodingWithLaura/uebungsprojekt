package laura.uebungsprojekt.aufgaben;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class RandomPersonGenerator {

    public static Person generate(){
        int randomNum = ThreadLocalRandom.current().nextInt(1, 3);
        List<String> namen = Arrays.asList("Klaus", "Hans", "Petra");
        List<Integer> altersklassen = Arrays.asList(23, 45, 56);
        List<String> geschlechter = Arrays.asList("männlich", "weiblich", "divers");
        List<String> augenfarben = Arrays.asList("blau", "grün", "braun");

        return new Person(
                namen.get(randomNum),
                altersklassen.get(randomNum),
                geschlechter.get(randomNum),
                augenfarben.get(randomNum)
        );
    }
}
