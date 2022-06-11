package academy.devdojo.maratonajava.exerciciosbasico;

public class Exercicio05 {
    public static void main(String[] args) {
        /*
         * Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule a quantidade
         * de salários mínimos esse usuário ganha e imprima o resultado. (1SM=R$788,00)
         * */

        double salarioMinimo = 788.00;
        double salarioUsuario = 8320.68;

        double qtdSalarioMinimoQueUsuarioGanha = salarioUsuario / salarioMinimo;

        System.out.printf("A quantidade de salários mínimos que o usuário ganha é: %.2f %n", qtdSalarioMinimoQueUsuarioGanha);
        // %.2f - pega o argumento e imprime com 2 casas depois da vírgula.
        // %n - passa para a próxima linha (equivalente ao println()).
    }
}
