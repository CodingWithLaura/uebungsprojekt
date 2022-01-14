package laura.uebungsprojekt.aufgaben.objektorientierung;

public class Paar<T extends Comparable<T>>{
    private final T first;
    private final T second;

    public Paar(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public String whichIsGreater(){
        int compare = this.first.compareTo(this.second);
        if(compare == 0){
            return "Beide Werte sind gleich";
        }
        return compare > 0 ? "Der erste Wert ist Größer" : "Der Zweite Wert ist größer";
    }
}
