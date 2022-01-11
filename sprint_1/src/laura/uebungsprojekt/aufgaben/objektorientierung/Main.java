package laura.uebungsprojekt.aufgaben.objektorientierung;

public class Main {

    public static void main(String[] args) {
        /*Schüler schüler1 = new Schüler("Michael", 13, "", "","Mathe");
        Schüler schüler2 = new Schüler("Daniel", 13, "", "","Bio");
        Schüler schüler3 = new Schüler("Lisa", 13, "", "","Musik");

        Elternteil papa = new Elternteil("Heinz", 54, "", "");
        Elternteil mama = new Elternteil("Henriette", 54, "", "");

        Person[] personen = {schüler1, schüler2, schüler3, papa, mama};

        for (Person person : personen)
        {
            person.reden();
        }*/

        ComputerTimeProvider foo = new ComputerTimeProvider();
        foo.showSystemTime();
        foo.showUTCTime();
    }
}
