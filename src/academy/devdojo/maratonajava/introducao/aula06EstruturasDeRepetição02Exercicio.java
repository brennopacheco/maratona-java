package academy.devdojo.maratonajava.introducao;

public class aula06EstruturasDeRepetição02Exercicio {
    public static void main(String[] args) {
        // Print all even number from 0 to 1.000.000

        // Using For
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // Using While
        int j = 1;
        while (j <= 1000) {
            if (j % 2 == 0) {
                System.out.println(j++);
            } else {
                j++;
            }
        }
    }
}
