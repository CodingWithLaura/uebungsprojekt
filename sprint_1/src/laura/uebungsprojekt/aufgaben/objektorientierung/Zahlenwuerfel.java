package laura.uebungsprojekt.aufgaben.objektorientierung;

public class Zahlenwuerfel extends Wuerfel<Integer>{

    protected Zahlenwuerfel(int seitenzahl) {
        super(seitenzahl);
    }

    @Override
    public Integer wuerfeln() {
        return this.randomize();
    }
}
