package laura.uebungsprojekt.aufgaben.objektorientierung;

public class Elternteil extends Person {
    public Elternteil(String name, int alter, String geschlecht, String augenfarbe) {
        super(name, alter, geschlecht, augenfarbe);
    }

    @Override
    public void reden(){
        System.out.println("Ich als Elternteil, sage: ");
    }
}
