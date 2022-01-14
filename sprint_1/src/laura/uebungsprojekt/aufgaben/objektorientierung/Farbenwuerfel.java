package laura.uebungsprojekt.aufgaben.objektorientierung;

import java.util.Arrays;
import java.util.List;

public class Farbenwuerfel extends Wuerfel<Farbenwuerfel.Farbe>{

    protected Farbenwuerfel(int seitenzahl) {
        super(seitenzahl);
        if(seitenzahl > 6){
            throw new IllegalArgumentException("Mehr als 6 Seiten sind nicht erlaubt");
        }
    }

    public enum Farbe {
        BLAU,
        LILA,
        GRUEN,
        ROT,
        ORANGE,
        GELB
    }

    private List<Farbe> farben = Arrays.asList(Farbe.values());

    @Override
    public Farbe wuerfeln() {
        int index = this.randomize();
        return farben.get(index);
    }
}
