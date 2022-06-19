package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula09LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome abaixo:");
        String nome = input.nextLine();

        System.out.println("Digite sua idade abaixo:");
        int idade = input.nextInt();

        System.out.println("Digite M ou F para sexo:");
        char sexo = input.next().charAt(0);


        System.out.println("-----------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);

    }
}
