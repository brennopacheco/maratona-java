package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Brenno";
        funcionario.idade = 25;
        funcionario.salarios = new double[]{2500, 5730.68, 8490.12};
//
//        funcionario.imprimeDados();
//        funcionario.mediaSalarios();
//        System.out.println("-------------");
        funcionario.imprime();
    }
}