package laura.uebungsprojekt.aufgaben.objektorientierung;

import java.util.List;
import java.util.stream.Collectors;

public class Wuerfelbecher<TWuerfel extends Wuerfel<TSeite>, TSeite> {
    public List<TWuerfel> wuerfel;

    public Wuerfelbecher(List<TWuerfel> wuerfel) {
        this.wuerfel = wuerfel;
    }

    public List<TSeite> wurf() {
        return this.wuerfel.stream().map( w -> w.wuerfeln()).collect(Collectors.toList());
    }
}

