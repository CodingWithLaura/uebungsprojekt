package laura.uebungsprojekt.aufgaben.objektorientierung;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*List<Zahlenwuerfel> zahlenwuerfel = Arrays.asList(new Zahlenwuerfel(6), new Zahlenwuerfel(6));
        Wuerfelbecher<Zahlenwuerfel, Integer> wuerfelbecher1 = new Wuerfelbecher<>(zahlenwuerfel);
        Spieler<Zahlenwuerfel, Integer> spieler1 = new Spieler<>(wuerfelbecher1);

        List<Integer> wurf;
        int zaehler = 0;
        do {
            wurf = spieler1.wuerfeln();
            System.out.println(wurf);
            zaehler += 1;
        } while (!spieler1.paschErkennen(wurf));
        System.out.println(zaehler);*/

        /*List<Farbenwuerfel> farbenwuerfel = Arrays.asList(new Farbenwuerfel(4), new Farbenwuerfel(4));
        Wuerfelbecher<Farbenwuerfel, Farbenwuerfel.Farbe> wuerfelbecher2 = new Wuerfelbecher<>(farbenwuerfel);
        Spieler<Farbenwuerfel, Farbenwuerfel.Farbe> spieler2 = new Spieler<>(wuerfelbecher2);

        List<Farbenwuerfel.Farbe> wurf2;
        int zaehler2 = 0;
        do {
            wurf2 = spieler2.wuerfeln();
            System.out.println(wurf2);
            zaehler2 += 1;
        } while (!spieler2.paschErkennen(wurf2));
        System.out.println(zaehler2);*/

        Paar<Integer> paar = new Paar<>(5,7);

    }
}
