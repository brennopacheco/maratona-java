package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06Exercicio {
    public static void main(String[] args) {
        // Using Switch. Given the values from 1 to 7, print if it is a working day or weekend
        // Considering 1 as Sunday

        byte day = 3;
        switch (day) {
            case 1:
            case 7:
                System.out.println("Weekend");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Working day");
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }
    }
}
