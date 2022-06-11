package academy.devdojo.maratonajava.exerciciosbasico;

public class Exercicio01 {
    public static void main(String[] args) {
        /*
         *Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa em dias.
         * Leve em consideração o ano com 365 dias e o mês com 30. (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
         * */

        int anos = 25;
        int meses = 10;
        int dias = 5;

        int calculoIdade = (anos * 365) + (meses * 30) + (dias);
        System.out.println("Você têm: " + calculoIdade + " dias.");
    }
}
