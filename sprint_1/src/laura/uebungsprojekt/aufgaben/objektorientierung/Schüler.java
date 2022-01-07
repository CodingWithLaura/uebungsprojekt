package laura.uebungsprojekt.aufgaben.objektorientierung;

public class Schüler extends Person {

    private String schwerpunkt;

    public Schüler(String name, int alter, String geschlecht, String augenfarbe, String schwerpunkt) {
        super(name, alter, geschlecht, augenfarbe);
        this.schwerpunkt = schwerpunkt;
    }

    @Override
    public void reden() {
        System.out.println("Der Schüler " + this.getName() + " hat folgenden Schwerpunkt: " + schwerpunkt);
    }
}
