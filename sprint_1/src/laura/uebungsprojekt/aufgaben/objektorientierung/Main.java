package laura.uebungsprojekt.aufgaben.objektorientierung;

import laura.uebungsprojekt.aufgaben.objektorientierung.designpatterns.Context;
import laura.uebungsprojekt.aufgaben.objektorientierung.designpatterns.OperationAdd;
import laura.uebungsprojekt.aufgaben.objektorientierung.designpatterns.OperationMultiply;
import laura.uebungsprojekt.aufgaben.objektorientierung.designpatterns.OperationSubstract;

public class Main {

    public static void main(String[] args) {
        /*Schüler schüler = new Schüler("Michael", 13, "", "","");*/

        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }

}

