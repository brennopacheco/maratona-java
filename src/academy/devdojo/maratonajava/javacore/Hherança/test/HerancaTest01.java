package academy.devdojo.maratonajava.javacore.Hherança.test;

import academy.devdojo.maratonajava.javacore.Hherança.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hherança.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hherança.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereço = new Endereco();

        endereço.setRua("Av. Brasil");
        endereço.setCEP("012345-012");

        Pessoa pessoa = new Pessoa("João");
        pessoa.setEndereço(endereço);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Brennp");
        funcionario.setCPF("000.000.000-00");
        funcionario.setEndereço(endereço);
        funcionario.setSalario(27000);
        System.out.println("-----------");
        funcionario.imprime();
    }
}
