package laura.uebungsprojekt.aufgaben.objektorientierung;

import java.util.Random;

public abstract class Wuerfel<T> {
    final protected int seitenzahl;
    final private Random rand;
    private static final Random seedGenerator = new Random(System.currentTimeMillis());

    protected Wuerfel(int seitenzahl) {
        this.seitenzahl = seitenzahl;
        rand = new Random(seedGenerator.nextInt());
    }

    protected int randomize() {
        return rand.nextInt(this.seitenzahl);
    }

    public abstract T wuerfeln();
}
