package laura.uebungsprojekt.aufgaben.objektorientierung;

import java.util.List;

public class Spieler<TWuerfel extends Wuerfel<TSeite>, TSeite> {
    private Wuerfelbecher<TWuerfel, TSeite> becher;

    public Spieler(Wuerfelbecher<TWuerfel, TSeite> becher){
        this.becher = becher;
    }

    public List<TSeite> wuerfeln(){
        return this.becher.wurf();
    }

    public boolean paschErkennen(List<TSeite> wurf){
        return wurf.isEmpty() || wurf.stream().allMatch(wurf.get(0)::equals);
    }
}
