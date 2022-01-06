package laura.uebungsprojekt.aufgaben;

public class Person {

    private final String name;
    private int alter;
    private final String geschlecht;
    private final String augenfarbe;

    public Person(String name, int alter, String geschlecht, String augenfarbe) {
        this.name = name;
        this.alter = alter;
        this.geschlecht = geschlecht;
        this.augenfarbe = augenfarbe;
    }

    public String getName() {
        return name;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public String getAugenfarbe() {
        return augenfarbe;
    }

    public int getAlter() {
        return alter;
    }

    public void personAlternLassen() {
        this.alter += 1;
    }

    public void personAlternLassen(int altern) {
        this.alter += altern;
    }
}

