package academy.devdojo.maratonajava.exerciciosbasico;

public class Exercicio02 {
    public static void main(String[] args) {
        /*
         * Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos números 4, 5 e 6.
         * A soma das duas médias. A média das médias.
         * */

        double mediaAritmetica01 = (9 + 7 + 8) / 3;
        double mediaAritmetica02 = (4 + 5 + 6) / 3;

        double somaMedias = mediaAritmetica01 + mediaAritmetica02;
        double mediaDasMedias = somaMedias / 2;

        System.out.println("A media aritmética de 8,9 e 7 é: " + mediaAritmetica01);
        System.out.println("A media aritmética de 4, 5 e 6 é: " + mediaAritmetica02);
        System.out.println("A soma das duas médias soma: " + somaMedias);
        System.out.println("A média das dmédias são: " + mediaDasMedias);

    }
}
