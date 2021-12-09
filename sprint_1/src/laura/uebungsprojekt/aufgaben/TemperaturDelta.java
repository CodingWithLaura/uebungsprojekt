package laura.uebungsprojekt.aufgaben;

import static java.lang.StrictMath.abs;

public class TemperaturDelta {

    public int tag_1;
    public int tag_2;
    public int temperatur_tag1;
    public int temperatur_tag2;
    public int delta(){
        return abs(temperatur_tag1 - temperatur_tag2);
    }

    @Override
    public String toString() {
        return "TemperaturDelta{" +
                "tag_1=" + tag_1 +
                ", tag_2=" + tag_2 +
                ", delta =" + delta() +
                '}';
    }

    public TemperaturDelta(int tag1, int tag2, int temperatur_1, int temperatur_2){
        this.tag_1 = tag1 + 1;
        this.tag_2 = tag2 + 1;
        this.temperatur_tag1 = temperatur_1;
        this.temperatur_tag2 = temperatur_2;
    }
}
