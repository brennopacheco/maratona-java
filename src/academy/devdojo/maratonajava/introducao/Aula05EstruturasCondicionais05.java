package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // Switch
        /*
        restrições para condições do Switch: char, int, byte, short, enum, String

        switch (expressão) {
            case value_1:
                statement_1;
                break;
            case value_2:
                statement_2;
                break;
        }
         */

        // print the day of the week, considering 1 as Sunday
        byte day = 5;
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid option");
        }

        char sexo = 'M';
        switch (sexo) {
            case 'M':
                System.out.println("Man");
                break;
            case 'F':
                System.out.println("Woman");
                break;
            default:
                System.out.println("Invalid");
                break;
        }

    }
}
