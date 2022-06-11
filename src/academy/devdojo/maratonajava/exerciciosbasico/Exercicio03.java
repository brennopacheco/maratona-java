package academy.devdojo.maratonajava.exerciciosbasico;

public class Exercicio03 {
    public static void main(String[] args) {
        /*
        * Informar um saldo e imprimir o saldo com reajuste de 1%.
        * */

        double saldo = 10000;
        double reajuste = saldo + (saldo*0.01);

        System.out.println("Seu saldo com reajuste de 1% é: " + reajuste);
    }
}
