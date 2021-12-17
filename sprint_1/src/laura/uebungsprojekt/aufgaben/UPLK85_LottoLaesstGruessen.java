package laura.uebungsprojekt.aufgaben;


public class UPLK85_LottoLaesstGruessen {
    public static int calcFaculty(int number) {
        if(number < 0){
            throw new ArithmeticException("Negative numbers are not defined for faculty calculation");
        }
        int faculty = 1;

        for (int i = 1; i <= number; i++) {
            faculty = faculty * i;
        }

        return faculty;
    }
}
